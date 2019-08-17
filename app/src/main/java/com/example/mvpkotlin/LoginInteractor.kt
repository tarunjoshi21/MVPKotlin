package com.example.mvpkotlin

import android.os.Handler

class LoginInteractor {
    interface OnLoginFinishedListener {
        fun onUsernameError()
        fun onPasswordError()
        fun onSuccess()
    }

    fun login(username: String, password: String, loginListener: OnLoginFinishedListener) {
        Handler().postDelayed({
            when{
                username.isEmpty() -> loginListener.onUsernameError()
                password.isEmpty() -> loginListener.onPasswordError()
                else -> loginListener.onSuccess()
            }
        },2000)

    }
}