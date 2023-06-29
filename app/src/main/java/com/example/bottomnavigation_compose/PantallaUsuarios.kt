package com.example.bottomnavigation_compose

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.ShoppingCart
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Alignment.Companion.CenterHorizontally
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun PantallaUsuarios() {
    /*Box(
        modifier = Modifier
            .fillMaxSize()
            .background(color = Color.Red)
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .align(Alignment.Center),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(text = "Pantalla Usuarios", fontSize = 20.sp, color = Color.White)
        }
    }*/
    Column() {
        Text(
            text = "Registros",
            textAlign = TextAlign.Center,
            modifier = Modifier
                .padding(10.dp)
                .fillMaxWidth()
        )
        Spacer(modifier = Modifier.height(25.dp))


        Column(
            modifier = Modifier
                .wrapContentSize(Alignment.Center)
                .align(CenterHorizontally)
        ) {
            Box(
                contentAlignment = Alignment.Center,
                modifier = Modifier
                    .size(width = 350.dp, height = 150.dp)
                    .background(color = Color.LightGray)
                    .wrapContentSize(Alignment.Center)




            ) {
                Column() {
                    Row(modifier = Modifier
                        .fillMaxWidth()) {
                        Icon(
                            Icons.Rounded.ShoppingCart,
                            contentDescription = stringResource(id = androidx.compose.ui.R.string.in_progress)
                        )
                        Text(text = "Sensor", textAlign = TextAlign.Center)
                        Text(text = "Hace N horas", textAlign = TextAlign.Right)
                    }
                    Text(text = "Altitud: 10")
                    Text(text = "Profundidad: 15")
                    Text(text = "Presion: 40psi")
                    Text(text = "Temperatura: 17")
                }
            }
        }
    }
}