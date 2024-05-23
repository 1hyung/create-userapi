package com.teamsparta.createuserapi.domain.user.controller

import com.teamsparta.createuserapi.domain.exception.ModelNotFoundException
import com.teamsparta.createuserapi.domain.exception.dto.ErrorResponse
import com.teamsparta.createuserapi.domain.user.dto.CreateUserRequest
import com.teamsparta.createuserapi.domain.user.dto.UpdateUserRequest
import com.teamsparta.createuserapi.domain.user.dto.UserResponse
import com.teamsparta.createuserapi.domain.user.service.UserServiceImpl
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@RequestMapping("/users")
@RestController
class UserController(
    private val userService: UserServiceImpl,
) {

    @PostMapping
    fun createUser(@RequestBody createUserRequest: CreateUserRequest): ResponseEntity<UserResponse> {
        try {
            val result = userService.createUser(createUserRequest)
            return ResponseEntity.status(HttpStatus.CREATED).body(result)
        } catch (ex: RuntimeException) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(null)
        }
    }

    @ExceptionHandler(ModelNotFoundException::class)
    fun handleModelNotFound(e: ModelNotFoundException): ResponseEntity<ErrorResponse> {
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(ErrorResponse(e.message))
    }
}