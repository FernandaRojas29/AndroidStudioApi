package com.sena.project_1

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.sena.project_1.ui.theme.Project_1Theme
import com.sena.project_1.view.ActividadUno
import com.sena.project_1.view.ActividadDos
import com.sena.project_1.view.ActividadUno
import com.sena.project_1.view.ActividadTres


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Project_1Theme {
                ActividadUno()
            }
        }
    }
}


@Preview(showSystemUi = true, showBackground = true)
@Composable
fun GreetingPreview() {
    Project_1Theme {
        ActividadUno()
    }
}

@Preview(showSystemUi = true, showBackground = true)
@Composable
fun PreviewDos() {
    Project_1Theme {
        ActividadDos()
    }
}

@Preview(showSystemUi = true, showBackground = true)
@Composable
fun PreviewTres() {
    Project_1Theme {
        ActividadTres()
    }
}
