package com.example.mvpkotlin

import com.example.mvpkotlin.LoginInteractor.OnLoginFinishedListener

class LoginPresenter(var loginView: LoginView?, val loginInteractor: LoginInteractor) : OnLoginFinishedListener {

    fun validateCredential(username: String, password: String) {
        loginView?.showProgress()
        loginInteractor.login(username, password, this)
    }

    fun onDestroy() {
        loginView = null
    }

    override fun onUsernameError() {
        loginView?.apply {
            setUserNameError()
            hideProgress()
        }
    }

    override fun onPasswordError() {
        loginView?.apply {
            setPasswordError()
            hideProgress()
        }
    }

    override fun onSuccess() {
        loginView?.apply {
            hideProgress()
            navigateToHome()
        }
    }
}