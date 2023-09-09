package com.example.lumosfirstcomposable

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.RowScope
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.lumosfirstcomposable.ui.theme.LumosFirstComposableTheme
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            LumosFirstComposableTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                        ProfilePage()
                }
            }
        }
    }
}

@Composable
fun Greeting(message: String) {
    Text(
        text = message
    )
}



@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    LumosFirstComposableTheme {
        Greeting("Happy Birthday!")
    }
}

@Preview
@Composable
fun ProfilePage(){
    LumosFirstComposableTheme {
        Column() {
            Row {
                Text("Lumos!")
                Button(onClick = { /*TODO*/ }) {

                }
            }
        }
    }
}