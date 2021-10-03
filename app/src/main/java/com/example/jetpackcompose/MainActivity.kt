package com.example.jetpackcompose

import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_main)
        setContent {
//            ArtistCard()
            MessageCard("world")
        }
    }
/*
    @Composable
    fun TwoTexts(text1: String, text2: String, modifier: Modifier = Modifier) {
        Row (modifier = modifier){
            Text(modifier = Modifier){

            }
        }
    }

    @Preview
    @Composable
    fun TwoTextsPreview() {
        MaterialTheme {
            Surface {
                TwoTexts("Muhammad", "Shoaib")
            }
        }
    }*/


}

@Composable
fun MessageCard(name: String) {
    Text("Hello $name!")
}

@Preview
@Composable
fun PreviewMessageCard() {
    MessageCard( "Android")
}

/*@Composable
fun ArtistCard() {
    Image(painter = painterResource(id = R.drawable.outline_account_circle_24),
        contentDescription = "Contact Profile Picture")
    Column() {
        Text("Shoaib Murtaza")
        Text("3 minutes ago")
    }
}*/

/*
@Preview
@Composable
fun DefaultPreview() {
    ArtistCard()
}*/
