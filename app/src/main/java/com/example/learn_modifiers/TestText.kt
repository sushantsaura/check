package com.example.learn_modifiers

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun TestTextUsed(){
    Column(modifier = Modifier
        .fillMaxWidth()
        .background(color = Color.Black)
        , horizontalAlignment = Alignment.CenterHorizontally
        , verticalArrangement = Arrangement.Center

    ) {
        Text(
            text = "My name is Sushant Saurav",
            color = Color.Gray,
            modifier = Modifier.padding(all = 10.dp)
        )
        Text(
            text = "I am currently working as Software developer Intern in Visteon ",
            color = Color.Gray,
            modifier = Modifier.padding(all = 10.dp)
        )


        Text(
            text = stringResource(id = R.string.resource),
            color = Color.Gray,
            modifier = Modifier.padding(all = 10.dp),
            fontSize = 20.sp,
            fontFamily = FontFamily.Cursive,
            fontWeight = FontWeight.Bold
        )

        val name = remember { mutableStateOf(TextFieldValue("")) }
        TextField(
            value = name.value, onValueChange = { name.value = it },
            label = { Text(text = "Enter your name") },
            placeholder = { Text(text = "Sushant Saurav")}
        )
        val number= remember { mutableStateOf(TextFieldValue("")) }
        TextField(value = number.value, onValueChange = { number.value = it },
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number),
            label = { Text(text = "Enter your number") },
            placeholder = { Text(text = "9999999999")},

        )
    }
}