package com.purple3.twoactivities

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.Toast
import android.R.string.cancel
import android.os.CountDownTimer




class FirstActivity : AppCompatActivity() {

    private lateinit var btnForNextPage : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.e("Activity is in", "onCreate")
        setContentView(R.layout.activity_first)

        btnForNextPage = findViewById(R.id.btnToNextActivity)
    }

    override fun onStart() {
        super.onStart()
        Log.e("Activity is in", "onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.e("Activity is in", "onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.e("Activity is in", "onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.e("Activity is in", "onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.e("Activity is in", "onDestroy")
    }

    fun goToNextPage(view : View) {
        btnForNextPage.setOnClickListener {
            var secondActivityIntent  = Intent(this@FirstActivity, SecondActivity::class.java)
            Toast.makeText(this, "Going to Second Activity...",Toast.LENGTH_LONG).show()
            startActivity(secondActivityIntent)
        }
    }

}
