package com.teamsparta.createuserapi.domain.user.model

import jakarta.persistence.*

@Entity
@Table(name = "users")
class User(
    var name: String,
) {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long? = null
}
