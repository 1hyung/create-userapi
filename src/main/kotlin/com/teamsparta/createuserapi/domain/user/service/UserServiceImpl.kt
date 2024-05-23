package com.teamsparta.createuserapi.domain.user.service

import com.teamsparta.createuserapi.domain.user.dto.CreateUserRequest
import com.teamsparta.createuserapi.domain.user.dto.UserResponse
import com.teamsparta.createuserapi.domain.user.model.User
import com.teamsparta.createuserapi.domain.user.repository.UserRepository
import jakarta.transaction.Transactional
import org.springframework.stereotype.Service

@Service
class UserServiceImpl(
    private val userRepository: UserRepository,
) {


    @Transactional
     fun createUser(request: CreateUserRequest) : UserResponse {
        //TODO: requset를 User로 변환 후  DB에 저장
        if (request.name.length > 10) {
            throw RuntimeException()
        }
        val user = userRepository.save(User(request.name))
        userRepository.delete()
        userRepository.findById(request.id!!)
        return UserResponse(user.id!!,user.name)
    }
}