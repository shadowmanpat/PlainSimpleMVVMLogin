package com.nickagas.plainsimplemvvmlogin.View

import android.arch.lifecycle.ViewModelProviders
import android.databinding.DataBindingUtil
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.nickagas.plainsimplemvvmlogin.Interface.LoginResultCallback
import com.nickagas.plainsimplemvvmlogin.R
import com.nickagas.plainsimplemvvmlogin.ViewModel.LoginViewModel
import com.nickagas.plainsimplemvvmlogin.ViewModel.LoginViewModelFactory
import com.nickagas.plainsimplemvvmlogin.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(),LoginResultCallback {
    override fun onSuceess(message: String) {
        Toast.makeText(this,message,Toast.LENGTH_SHORT).show()

    }

    override fun onError(messsage: String) {
        Toast.makeText(this,messsage,Toast.LENGTH_SHORT).show()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
     //   setContentView(R.layout.activity_main)
        val activityMainBinding = DataBindingUtil.setContentView<ActivityMainBinding>(this,R.layout.activity_main)
        activityMainBinding.viewModel = ViewModelProviders.of(this,LoginViewModelFactory(this)).get(LoginViewModel::class.java)
    }
}
