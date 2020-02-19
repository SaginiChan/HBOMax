package com.example.hbo2

import android.content.Intent
import android.content.SharedPreferences
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.example.hbo2.R.layout.onboarding
import kotlinx.android.synthetic.main.onboarding.*



class OnBoardingActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(onboarding)

        ob_button.setOnClickListener {
            Log.d( "OnBoardingActivity" , "Show if OB Activity 2 has been entered" )

            //CODE FOR MOVING TO THE NEXT XML PAGE

            val intent = Intent(this, OnBoardingActivity2::class.java )
            startActivity(intent)

            overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left)

        }
    }
}