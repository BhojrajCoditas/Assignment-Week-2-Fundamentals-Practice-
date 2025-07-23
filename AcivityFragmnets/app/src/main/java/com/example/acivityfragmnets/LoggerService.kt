package com.example.acivityfragmnets

import android.app.Service
import android.content.Intent
import android.os.IBinder
import android.util.Log
import kotlin.concurrent.thread

class LoggerService: Service() {
    override fun onCreate() {
        super.onCreate()
        Log.d("LoggerService", "Service created")
    }

    override fun onStartCommand(intent: Intent?, flags: Int, startId: Int): Int {
        Log.d("LoggerService", "Service started")
        thread(start = true){
            while (true){
                Log.d("LoggerService", "Logging every 5 seconds")
                Thread.sleep(5000)
            }
        }
        return super.onStartCommand(intent, flags, startId)
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("LoggerService", "Service destroyed")
    }

    override fun onBind(intent: Intent?): IBinder? {
        return null
    }
}