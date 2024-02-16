package com.example.android_compose_introducao.ui

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import com.example.android_compose_introducao.ui.theme.AndroidcomposeintroducaoTheme


@Composable
fun InicioScreen(){
    Surface(
        modifier = Modifier.fillMaxSize(),
        color = Color.LightGray
    ) {
        Column(
            modifier = Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text("Não autenticado")
            Button(onClick = { }) {
                Text("Minha conta")
            }

        }
    }
}

@Preview(showBackground = true)
@Composable
fun InicioScreenPreview() {
    AndroidcomposeintroducaoTheme {
        InicioScreen()
    }
}