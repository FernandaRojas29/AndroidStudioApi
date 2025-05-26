package com.example.interfaces

import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.compose.animation.core.FastOutSlowInEasing
import androidx.compose.animation.core.tween
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import com.example.interfaces.view.ActivityOne.NavegacionApp
import androidx.compose.ui.unit.dp
import androidx.compose.foundation.layout.Row
import androidx.compose.ui.graphics.Color
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.runtime.LaunchedEffect
import androidx.activity.ComponentActivity
import com.example.interfaces.view.ActivityOne.Navegate
import kotlinx.coroutines.delay
import com.example.interfaces.view.ActivityOne.PantallaUno
import com.example.interfaces.view.ActivityOne.PantallaDos
import com.example.interfaces.view.ActivityOne.PantallaTres
import androidx.compose.foundation.layout.height


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            NavegacionApp()
          //Horizontal() // activa el pase automático
            //Navegate()

        }
    }
}

@Composable
fun Horizontal() {
    val pagerState = rememberPagerState(pageCount = { 3 })

    LaunchedEffect(Unit) {
        while (true) {
            delay(3000L)
            val nextPage = (pagerState.currentPage + 1) % 3
            pagerState.animateScrollToPage(nextPage)
        }
    }

    HorizontalPager(state = pagerState) { page ->
        // Puedes poner imágenes o textos aquí según el índice
        /*Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(150.dp)
                .background(Color.LightGray),
            contentAlignment = Alignment.Center
        ) {
            Text("Página ${page + 1}")
        }
    }*/
}


        @Composable
        fun PrimeraVentana() {
            Box(
                modifier = Modifier
                    .fillMaxSize()
                    .background(Color(color = 0x34e3fe))
            ) {
                Text(
                    text = "Hola desde ventana un_1",
                    modifier = Modifier.align(Alignment.Center)
                )
            }
        }

        @Composable
        fun SegundaVentana() {
            Box(
                modifier = Modifier
                    .fillMaxSize()
                    .background(Color(color = 0x34e3fe))
            ) {
                Text(
                    text = "Hola desde ventana 2",
                    modifier = Modifier.align(Alignment.Center)
                )
            }
        }

        @Composable
        fun TerceraVentana() {
            Box(
                modifier = Modifier
                    .fillMaxSize()
                    .background(Color(color = 0x34e3fe))
            ) {
                Text(
                    text = "Hola desde ventana 3",
                    modifier = Modifier.align(Alignment.Center)
                )
            }
        }
    }