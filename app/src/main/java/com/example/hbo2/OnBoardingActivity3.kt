package com.example.hbo2

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import com.awesome.dialog.AwesomeGeneralDialog
import com.example.hbo2.R.layout.onboarding3
import kotlinx.android.synthetic.main.onboarding3.*
import kotlinx.android.synthetic.main.onboarding3.click_button as click_button1


class OnBoardingActivity3 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(onboarding3)

      sign_up.setOnClickListener {
            Log.d( "OnBoardingActivity" , "Show if OB Activity 2 has been entered" )

            //CODE FOR MOVING TO THE NEXT XML PAGE

            val intent = Intent(this, SignnUpActivity::class.java )
            startActivity(intent)


           overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left)
       }

        click_button1.setOnClickListener { AwesomeGeneralDialog(this)
            .setTopColor(ContextCompat.getColor(this, R.color.color_deep_purple))
            .setIcon(R.drawable.ferd)
            .setTitle("~SaginiChan")
            .setPositiveButton("OK", object : View.OnClickListener {
                override fun onClick(p0: View?) {

                }

        })
            .setMessage("HBO MAX comes out May 2020 , till then ,ENJOY this fan version of what it may be..")
            .setPositiveButtonColor(ContextCompat.getColor(this, R.color.color_deep_orange))
            .show()}}}



