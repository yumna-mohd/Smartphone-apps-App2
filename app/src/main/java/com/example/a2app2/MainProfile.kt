package com.example.a2app2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Window
import androidx.appcompat.app.AlertDialog
import kotlinx.android.synthetic.main.activity_main_profile.*
import kotlinx.android.synthetic.main.activity_main_profile.arrow1
import kotlinx.android.synthetic.main.activity_main_profile.info

class MainProfile : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        requestWindowFeature(Window.FEATURE_NO_TITLE) //hiding the title bar
        supportActionBar?.hide() //hiding the title bar
        setContentView(R.layout.activity_main_profile)

        //receiving the input details from the MainLogin.kt
        val intent=getIntent()
        val email=intent.getStringExtra("Email")
        val pass=intent.getStringExtra("Password")

        textView3.text= email
        textView4.text= pass

        //back arrow image button will direct us to the home page
        arrow1.setOnClickListener{
            val intent= Intent(this@MainProfile, MainHome::class.java)
            startActivity(intent)
        }

        //info image button will pop up a dialog box containing instructions
        info.setOnClickListener{
            val mAlertDialog2 = AlertDialog.Builder(this@MainProfile)
            mAlertDialog2.setIcon(R.mipmap.ic_launcher_round) //set alertdialog icon
            mAlertDialog2.setTitle("Instructions: ") //setting the title
            mAlertDialog2.setMessage("\nStep 1: You can find you login details here\nStep 2: In order to edit it click on edit butoon\n\nStep 3: You will be directed to the login page ")
            //adding a closing button
            mAlertDialog2.setPositiveButton("Close") { dialog, id ->
            }

            //displaying the alert box
            mAlertDialog2.show()
                .window?.setBackgroundDrawableResource(R.drawable.rounded_shape)

        }

        //edit button will direct us to the Login page
        editbtn.setOnClickListener{
            val intent= Intent(this@MainProfile, MainLogin::class.java)
            startActivity(intent)
        }

    }
}