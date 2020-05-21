package com.example.fragment

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v4.app.FragmentManager
import android.widget.Button

class MainActivity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val change = findViewById<Button>(R.id.btn_change)

        change.setOnClickListener{showFragment()}

    }
   private fun showFragment(){

        val transaction = supportFragmentManager.beginTransaction()
        val fragment = ButtonFragment()
         transaction.add(R.id.fragment_container,fragment)
        transaction.commit()

    }
}
