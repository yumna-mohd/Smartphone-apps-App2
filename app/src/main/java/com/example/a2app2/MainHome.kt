package com.example.a2app2
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Window
import androidx.appcompat.app.AlertDialog
import kotlinx.android.synthetic.main.activity_main_home.*

class MainHome : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        requestWindowFeature(Window.FEATURE_NO_TITLE) //hiding the title bar
        supportActionBar?.hide() //hiding the title bar
        setContentView(R.layout.activity_main_home)

        //receiving info from the login page
        val intent=getIntent()
        val email=intent.getStringExtra("Email")
        val pass=intent.getStringExtra("Password")

        //setting onclick listener to profile image button that would divert to profile page
        profile.setOnClickListener{
            val intent= Intent(this@MainHome, MainProfile::class.java)
            intent.putExtra("Email", email)
            intent.putExtra("Password", pass)
            startActivity(intent)
        }

        //setting onclick listener to arrow image button that would divert to Login page
        arrow1.setOnClickListener{
            val intent= Intent(this@MainHome, MainLogin::class.java)
            startActivity(intent)
        }

        //setting onclick listener to info image button that would display us instruction toast
        info.setOnClickListener{
            val mAlertDialog2 = AlertDialog.Builder(this@MainHome)
            mAlertDialog2.setIcon(R.mipmap.ic_launcher_round) //set alertdialog icon
            mAlertDialog2.setTitle("Instructions: ") //setting the title
            mAlertDialog2.setMessage("\nStep 1: Select your preferred food category\nStep 2: You get a list of recipies\nStep 3: choose the one that picks your interest\n\nClick the recipe button to view the recipe details")
            //adding a closing button
            mAlertDialog2.setPositiveButton("Close") { dialog, id ->
            }

            //displaying the alert box
            mAlertDialog2.show()
                .window?.setBackgroundDrawableResource(R.drawable.rounded_shape)
        }

        //setting onclick listener to vegetable image button that would divert to veg recipe page
        vegetables.setOnClickListener{
            val intent= Intent(this@MainHome, MainVeg::class.java)
            startActivity(intent)
        }

        //setting onclick listener to vegetable image button that would divert to beef recipe page
        beef.setOnClickListener{
            val intent= Intent(this@MainHome, MainBeef::class.java)
            startActivity(intent)
        }

        //setting onclick listener to vegetable image button that would divert to seafood recipe page
        seafood.setOnClickListener{
            val intent= Intent(this@MainHome, MainSeafood::class.java)
            startActivity(intent)
        }

        //setting onclick listener to vegetable image button that would divert to chicken recipe page
        chicken.setOnClickListener{
            val intent= Intent(this@MainHome, MainChicken::class.java)
            startActivity(intent)
        }

        //setting onclick listener to vegetable image button that would divert to pasta recipe page
        pasta.setOnClickListener{
            val intent= Intent(this@MainHome, MainPasta::class.java)
            startActivity(intent)
        }

        //setting onclick listener to vegetable image button that would divert to dessert recipe page
        dessert.setOnClickListener{
            val intent= Intent(this@MainHome, MainDessert::class.java)
            startActivity(intent)
        }

    }
}