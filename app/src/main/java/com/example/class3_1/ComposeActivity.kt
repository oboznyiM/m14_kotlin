package com.example.class3_1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.Scaffold
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource

class ComposeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Scaffold (
                backgroundColor = Color.Black
                    ) {
                Column (
                    modifier = Modifier.fillMaxSize()
                    padd
                )     {
                    Image(
                        painter = painterResource(id = R.drawable.im),
                        contentDescription = stringResource(id = R.string.todo))
                }
            }
        }
    }
}