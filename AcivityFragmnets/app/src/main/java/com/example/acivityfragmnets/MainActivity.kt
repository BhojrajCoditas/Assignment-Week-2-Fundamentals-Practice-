package com.example.acivityfragmnets

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.ComponentActivity
import androidx.activity.enableEdgeToEdge

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        findViewById<Button>(R.id.btnStart).setOnClickListener {
            startService(Intent(this, LoggerService::class.java))
        }

        findViewById<Button>(R.id.btnStop).setOnClickListener{
            stopService(Intent(this, LoggerService::class.java))

        }
    }


}
