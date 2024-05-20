package com.example.learn_modifiers

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.learn_modifiers.ui.theme.Learn_ModifiersTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Learn_ModifiersTheme {
              Surface(
                  modifier = Modifier.fillMaxSize(),
                  color = MaterialTheme.colorScheme.background
              ) {
                 // TestLayout()
                  //TestModifiers()
                  TestExample()

              }
            }
        }
    }
}

