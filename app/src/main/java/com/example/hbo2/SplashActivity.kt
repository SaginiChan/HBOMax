package com.example.hbo2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.hbo2.R.layout.splash_screen
import java.lang.Exception

class SplashActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(splash_screen)
        
        val background = object : Thread(){
            override fun run() {
                try {
                    Thread.sleep( 5000  )
                    val intent = Intent (baseContext,OnBoardingActivity::class.java)
                    startActivity( intent)
                }catch (e: Exception) {
                    e.printStackTrace()
                }

            }
        }

        background.start()
    }
}
