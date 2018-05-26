package com.purple3.twoactivities

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.Toast

class SecondActivity : AppCompatActivity() {

    private lateinit var backBtn : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        backBtn = findViewById(R.id.btnBack)
    }

    fun goBack(view : View) {
        //backBtn.setOnClickListener {
            Log.e("Back Button", "Clicked")
            var firstActivityIntent  = Intent(this, FirstActivity::class.java)
            Toast.makeText(this, "Going to First Activity...", Toast.LENGTH_SHORT).show()
            startActivity(firstActivityIntent)
       // }
    }

}