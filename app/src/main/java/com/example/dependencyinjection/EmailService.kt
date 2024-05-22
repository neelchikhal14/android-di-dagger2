package com.example.dependencyinjection

import android.util.Log

class EmailService {

    fun sendEmail(to:String,from:String,body:String?){
Log.d("sendEmail fn","EMail sent")
    }
}