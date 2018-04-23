package com.nickagas.plainsimplemvvmlogin.ViewModel

import android.arch.lifecycle.ViewModel
import android.text.Editable
import android.text.TextWatcher
import android.view.View
import com.nickagas.plainsimplemvvmlogin.Interface.LoginResultCallback
import com.nickagas.plainsimplemvvmlogin.Model.User

class LoginViewModel(private var listener:LoginResultCallback):ViewModel() {

    private val user:User = User("","")

    val emailTextWatcher:TextWatcher
    get() = object:TextWatcher{
        override fun afterTextChanged(p0: Editable?) {
            user.setEmail(p0.toString())
        }

        override fun beforeTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {

        }

        override fun onTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {

        }

    }
    val passwordTextWatcher:TextWatcher
        get() = object:TextWatcher{
            override fun afterTextChanged(p0: Editable?) {
                user.password =p0.toString()
            }

            override fun beforeTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {

            }

            override fun onTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {

            }

        }

    //Funtion to process Login Button
    fun onLoginClicled(v: View){
       if(user.isDataValid){
           listener.onSuceess("Login Success")
       }else{
           listener.onError("Login Error")
       }
    }

}