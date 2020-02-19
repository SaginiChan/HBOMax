package com.example.hbo2

import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.hbopage.*

class HboActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.hbopage)

        euphoria.setOnClickListener {
            Log.d("OnBoardingActivity", "Show if OB Activity 2 has been entered")

            //CODE FOR MOVING TO THE NEXT XML PAGE

            val intent = Intent(this, EuphoriaActivity::class.java)
            startActivity(intent)
        }
        biglittlelies.setOnClickListener {
            Log.d("OnBoardingActivity", "Show if OB Activity 2 has been entered")

            //CODE FOR MOVING TO THE NEXT XML PAGE

            val intent = Intent(this, BiglittleliesActivity::class.java)
            startActivity(intent)
        }
        westworld.setOnClickListener {
            Log.d("OnBoardingActivity", "Show if OB Activity 2 has been entered")

            //CODE FOR MOVING TO THE NEXT XML PAGE

            val intent = Intent(this, WestworldActivity::class.java)
            startActivity(intent)
        }
        barry.setOnClickListener {
            Log.d("OnBoardingActivity", "Show if OB Activity 2 has been entered")

            //CODE FOR MOVING TO THE NEXT XML PAGE

            val intent = Intent(this, BarryActivity::class.java)
            startActivity(intent)
        }

        gameofthrones.setOnClickListener {
            Log.d("OnBoardingActivity", "Show if OB Activity 2 has been entered")

            //CODE FOR MOVING TO THE NEXT XML PAGE

            val intent = Intent(this, GameOfThrones::class.java)
            startActivity(intent)
        }
        succession.setOnClickListener {
            Log.d("OnBoardingActivity", "Show if OB Activity 2 has been entered")

            //CODE FOR MOVING TO THE NEXT XML PAGE

            val intent = Intent(this, SuccessionActivity::class.java)
            startActivity(intent)
        }
        veep.setOnClickListener {
            Log.d("OnBoardingActivity", "Show if OB Activity 2 has been entered")

            //CODE FOR MOVING TO THE NEXT XML PAGE

            val intent = Intent(this, VeepActivity::class.java)
            startActivity(intent)
        }
        truedetective.setOnClickListener {
            Log.d("OnBoardingActivity", "Show if OB Activity 2 has been entered")

            //CODE FOR MOVING TO THE NEXT XML PAGE

            val intent = Intent(this, TrueDetectiveActivity::class.java)
            startActivity(intent)
        }
        watchmen.setOnClickListener {
            Log.d("OnBoardingActivity", "Show if OB Activity 2 has been entered")

            //CODE FOR MOVING TO THE NEXT XML PAGE

            val intent = Intent(this, WatchmenActivity::class.java)
            startActivity(intent)
        }
        ballers.setOnClickListener {
            Log.d("OnBoardingActivity", "Show if OB Activity 2 has been entered")

            //CODE FOR MOVING TO THE NEXT XML PAGE

            val intent = Intent(this, BallersActivity::class.java)
            startActivity(intent)
        }
        hbowallpaper.setOnClickListener {
            Log.d("OnBoardingActivity", "Show if OB Activity 2 has been entered")

            //CODE FOR MOVING TO THE NEXT XML PAGE

            val intent = Intent(this, OnBoardingActivity3::class.java)
            startActivity(intent)
        }
    }
}