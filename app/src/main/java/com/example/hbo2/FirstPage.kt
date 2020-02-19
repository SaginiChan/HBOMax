package com.example.hbo2

import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.example.hbo2.R.layout.firstpage
import kotlinx.android.synthetic.main.firstpage.*

class FirstPage : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(firstpage)

        hbo_button.setOnClickListener {
            Log.d("OnBoardingActivity", "Show if OB Activity 2 has been entered")

            //CODE FOR MOVING TO THE NEXT XML PAGE

            val intent = Intent(this, HboActivity::class.java)
            startActivity(intent)
        }
        cw_button.setOnClickListener {
            Log.d("OnBoardingActivity", "Show if OB Activity 2 has been entered")

            //CODE FOR MOVING TO THE NEXT XML PAGE

            val intent = Intent(this, CwActivity::class.java)
            startActivity(intent)
        }
        dc_button.setOnClickListener {
            Log.d("OnBoardingActivity", "Show if OB Activity 2 has been entered")

            //CODE FOR MOVING TO THE NEXT XML PAGE

            val intent = Intent(this, DcActivity::class.java)
            startActivity(intent)
        }

}}