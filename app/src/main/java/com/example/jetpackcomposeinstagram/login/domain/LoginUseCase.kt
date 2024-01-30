package com.example.jetpackcomposeinstagram.login.domain

import com.example.jetpackcomposeinstagram.login.data.network.LoginRepository

class LoginUseCase {
    private val repository = LoginRepository()

    suspend operator fun invoke(user:String, password:String):Boolean{
        return repository.doLogin(user, password)
    }
}