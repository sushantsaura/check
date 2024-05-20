package com.example.learn_modifiers

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.currentCompositionLocalContext
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun TestModifiers(){
    Column(modifier = Modifier
        .background(Color.Red)
        .padding(50.dp)
        .clickable {  }
    ) {
        Text(text = "Sushant Saurav")
    }
}