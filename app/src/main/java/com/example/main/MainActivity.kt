package com.example.main

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.toastmodule.ShowToast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        ShowToast().ToastFun(this,"Get it from Module!")
    }
}