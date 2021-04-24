package com.ajeng.uts_19092002.activity.register.presenter

interface RegisterView {
    fun onSuccessRegister()
    fun onErrorRegister(msg: String?)
}