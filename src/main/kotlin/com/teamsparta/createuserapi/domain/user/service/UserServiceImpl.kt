package com.teamsparta.createuserapi.domain.user.service

import com.teamsparta.createuserapi.domain.user.dto.CreateUserRequest
import com.teamsparta.createuserapi.domain.user.dto.UserResponse
import org.springframework.stereotype.Service

@Service
class UserServiceImpl: UserService {
    override fun createUser(request: CreateUserRequest) : UserResponse {
        //TODO: requset를 User로 변환 후  DB에 저장
        TODO()
    }
}