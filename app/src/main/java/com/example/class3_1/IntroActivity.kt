package com.example.class3_1

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class IntroActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_intro)

        findViewById<ImageView>(R.id.mainIm).setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            findViewById<RecyclerView>(R.id.verticalRv).apply {
                setHasFixedSize(true)
                layoutManager = LinearLayoutManager(context)
                adapter = ImagesAdapter(arrayOf("hi", "hello", "wow"))
            }
        }
    }
}