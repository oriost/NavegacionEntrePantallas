package com.example.ej26navegacionentrepantallas

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp


@Composable
fun PantallaLista(onSeleccionarPersona: (String) -> Unit) {
    val personas = listOf("Ana", "Luis", "Carlos", "María")

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.spacedBy(12.dp)
    ) {
        Text("Lista de personas")

        personas.forEach { persona ->
            Text(
                text = persona,
                modifier = Modifier.clickable {
                    onSeleccionarPersona(persona)
                }
            )
        }
    }
}
