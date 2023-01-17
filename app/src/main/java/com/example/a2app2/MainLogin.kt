package com.example.a2app2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.Window
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main_login.*

class MainLogin : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        requestWindowFeature(Window.FEATURE_NO_TITLE) //hiding the title bar
        supportActionBar?.hide() //hiding the title bar
        setContentView(R.layout.activity_main_login)

        //declaring a variable that would store data from the TextView1
        val ed_t : TextView = findViewById(R.id.textView1)
        val bt : Button = findViewById(R.id.button)

        //setting onclicklistener to the button
        bt.setOnClickListener(object: View.OnClickListener{
            override fun onClick(v: View?) {
                val ed_t_str :String = ed_t.text.toString()

                //checking if the input fields are empty
                if(!ed_t_str.isNullOrEmpty()) //returns true if string is null or empty
                {
                    val pass=textView1.text.toString()
                    val email=textView2.text.toString()
                    val intent= Intent(this@MainLogin, MainHome::class.java)
                    intent.putExtra("Email", email)
                    intent.putExtra("Password", pass)
                    startActivity(intent)

                }
                //if the input fields are empty the following toast will be displayed
                else{
                    Toast.makeText(this@MainLogin, "Empty Field", Toast.LENGTH_SHORT).show()

                }

            }
        })


    }
}