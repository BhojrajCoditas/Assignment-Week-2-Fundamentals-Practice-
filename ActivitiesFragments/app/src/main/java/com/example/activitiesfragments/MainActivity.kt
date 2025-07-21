package com.example.activitiesfragments

import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d("MainActivity", "onCreate")
        setContentView(R.layout.activity_main)
        supportFragmentManager.beginTransaction()
            .replace(R.id.fragment_container, FragmentA())
            .commit()
    }
    override fun onStart() {
        super.onStart(); Log.d("MainActivity", "onStart")
    }
    override fun onResume() {
        super.onResume(); Log.d("MainActivity", "onResume")
    }
    override fun onPause() {
        super.onPause(); Log.d("MainActivity", "onPause")
    }
    override fun onStop() {
        super.onStop(); Log.d("MainActivity", "onStop")
    }
    override fun onDestroy() {
        super.onDestroy(); Log.d("MainActivity", "onDestroy")
    }
    fun navigateToSecondActivity() {
        Log.d("MainActivity", "Navigating to SecondActivity")
        startActivity(Intent(this, SecondActivity::class.java))
    }
}