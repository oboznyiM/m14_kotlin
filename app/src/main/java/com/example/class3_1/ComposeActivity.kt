package com.example.class3_1

import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.material.Switch
import androidx.compose.runtime.MutableState
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.class3_1.data.AppPreferences

class ComposeActivity : AppCompatActivity() {



    @Composable
    fun Switch(isDarkTheme : MutableState<Boolean>, options: AppPreferences) {
        val checkedState = remember { mutableStateOf(true) }
        Switch(
            checked = checkedState.value,
            onCheckedChange = {
                checkedState.value = it

                isDarkTheme.value = !isDarkTheme.value

                options.setOption(it)
            }
        )
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val options = AppPreferences(this)

        setContent {
            val isDarkTheme = remember { mutableStateOf(options.getOptions())}
            MaterialTheme(
                colors = if (isDarkTheme.value) colorDarkPalette else colorLightPalette
            ) {
                //Log.d("tag", "${MaterialTheme.colors.primary}")
                Scaffold(
                    backgroundColor = MaterialTheme.colors.background
                ) {

                    Column(
                        modifier = Modifier
                            .fillMaxSize()
                            .padding(bottom = it.calculateBottomPadding()),
                        verticalArrangement = Arrangement.Center,
                        horizontalAlignment = Alignment.CenterHorizontally,

                        ) {
                        Switch(isDarkTheme, options)
                        Text(
                            text = "This is a showcase app using Jetpack Compose with the Unsplash API",
                            style = androidx.compose.ui.text.TextStyle(
                                fontSize = 24.sp,
                                textAlign = TextAlign.Center,
                            ),
                            color = MaterialTheme.colors.onBackground,
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
    }
}