package com.ajeng.uts_19092002.activity.login

import com.ajeng.uts_19092002.model.User

interface LoginView {
    fun onSuccessLogin(user: User?)
    fun onErrorLogin(msg: String?)
}