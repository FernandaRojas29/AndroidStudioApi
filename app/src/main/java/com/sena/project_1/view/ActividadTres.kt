@file:JvmName("ActividadDosKt")

package com.sena.project_1.view

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.sena.proyect_1.R

@Composable
fun ActividadTres() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(24.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text(
            text = ("bibi"),
            fontSize = 38.sp,
            textAlign = TextAlign.Center,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(bottom = 80.dp),
        )
        Spacer(modifier = Modifier.height(32.dp))
        Image(
            painter = painterResource(id = R.drawable.archivos),
            contentDescription = null,
            modifier = Modifier
                .size(300.dp)
                .padding(bottom = 80.dp)
        )


        Text(
            text = "Get Started!",
            fontSize = 32.sp,
            textAlign = TextAlign.Center,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(horizontal = 16.dp),
            lineHeight = 28.sp,
            color = Color.DarkGray
        )


        Spacer(modifier = Modifier.height(32.dp))

        Button(
            onClick = {  },
            modifier = Modifier
                .width(300.dp)
                .height(50.dp)
                .border(
                    border = BorderStroke(3.dp, Color.Magenta),
                    shape = RoundedCornerShape(20.dp)
                )
                .clip(RoundedCornerShape(20.dp)),
            colors = ButtonDefaults.buttonColors(
                containerColor = Color.White,
                contentColor = Color.Black,
            )
        ) {
            Text(
                text = "Registration",
                fontSize = 20.sp,
            )
        }
        Spacer(modifier = Modifier.height(32.dp))
        Text(
            text = buildAnnotatedString {
                append("Already have an account? ")
                withStyle(style = SpanStyle(color = Color.Magenta)) {
                    append("Login")
                }
            },
            fontSize = 20.sp,
            textAlign = TextAlign.Center,
            modifier = Modifier.padding(bottom = 30.dp),
            color = Color.DarkGray
        )
    }
}
