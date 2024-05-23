package com.teamsparta.createuserapi.domain.user.service

import com.teamsparta.createuserapi.domain.user.dto.CreateUserRequest
import com.teamsparta.createuserapi.domain.user.dto.UserResponse

interface UserService {
    fun createUser(request: CreateUserRequest) : UserResponse
}