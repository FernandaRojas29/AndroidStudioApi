package com.example.interfaces.view.ActivityOne
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.foundation.shape.RoundedCornerShape
import com.example.interfaces.R
import com.example.interfaces.Horizontal
import androidx.compose.runtime.LaunchedEffect
import kotlinx.coroutines.delay

@Composable
fun PantallaUno(navController: NavController? = null) {
    LaunchedEffect(Unit) {
        delay(3000L) // espera 3 segundos
        navController?.navigate("pantalla_dos")
    }
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
            .padding(24.dp),
        verticalArrangement = Arrangement.SpaceEvenly,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Horizontal()
        Image(
            painter = painterResource(id = R.drawable.un),
            contentDescription = "Imagen de bienvenida",
            modifier = Modifier
                .height(250.dp)
                .fillMaxWidth(),
            contentScale = ContentScale.Fit
        )
        Text(
            text = "Bienvenido a TripulantesApp",
            style = MaterialTheme.typography.headlineMedium,
            fontWeight = FontWeight.Bold,
            textAlign = TextAlign.Center
        )
        Text(
            text = "Explora recursos, consejos y herramientas para tu camino como auxiliar de vuelo.",
            style = MaterialTheme.typography.bodyMedium,
            textAlign = TextAlign.Center
        )

    }
}
