package com.example.agecalculatorkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mCalbtn.setOnClickListener{it:View
        val userDB=yearEditedtext.text.toString().trim()
        val year:int = calendar.getInstance.get(Calendar.YEAR)
        if (userDB == "") {
            Toast.makeText(this, "Please enter your year", Toast.LENGTH_LONG).show()
        }
            else if (userDB >year.toString()){
                Toast.makeText(this, "Year should less then",Toast.LENGTH_LONG).show()
        }
            else{
                val myAge = year - userDB.toInt()
                ageTextView.text = "Your Age is"+myAge+"years"
        }
        }

    }
}