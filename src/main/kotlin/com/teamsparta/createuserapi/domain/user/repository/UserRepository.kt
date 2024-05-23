package com.teamsparta.createuserapi.domain.user.repository

import com.teamsparta.createuserapi.domain.user.model.User
import org.springframework.data.jpa.repository.JpaRepository

interface UserRepository:JpaRepository<User, Long> {
}