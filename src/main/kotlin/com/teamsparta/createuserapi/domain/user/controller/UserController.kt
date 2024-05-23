package com.teamsparta.createuserapi.domain.user.controller

import com.teamsparta.createuserapi.domain.user.dto.CreateUserRequest
import com.teamsparta.createuserapi.domain.user.dto.UpdateUserRequest
import com.teamsparta.createuserapi.domain.user.dto.UserResponse
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@RequestMapping("/users")
@RestController
class UserController {

    @GetMapping("/{userId}")
    fun getUser(@PathVariable userId: Long): ResponseEntity<UserResponse> {
        TODO("not implemented")
    }

    @GetMapping()
    fun getUsersList(): ResponseEntity<List<UserResponse>> {
        TODO("not implemented")
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