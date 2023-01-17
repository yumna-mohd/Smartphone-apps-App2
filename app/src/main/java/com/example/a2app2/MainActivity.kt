package com.example.a2app2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Window
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        requestWindowFeature(Window.FEATURE_NO_TITLE) //hiding the title bar
        supportActionBar?.hide() //hiding the title bar
        setContentView(R.layout.activity_main)

        //setting onclick listener to the button that will direct us to the login page when clicked
        button2.setOnClickListener{
            val intent= Intent(this, MainLogin::class.java)
            startActivity(intent)
        }







    }
}