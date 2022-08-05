package com.example.class3_1

import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.width
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp

class ComposeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Column(
                modifier = Modifier.fillMaxSize().background(Color.Black),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally,

            ) {
                Text(
                    text = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nunc quis lorem quis mauris aliquam mollis ut sed nisi. Praesent semper, ante ac blandit gravida, dui ligula euismod purus, eu varius nulla lectus non tellus. Quisque sed odio nec elit condimentum vulputate. Donec arcu massa, efficitur vitae vehicula a, pretium sit amet sapien.",
                    color = Color.White,
                    textAlign = TextAlign.Center,
                    modifier = Modifier.width(200.dp)
                )
            }
        }
    }
}