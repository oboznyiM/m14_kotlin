package com.example.class3_1

import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import java.time.format.TextStyle

class ComposeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .background(Color.Black),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally,

            ) {
                Text(
                    text = "This is a showcase app using Jetpack Compose with the Unsplash API",
                    style = androidx.compose.ui.text.TextStyle(
                        fontSize = 24.sp,
                        textAlign = TextAlign.Center,
                        color = Color.White
                    ),
                    modifier = Modifier.width(300.dp)
                )
                Row(
                    horizontalArrangement = Arrangement.Center,
                    modifier = Modifier.fillMaxWidth()
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.android),
                        contentDescription = "TODO",
                        modifier = Modifier.size(150.dp, 150.dp)

                    )
                    Image(
                        painter = painterResource(id = R.drawable.kotlin),
                        contentDescription = "TODO",
                        modifier = Modifier.size(140.dp, 140.dp)
                    )

                }
            }
        }
    }
}