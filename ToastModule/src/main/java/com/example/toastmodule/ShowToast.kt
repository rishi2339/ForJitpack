package com.example.toastmodule

import android.content.Context
import android.widget.Toast

class ShowToast {
    fun ToastFun(context: Context,msg:String){
        Toast.makeText(context,msg,Toast.LENGTH_SHORT).show()
    }
}