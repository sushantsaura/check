package com.example.learn_modifiers

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun TestExample(){

    Column {
        Row(horizontalArrangement = Arrangement.spacedBy(30.dp)
            , modifier = Modifier.padding(
                start = 30.dp,

                top = 30.dp,
                bottom = 15.dp
            )){
            Column(verticalArrangement = Arrangement.Center
                , horizontalAlignment = Alignment.CenterHorizontally
                ,
                modifier = Modifier
                    .background(Color.Red)
                    .width(90.dp)
                    .height(90.dp)


            ) { Text(text = "ff0000")
            }
            Column(verticalArrangement = Arrangement.Center
                , horizontalAlignment = Alignment.CenterHorizontally
                ,
                modifier = Modifier
                    .background(Color.Green)
                    .width(90.dp)
                    .height(90.dp)
            ) { Text(text = "00ff00")}
            Column(verticalArrangement = Arrangement.Center
                , horizontalAlignment = Alignment.CenterHorizontally
                ,
                modifier = Modifier
                    .background(Color.Blue)
                    .width(90.dp)
                    .height(90.dp)
            ) { Text(text = "0000ff")}
        }

        Column(horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.spacedBy(30.dp),
            modifier = Modifier.padding(all=30.dp)) {
            Column(verticalArrangement = Arrangement.Center
                , horizontalAlignment = Alignment.CenterHorizontally
                ,
                modifier = Modifier
                    .background(Color.Yellow)
                    .fillMaxWidth()
                    .height(100.dp)
            ) { Text(text = "ff0000") }
            Column(verticalArrangement = Arrangement.Center
                , horizontalAlignment = Alignment.CenterHorizontally
                ,
                modifier = Modifier
                    .background(Color.DarkGray)
                    .fillMaxWidth()
                    .height(100.dp)
            ) { Text(text = "00ff00")}
            Column(verticalArrangement = Arrangement.Center
                , horizontalAlignment = Alignment.CenterHorizontally
                ,
                modifier = Modifier
                    .background(Color.Magenta)
                    .fillMaxWidth()
                    .height(100.dp)
            ) { Text(text = "0000ff")}

        }

        Box(modifier = Modifier.fillMaxSize(),
            Alignment.Center) {
            Column(
                modifier = Modifier
                    .background(Color.Gray)
                    .fillMaxWidth(0.8f)
                    .fillMaxHeight(0.8f)
            ) { Text(text = "00ff00") }
            Column(
                modifier = Modifier
                    .background(Color.Blue)
                    .fillMaxWidth(0.6f)
                    .fillMaxHeight(0.6f)
            ) { Text(text = "00ff00")}
            Column(
                modifier = Modifier
                    .background(Color.LightGray)
                    .fillMaxWidth(0.4f)
                    .fillMaxHeight(0.4f)
            ) { Text(text = "0000ff")}
        }
    }
}