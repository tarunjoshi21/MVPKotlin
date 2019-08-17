package com.example.mvpkotlin

interface LoginView {
    fun showProgress()
    fun hideProgress()
    fun setUserNameError()
    fun setPasswordError()
    fun navigateToHome()
}