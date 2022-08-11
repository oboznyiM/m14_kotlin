package com.example.class3_1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.modifier.modifierLocalConsumer
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun Block(headerId: Int, valueId: Int) {
    Column(
        modifier = Modifier
            .fillMaxWidth()
    ) {
        Text(
            text = stringResource(id = headerId),
            style = TextStyle(
                color = Color.White,
                fontSize = 15.sp
            ),
            fontWeight = FontWeight.Bold
        )
        Text(
            text = stringResource(id = valueId),
            style = TextStyle(
                color = Color.White,
                fontSize = 13.sp
            )
        )
    }
}

class ComposeActivity : AppCompatActivity() {
    @Composable
    fun ImageCard() {
        Box (
            modifier = Modifier
                .fillMaxWidth()
                .height(200.dp)
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
                    modifier = Modifier.padding(bottom=15.dp, start=10.dp),
                    text = "Barcelona, Spain",
                    style = TextStyle(
                        color = Color.White,
                        fontSize = 17.sp
                    )
                        )
            }
        }
    }

    @Composable
    fun Icon(resourceId: Int) {
        Image(
            painter = painterResource(id = resourceId),
            contentDescription = "",
            modifier = Modifier
                .width(40.dp)
                .height(40.dp)
                .padding(end = 20.dp))
    }

    @Composable
    fun ProfileBar() {
        Row (
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 15.dp, bottom = 20.dp)
                ){
            Image(
                modifier = Modifier
                    .padding(start = 10.dp)
                    .clip(CircleShape)
                    .size(50.dp),
                painter = painterResource(id = R.drawable.profile),
                contentDescription = ""

            )
            Text (
                modifier = Modifier
                    .align(Alignment.CenterVertically)
                    .padding(start = 10.dp),
                text = "Maksym Oboznyi",
                style = TextStyle(
                    color = Color.White,
                    fontSize = 15.sp
                ))
            Spacer(modifier = Modifier.weight(1f))
            Icon(resourceId = R.drawable.download)
            Icon(resourceId = R.drawable.like)
            Icon(resourceId = R.drawable.save)
        }
    }


    
    @Composable
    fun Row2(headerId1: Int, valueId1: Int, headerId2: Int, valueId2: Int) {
        Row (
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 10.dp, bottom = 10.dp),
            horizontalArrangement= Arrangement.Start
        ) {
            Box (modifier = Modifier.weight(1f)) {
                Block(headerId1, valueId1)
            }
            Box (modifier = Modifier.weight(1f)) {
                Block(headerId2, valueId2)
            }
        }
    }

    @Composable
    fun Row3(headerId1: Int, valueId1: Int, headerId2: Int, valueId2: Int, headerId3: Int, valueId3: Int) {
        Row (
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 10.dp, bottom = 10.dp),
            horizontalArrangement = Arrangement.Center,
        ) {
            Box (modifier = Modifier.weight(1f)) {
                Block(headerId1, valueId1)
            }
            Box (modifier = Modifier.weight(1f)) {
                Block(headerId2, valueId2)
            }
            Box (modifier = Modifier.weight(1f)) {
                Block(headerId3, valueId3)
            }
        }
    }

    @Composable
    fun ButtonTag(text: String) {
        Button(
            onClick = {},
            shape = RoundedCornerShape(50),
            modifier = Modifier.defaultMinSize(minWidth = 1.dp, minHeight = 1.dp),
            colors = ButtonDefaults.buttonColors (
                backgroundColor = Color.Gray,
                contentColor = Color.White
            )

        ) {
            Text(text=text, modifier = Modifier.padding(0.dp))
        }
    }

    @Composable
    fun ButtonRow() {
        Row {
            ButtonTag("barcelona")
            Spacer(modifier = Modifier.width(5.dp))
            ButtonTag("spain")
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
                    ProfileBar()
                    Divider(color = Color.White, thickness = 1.dp)
                    Spacer(modifier = Modifier.height(30.dp))
                    Row2(
                        R.string.main_camera,
                        R.string.main_camera_value,
                        R.string.main_aperture,
                        R.string.main_aperture_value
                    )
                    Row2 (
                        R.string.main_focal_length,
                        R.string.main_focal_length_value,
                        R.string.main_shutter_speed,
                        R.string.main_shutter_speed_value
                    )
                    Row2 (
                        R.string.main_iso,
                        R.string.main_iso_value,
                        R.string.main_dimensions,
                        R.string.main_dimensions_value
                    )
                    Spacer(modifier = Modifier.height(10.dp))

                    Divider(color = Color.White, thickness = 1.dp)
                    Spacer(modifier = Modifier.height(15.dp))

                    Row3 (
                        R.string.main_views,
                        R.string.main_views_value,
                        R.string.main_downloads,
                        R.string.main_downloads_value,
                        R.string.main_likes,
                        R.string.main_likes_value
                    )
                    Spacer(modifier = Modifier.height(10.dp))

                    Divider(color = Color.White, thickness = 1.dp)
                    Spacer(modifier = Modifier.height(20.dp))

                    ButtonRow()
                }
            }
        }
    }
}