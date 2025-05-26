package com.example.interfaces.view.ActivityOne

import androidx.compose.runtime.Composable
import androidx.compose.runtime.ComposableOpenTarget
import androidx.compose.runtime.internal.composableLambda
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

@Composable
fun Navegate(){
    val navController = rememberNavController()

    NavHost(navController = navController,
        startDestination = "Home"){
        composable(route="home"){
            Home(navController)
        }
        composable(route = "info"){
            Info(navController)
        }
        composable(route = "detalles"){
            Detalles(navController)
        }
    }
}