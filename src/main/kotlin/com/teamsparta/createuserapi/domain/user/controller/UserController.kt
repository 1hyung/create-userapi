package com.teamsparta.createuserapi.domain.user.controller

import com.teamsparta.createuserapi.domain.user.dto.CreateUserRequest
import com.teamsparta.createuserapi.domain.user.dto.UpdateUserRequest
import com.teamsparta.createuserapi.domain.user.dto.UserResponse
import com.teamsparta.createuserapi.domain.user.service.UserService
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@RequestMapping("/users")
@RestController
class UserController(
    private val userService: UserService
) {
    @GetMapping()
    fun getUsersList(): ResponseEntity<List<UserResponse>> {
        return ResponseEntity.status(HttpStatus.OK).body(userService.getAllUserList())
    }

    @GetMapping("/{userId}")
    fun getUser(@PathVariable userId: Long): ResponseEntity<UserResponse> {
        return ResponseEntity.status(HttpStatus.CREATED).body(UserService.createUser(createUserRequest))
    }

    @PostMapping
    fun createUser(@RequestBody createUserRequest: CreateUserRequest): ResponseEntity<UserResponse> {
        TODO("not implemented")
    }

    @PutMapping("/{userId}")
    fun updateUser(
        @PathVariable userId: Long,
        @RequestBody updateUserRequest: UpdateUserRequest,
    ): ResponseEntity<UserResponse> {
        TODO("not implemented")
    }

    @DeleteMapping("/{userId}")
    fun deleteUser(@PathVariable userId: Long): ResponseEntity<Unit> {
        TODO("not implemented")
    }
}