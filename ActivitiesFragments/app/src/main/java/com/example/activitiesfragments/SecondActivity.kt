package com.example.activitiesfragments

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d("SecondActivity", "onCreate")
        setContentView(R.layout.activity_second)
        supportFragmentManager.beginTransaction()
            .replace(R.id.fragment_container, FragmentB())
            .commit()
    }
    override fun onStart() {
        super.onStart();
        Log.d("SecondActivity", "onStart")
    }
    override fun onResume() {
        super.onResume();
        Log.d("SecondActivity", "onResume")
    }
    override fun onPause() {
        super.onPause();
        Log.d("SecondActivity", "onPause")
    }
    override fun onStop() {
        super.onStop();
        Log.d("SecondActivity", "onStop")
    }
    override fun onDestroy() {
        super.onDestroy();
        Log.d("SecondActivity", "onDestroy")
    }
    fun  {
        Log.d("SecondActivity", "Navigating back to MainActivity")
        finish()
    }
}