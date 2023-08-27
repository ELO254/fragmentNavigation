package com.example.fragmenttutorial

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.LinearLayout
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var buttonfrag : Button = findViewById(R.id.buttonfrag)



        buttonfrag.setOnClickListener {
            supportFragmentManager.beginTransaction().add(R.id.fragment_container2,FirstFragment()).commit()
            buttonfrag.visibility = View.GONE
        }


    }

//    private fun openfragment() {
//        val fragmentManager = supportFragmentManager
//        val fragmentTransaction = fragmentManager.beginTransaction()
//        val fragment = FirstFragment()
//        fragmentTransaction.add(R.id.fragment_container2, fragment)
//        fragmentTransaction.commit()
//    }
}