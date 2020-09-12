package com.example.dragonpuzzle

import android.graphics.BitmapFactory
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.SurfaceView

class MainActivity : AppCompatActivity() {

    var gameSurfaceView: GameSurfaceView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onResume() {
        super.onResume()

        val surfaceView = findViewById<SurfaceView>(R.id.surfaceView)
        var bmp1 = BitmapFactory.decodeResource(getResources(), R.drawable.heart)
        gameSurfaceView = GameSurfaceView(surfaceView, bmp1)

    }
}
