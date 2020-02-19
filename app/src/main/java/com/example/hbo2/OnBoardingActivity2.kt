package com.example.hbo2

import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.onboarding.*
import kotlinx.android.synthetic.main.onboarding2.*

class OnBoardingActivity2 :AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.onboarding2)


        ob_button2.setOnClickListener {
            Log.d("OnBoardingActivity", "Show if OB Activity 2 has been entered")

            //CODE FOR MOVING TO THE NEXT XML PAGE

            val intent = Intent(this, OnBoardingActivity3::class.java)
            startActivity(intent)

            overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left)
        }
    }
}
