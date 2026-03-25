package com.example.ej26navegacionentrepantallas

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.example.ej26navegacionentrepantallas.ui.theme.Ej26NavegacionEntrePantallasTheme


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Ej26NavegacionEntrePantallasTheme {
                    AppConParametros()
            }
        }
    }
}

