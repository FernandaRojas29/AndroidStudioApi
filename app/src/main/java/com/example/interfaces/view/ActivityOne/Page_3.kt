package com.example.interfaces.view.ActivityOne


import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.LineHeightStyle
import androidx.navigation.NavController

@Composable
fun Detalles(navController: NavController){
    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    )  {
        Column {
            Text(text = "hola desde ventana_3")
            Button(onClick = {navController.navigate(route = "home")}){
                Text(text = "ir a home")
        }

    }

    }
}