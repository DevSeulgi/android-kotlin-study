package com.dino.dice_app_and_conditional_logic

import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // 1번 방식 - findViewById
        val btn = findViewById<Button>(R.id.testBtnId)
        btn.setOnClickListener {
            Toast.makeText(this,"click",Toast.LENGTH_LONG).show()
        }

        //

    }
}