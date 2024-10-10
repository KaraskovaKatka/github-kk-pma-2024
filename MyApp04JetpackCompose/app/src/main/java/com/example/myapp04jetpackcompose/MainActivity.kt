package com.example.myapp04jetpackcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.myapp04jetpackcompose.ui.theme.MyApp04JetpackComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeExample()
        }
    }
}
/*
Tato funkce definuje samotnou Composable, což je funkce
v Jetpack Compose, která vykresluje UI.
V tomto případě bude tato funkce obsahovat
veškerou logiku a UI pro tuto jednoduchou aplikaci.
 */

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ComposePerson() {

}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    ComposePerson()
}