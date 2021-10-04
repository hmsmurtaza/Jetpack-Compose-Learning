package com.example.jetpackcompose

import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Alignment.Companion.Center
import androidx.compose.ui.Alignment.Companion.CenterVertically
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_main)
        setContent {

        }
    }
}

data class Message(val author: String, val body: String)

@Composable
fun MessageCard(message: Message) {

    Row(modifier = Modifier.padding(all = 1.dp)) {
        Image(painter = painterResource(id = R.drawable.profile_picture),
            contentDescription = "Contact profile picture",
            modifier = Modifier
            // set image size to 40dp
            .size(5.dp)
            .padding(all = 0.dp)
            //  Clip image to be shaped as circle
            .clip(CircleShape)
            .align(Alignment.CenterVertically)
        )

        // Add a horizontal space between the image and the column
        Spacer(modifier = Modifier.width(1.dp))

        Column{
            Text(message.author, fontSize = 2.sp)
            // Add a vertical space between the author and message texts
            Spacer(modifier = Modifier.height(0.dp))
            Text(message.body, fontSize = 2.sp)
        }
    }
}

@Preview
@Composable
fun PreviewMessageCard() {
    MessageCard(Message("Colleague", "Hey, take a look at Jetpack Compose, it's great!"))
}
