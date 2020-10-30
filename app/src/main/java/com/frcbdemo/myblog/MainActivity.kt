package com.frcbdemo.myblog

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import com.frcbdemo.myblog.auth.SignUp

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val SPLASH_TIME_OUT:Long=3000

        Handler().postDelayed({
        startActivity(Intent(this,SignUp::class.java))
            finish()
        }, SPLASH_TIME_OUT)



    }
}