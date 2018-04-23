package com.nickagas.plainsimplemvvmlogin.ViewModel

import android.arch.lifecycle.ViewModel
import android.arch.lifecycle.ViewModelProvider
import com.nickagas.plainsimplemvvmlogin.Interface.LoginResultCallback

class LoginViewModelFactory(private val listener:LoginResultCallback): ViewModelProvider.NewInstanceFactory() {
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        return LoginViewModel(listener) as T
    }
}