package com.dino.ui_and_activity_transitions

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // 1. 화면이 클릭되었다는 것을 알아야 함.
        val image1 = findViewById<ImageView>(R.id.btsImage1)
        image1.setOnClickListener {

            Toast.makeText(this, "1번 클릭", Toast.LENGTH_LONG).show()

            // 2. 화면이 넘어가서 사진이 크게 보여야 함.
            var intent = Intent(this, Bts1Activity::class.java)
            startActivity(intent)
        }
    }
}