package com.nickagas.plainsimplemvvmlogin.Model

import android.databinding.BaseObservable
import android.text.TextUtils
import android.util.Patterns
import java.util.regex.Pattern

class User(private var email:String,  var password:String): BaseObservable() {

    val isDataValid:Boolean
    get() = (!TextUtils.isEmpty(email) &&
            Patterns.EMAIL_ADDRESS.matcher(email).matches() &&
            password.length > 6
            )

    fun setEmail(email:String){
        this.email=email
    }






}