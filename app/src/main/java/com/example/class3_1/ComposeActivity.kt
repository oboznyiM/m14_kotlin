package com.example.class3_1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp

class ComposeActivity : AppCompatActivity() {
    @Composable
    fun ImageCard() {
        Box (
            modifier = Modifier
                .fillMaxWidth()
                .height(200.dp)
                .background(Color.White)
                ) {
            Image(
                modifier = Modifier.fillMaxHeight(),
                painter = painterResource(id = R.drawable.im),
                contentDescription = stringResource(id = R.string.todo),
                contentScale = ContentScale.Crop
            )
            Box (
                modifier = Modifier.fillMaxSize(),
                contentAlignment = Alignment.BottomStart
                    ) {
                Text (
                    text = "Barcelona, Spain",
                    style = TextStyle(
                        color = Color.White
                    )
                        )
            }
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Scaffold (
                backgroundColor = Color.Black
                    ) {
                Column (

                    modifier = Modifier
                        .fillMaxSize()
                        .padding(bottom = it.calculateBottomPadding()),
                )     {
                    ImageCard()
                    }
            }
        }
    }
}