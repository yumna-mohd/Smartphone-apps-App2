package com.example.a2app2

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.Window
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main_dessert.*
import kotlinx.android.synthetic.main.activity_main_veg.arrow1
import kotlinx.android.synthetic.main.activity_main_veg.info


class MainDessert : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        requestWindowFeature(Window.FEATURE_NO_TITLE) //hiding the title bar
        supportActionBar?.hide() //hiding the title bar
        setContentView(R.layout.activity_main_dessert)

        //setting click listener to the link button that would divert the user to the external web link
        timbitsbtn.setOnClickListener{
            val i = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.chefspencil.com/recipe/timbits/"))
            startActivity(i)
        }
        pancakesbtn.setOnClickListener{
            val i = Intent(Intent.ACTION_VIEW, Uri.parse("https://cooking.nytimes.com/recipes/1893-everyday-pancakes"))
            startActivity(i)
        }
        etonmessbtn.setOnClickListener{
            val i = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.sweetestmenu.com/easy-eton-mess/"))
            startActivity(i)
        }


        arrow1.setOnClickListener{
            val intent= Intent(this@MainDessert, MainHome::class.java)
            startActivity(intent)
        }

        info.setOnClickListener{
            val mAlertDialog2 = AlertDialog.Builder(this@MainDessert)
            mAlertDialog2.setIcon(R.mipmap.ic_launcher_round) //set alertdialog icon
            mAlertDialog2.setTitle("Instructions: ") //setting the title
            mAlertDialog2.setMessage("\nStep 1: look through all the recipies \nStep 2: The recipe Name and Area are displayed\nStep 3: when decided, click on the recipe button. \n\nThis will direct you to the recipe webpage")
            //adding a closing button
            mAlertDialog2.setPositiveButton("Close") { dialog, id ->
            }

            //displaying the alert box
            mAlertDialog2.show()
                .window?.setBackgroundDrawableResource(R.drawable.rounded_shape)
        }
    }
}