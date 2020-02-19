package com.example.hbo2

import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.example.hbo2.R.layout.dcpage
import kotlinx.android.synthetic.main.dcpage.*

class DcActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(dcpage)

        theflash.setOnClickListener {
            Log.d("OnBoardingActivity", "Show if OB Activity 2 has been entered")

            //CODE FOR MOVING TO THE NEXT XML PAGE

            val intent = Intent(this, TheFlashActivity::class.java)
            startActivity(intent)
        }
        arrow.setOnClickListener {
            Log.d("OnBoardingActivity", "Show if OB Activity 2 has been entered")

            //CODE FOR MOVING TO THE NEXT XML PAGE

            val intent = Intent(this, ArrowActivity::class.java)
            startActivity(intent)
        }
        supergirl.setOnClickListener {
            Log.d("OnBoardingActivity", "Show if OB Activity 2 has been entered")

            //CODE FOR MOVING TO THE NEXT XML PAGE

            val intent = Intent(this, SupergirlActivity::class.java)
            startActivity(intent)
        }
        batgirl.setOnClickListener {
            Log.d("OnBoardingActivity", "Show if OB Activity 2 has been entered")

            //CODE FOR MOVING TO THE NEXT XML PAGE

            val intent = Intent(this, BatgirlActivity::class.java)
            startActivity(intent)
        }
        legends.setOnClickListener {
            Log.d("OnBoardingActivity", "Show if OB Activity 2 has been entered")

            //CODE FOR MOVING TO THE NEXT XML PAGE

            val intent = Intent(this, LegendsActivity::class.java)
            startActivity(intent)
        }
        doompatrol.setOnClickListener {
            Log.d("OnBoardingActivity", "Show if OB Activity 2 has been entered")

            //CODE FOR MOVING TO THE NEXT XML PAGE

            val intent = Intent(this, DoomPatrolActivity::class.java)
            startActivity(intent)
        }
        titans.setOnClickListener {
            Log.d("OnBoardingActivity", "Show if OB Activity 2 has been entered")

            //CODE FOR MOVING TO THE NEXT XML PAGE

            val intent = Intent(this, TitansActivity::class.java)
            startActivity(intent)
        }
        swampthing.setOnClickListener {
            Log.d("OnBoardingActivity", "Show if OB Activity 2 has been entered")

            //CODE FOR MOVING TO THE NEXT XML PAGE

            val intent = Intent(this, SwampThingActivity::class.java)
            startActivity(intent)
        }
        pennysworth.setOnClickListener {
            Log.d("OnBoardingActivity", "Show if OB Activity 2 has been entered")

            //CODE FOR MOVING TO THE NEXT XML PAGE

            val intent = Intent(this, PennysworthActivity::class.java)
            startActivity(intent)
        }
        harley.setOnClickListener {
            Log.d("OnBoardingActivity", "Show if OB Activity 2 has been entered")

            //CODE FOR MOVING TO THE NEXT XML PAGE

            val intent = Intent(this, HarleyquinnActivity::class.java)
            startActivity(intent)
        }
        dcwallpaper.setOnClickListener {
            Log.d("OnBoardingActivity", "Show if OB Activity 2 has been entered")

            //CODE FOR MOVING TO THE NEXT XML PAGE

            val intent = Intent(this, DcWallpaperActivity::class.java)
            startActivity(intent)
        }
}
    }