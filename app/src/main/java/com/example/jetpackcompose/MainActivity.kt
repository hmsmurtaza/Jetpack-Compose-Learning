package com.example.jetpackcompose

import android.content.res.Configuration
import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

class MainActivity : AppCompatActivity() {
    val Red = Color(0xffff0000)
    val Blue = Color(red = 0f, green = 0f, blue = 1f)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_main)
        setContent {

        }
    }
}

@Preview(name = "Light Mode")
@Preview(
    uiMode = Configuration.UI_MODE_NIGHT_YES,
    showBackground = true,
    name = "Dark Mode"
)
@Composable
fun PreviewMessageCard() {
//    ComposeTutorialTheme
    MaterialTheme() {
        MessageCard(
            Message("Colleague", "Hey, take a look at Jetpack Compose, it's great!")
        )
    }
}


data class Message(val author: String, val body: String)

@Composable
fun MessageCard(message: Message) {

    Row(modifier = Modifier.padding(all = 8.dp)) {
        Image(
            painter = painterResource(id = R.drawable.profile_picture),
            contentDescription = "Contact profile picture",
            modifier = Modifier
                // set image size to 40dp
                .size(40.dp)
                .padding(all = 0.dp)
                //  Clip image to be shaped as circle
                .clip(CircleShape)
                .align(Alignment.CenterVertically)
                .border(1.5.dp, MaterialTheme.colors.secondary, CircleShape)
        )

        // Add a horizontal space between the image and the column
        Spacer(modifier = Modifier.width(8.dp))

        Column {
            Text(
                message.author,
                color = MaterialTheme.colors.secondaryVariant,
                style = MaterialTheme.typography.subtitle2
            )
            // Add a vertical space between the author and message texts
            Spacer(modifier = Modifier.height(4.dp))

            Surface(shape = MaterialTheme.shapes.medium, elevation = 1.dp) {
                Text(
                    message.body,
                    modifier = Modifier.padding(all = 4.dp),
                    style = MaterialTheme.typography.body2
                )

            }
        }
    }
}

/*@Preview
@Composable
fun PreviewMessageCard() {
    *//*MaterialTheme(colors = ,
    typography = ,
    shapes = ){
        MessageCard(Message("Colleague", "Hey, take a look at Jetpack Compose, it's great!"))
    }*//*
    MessageCard(Message("Colleague", "Hey, take a look at Jetpack Compose, it's great!"))
}*/
