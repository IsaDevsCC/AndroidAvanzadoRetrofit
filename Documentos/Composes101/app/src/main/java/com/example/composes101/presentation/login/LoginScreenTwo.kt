package com.example.composes101.presentation.login

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun LoginScreenTwo() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(color = Color.White)
        )
    {
        // IMAGEN
        Row(
            Modifier
                .fillMaxWidth()
                .background(Color.Blue),
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.CenterVertically

        ) {
            Text(
                text = "Hello ",
                modifier = Modifier
            )
        }
        // TITULO
        Row(
            Modifier
                .fillMaxWidth()
                .background(Color.Blue),
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.CenterVertically

        ) {
            Text(
                text = "Hello ",
                modifier = Modifier
            )
        }
        // EDITTEXT1
        Row(
            Modifier
                .fillMaxWidth()
                .background(Color.Blue),
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.CenterVertically

        ) {
            Text(
                text = "Hello ",
                modifier = Modifier
            )
        }
        // EDITTEXT 2
        Row(
            Modifier
                .fillMaxWidth()
                .background(Color.Blue),
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.CenterVertically

        ) {
            Text(
                text = "Hello ",
                modifier = Modifier
            )
        }
        //
        Row(
            Modifier
                .fillMaxWidth()
                .background(Color.Blue),
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.CenterVertically

        ) {
            Text(
                text = "Hello ",
                modifier = Modifier
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun ShowLoginScreen(){
    LoginScreenTwo()
}