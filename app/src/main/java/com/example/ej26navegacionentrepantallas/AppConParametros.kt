package com.example.ej26navegacionentrepantallas

import androidx.compose.runtime.Composable
import androidx.navigation.NavType
import androidx.navigation.compose.*
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument

@Composable
fun AppConParametros() {
    val navController = rememberNavController()

    NavHost(
        navController = navController,
        startDestination = "lista"
    ) {
        composable("lista") {
            PantallaLista(
                onSeleccionarPersona = { nombre ->
                    navController.navigate("detalle/$nombre")
                }
            )
        }

        composable(
            route = "detalle/{nombre}",
            arguments = listOf(
                navArgument("nombre") { type = NavType.StringType }
            )
        ) { backStackEntry ->
            val nombre = backStackEntry.arguments?.getString("nombre") ?: "Sin nombre"

            PantallaDetallePersona(
                nombre = nombre,
                onVolver = { navController.popBackStack() }
            )
        }
    }
}
