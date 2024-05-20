package com.example.learn_modifiers

import android.text.Layout
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp


@Composable
fun TestLayout(){
//   Column(verticalArrangement = Arrangement.Center,
//      horizontalAlignment = Alignment.CenterHorizontally,

//   ) {
//       Text(text = "Hello World")
//       Text(text = "I am Sushant Saurav")
//       Row(horizontalArrangement = Arrangement.Center,
//           verticalAlignment = Alignment.CenterVertically) {
//           Text(text = "my name is sushant")
//       }
//       Row {
//           Text(text = "my name is sushant")
//       }
//       Row {
//           Text(text = "my name is summand")
//       }
//       Row {
//           Text(text = "my name is sushant")
//       }
//   }
    
//    Box(modifier = Modifier
//        .background(Color.Gray)
//        .fillMaxSize(),
//        Alignment.Center
//    ){
//        Text(text = "My name is Sushant Saurav\n I am working as android developer in Visteon\n as a Software Developer ")
//        CircularProgressIndicator()
//    }
//    


    
    
    Column(horizontalAlignment = Alignment.Start,
        verticalArrangement = Arrangement.Bottom,
        modifier = Modifier.padding(
            all = 16.dp
        )) {
        Text(text = "sushant")
        Text(text = "HImanshu")
    }
}