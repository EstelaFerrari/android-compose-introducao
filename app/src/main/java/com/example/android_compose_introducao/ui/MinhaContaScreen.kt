package com.example.composeintroduoaula.ui

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.AlertDialog
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import coil.compose.AsyncImage
import com.example.android_compose_introducao.R

@Composable
fun MinhaContaScreen(
    navController: NavController
) {
    val showAlert = remember { mutableStateOf(false)  }

    Surface(
        modifier = Modifier.fillMaxSize(),
        color = Color.Black
    ) {

        Column(
            modifier = Modifier
                .padding(24.dp)
                .verticalScroll(rememberScrollState())
                .fillMaxSize(),
            verticalArrangement = Arrangement.spacedBy(10.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                "Minha conta",
                style = MaterialTheme.typography.headlineMedium
            )

            Box(
                modifier = Modifier.padding(16.dp)
            ) {
                AsyncImage(
                    model = "https://suap.ifro.edu.br/media/alunos/150x200/78489.mQ5j0Fg0cfc3.jpg",
                    contentDescription = null,
                    contentScale = ContentScale.Crop,
                    modifier = Modifier
                        .size(140.dp)
                        .clip(CircleShape)
                )

                Button(
                    onClick = {

                    },
                    shape = CircleShape,
                    contentPadding = PaddingValues(0.dp),
                    modifier = Modifier
                        .size(50.dp)
                        .align(Alignment.BottomEnd)
                ) {
                    Icon(
                        painter = painterResource(id = R.drawable.ic_edit1),
                        contentDescription = null,
                        tint = Color.White
                    )
                }
            }

            Text(
                "Estela Ferrari",
                style = MaterialTheme.typography.headlineSmall
            )
            Text(
                "estela.ferrari.2301@gmail.com",
                style = TextStyle(
                    fontSize = MaterialTheme.typography.bodySmall.fontSize,
                    color = Color.Gray
                )
            )

            Button(
                onClick = {
                    showAlert.value = true
                },
                colors = ButtonDefaults.run { ButtonDefaults.buttonColors(Color.White) },
                modifier = Modifier.padding(top = 24.dp)
            ) {
                Text("Sair")

            }
        }

        if (showAlert.value) {
            AlertDialog(
                onDismissRequest = {
                    showAlert.value = false
                },
                title = {
                    Text(text = "Deseja realmente sair?")
                },
                text = {
                    Text("Não será possível acessar informações e receber notificações pessoais.")
                },
                confirmButton = {
                    Button(
                        onClick = {

                            showAlert.value = false
                            navController.navigate("login")
                        }
                    ) {
                        Text("Sair")
                    }
                },
                dismissButton = {
                    Button(
                        onClick = {
                            showAlert.value = false
                        }
                    ) {
                        Text("Cancelar")
                    }
                }
            )
        }
    }
}

//@Preview(showBackground = true)
//@Composable
//fun MinhaContaPreview() {
//    AndroidcomposeintroducaoTheme {
//        MinhaContaScreen(rememberNavController())
//    }
//}