package com.example.fragmentsapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val firstfragment = OneFragment()
        val seconedFragment = TowFragment()
        val thirdFragment = ThreeFragment()

        supportFragmentManager.beginTransaction().apply {
            replace(R.id.frLayout, firstfragment)
            commit()}

            val btnFragment1 = findViewById<Button>(R.id.btnFragment1)
            val btnFragment2 = findViewById<Button>(R.id.btnFragment3)
            val btnFragment3 = findViewById<Button>(R.id.btnFragment2)
            btnFragment1.setOnClickListener {
                supportFragmentManager.beginTransaction().apply {
                    replace(R.id.frLayout, firstfragment)
                    addToBackStack(null)
                    commit()}
                }
                btnFragment2.setOnClickListener {
                    supportFragmentManager.beginTransaction().apply {
                        replace(R.id.frLayout, seconedFragment)
                        addToBackStack(null)
                        commit()}
                    }
                    btnFragment3.setOnClickListener {
                        supportFragmentManager.beginTransaction().apply {
                            replace(R.id.frLayout, thirdFragment)
                            addToBackStack(null)
                            commit()}
                        }

    }
}