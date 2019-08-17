package com.example.mvpkotlin

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), LoginView {

    private val presenter = LoginPresenter(this, LoginInteractor())

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        button.setOnClickListener({ validateCredentials() })
    }

    private fun validateCredentials() {
        presenter.validateCredential(editText.text.toString().trim(), editText2.text.toString().trim())
    }

    override fun onDestroy() {
        presenter.onDestroy()
        super.onDestroy()
    }

    override fun showProgress() {
       progressBar.visibility = View.VISIBLE
    }

    override fun hideProgress() {
        progressBar.visibility = View.GONE
    }

    override fun setUserNameError() {
        editText.error = "Username can not be empty"
    }

    override fun setPasswordError() {
        editText2.error = "Password can not be empty"
    }

    override fun navigateToHome() {
        Toast.makeText(this, "You can call a Home Activity from there", Toast.LENGTH_SHORT).show()
    }

}
