package com.example.hbo2

import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.example.hbo2.R.layout.cwpage
import kotlinx.android.synthetic.main.cwpage.*
import kotlinx.android.synthetic.main.dcpage.*
import kotlinx.android.synthetic.main.onboarding2.*

class CwActivity  : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(cwpage)

        originals.setOnClickListener {
            Log.d("OnBoardingActivity", "Show if OB Activity 2 has been entered")

            //CODE FOR MOVING TO THE NEXT XML PAGE

            val intent = Intent(this, OriginalsActivity::class.java)
            startActivity(intent)
        }
        walking_dead.setOnClickListener {
            Log.d("OnBoardingActivity", "Show if OB Activity 2 has been entered")

            //CODE FOR MOVING TO THE NEXT XML PAGE

            val intent = Intent(this, TheWalkingDeadActivity::class.java)
            startActivity(intent)
        }
        supernatural.setOnClickListener {
            Log.d("OnBoardingActivity", "Show if OB Activity 2 has been entered")

            //CODE FOR MOVING TO THE NEXT XML PAGE

            val intent = Intent(this, SupernaturalActivity::class.java)
            startActivity(intent)
        }
        vampire_diaries.setOnClickListener {
            Log.d("OnBoardingActivity", "Show if OB Activity 2 has been entered")

            //CODE FOR MOVING TO THE NEXT XML PAGE

            val intent = Intent(this, VampireDiariesActivity::class.java)
            startActivity(intent)
        }
        riverdale.setOnClickListener {
            Log.d("OnBoardingActivity", "Show if OB Activity 2 has been entered")

            //CODE FOR MOVING TO THE NEXT XML PAGE

            val intent = Intent(this, RiverdaleActivity::class.java)
            startActivity(intent)
        }
        the100.setOnClickListener {
            Log.d("OnBoardingActivity", "Show if OB Activity 2 has been entered")

            //CODE FOR MOVING TO THE NEXT XML PAGE

            val intent = Intent(this, The100Activity::class.java)
            startActivity(intent)
        }
    }
}