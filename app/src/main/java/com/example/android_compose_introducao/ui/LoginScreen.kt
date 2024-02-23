package com.example.android_compose_introducao.ui

<<<<<<< HEAD
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
=======
import androidx.compose.animation.animateColorAsState
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
>>>>>>> 70a824c (fazendo de minha conta)
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
<<<<<<< HEAD
=======
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavController
import com.example.android_compose_introducao.AuthViewModel
>>>>>>> 70a824c (fazendo de minha conta)
import com.example.android_compose_introducao.R
import com.example.android_compose_introducao.ui.theme.AndroidcomposeintroducaoTheme


@Composable
<<<<<<< HEAD
fun LoginScreen(){
=======
fun LoginScreen(
    navController: NavController
){
    val viewModel = viewModel<AuthViewModel>()
>>>>>>> 70a824c (fazendo de minha conta)
    var usuario by remember { mutableStateOf("") }
    var senha by remember { mutableStateOf("") }

    Surface(
        modifier = Modifier.fillMaxSize(),
<<<<<<< HEAD
        color = Color.LightGray
=======
        color = Color.DarkGray
>>>>>>> 70a824c (fazendo de minha conta)
    ) {
        Column(
            modifier = Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
<<<<<<< HEAD
            Image(painter = painterResource(id = R.drawable.ifro_campus_vertical),
=======
            Image(
                painter = painterResource(id = R.drawable.ifro_campus_vertical),
>>>>>>> 70a824c (fazendo de minha conta)
                contentDescription = null,
                modifier = Modifier
                    .padding(bottom = 24.dp)
                    .size(150.dp)
<<<<<<< HEAD
                )

            OutlinedTextField(value = usuario,
                onValueChange ={usuario = it},
                label = { Text("Usuário")},
                modifier = Modifier //.fillMaxWidth(),
                    .width(350.dp)
            )
            OutlinedTextField(value = senha,
                onValueChange ={senha = it},
                label = { Text("Senha")},
=======
            )

            OutlinedTextField(
                value = usuario,
                onValueChange = { usuario = it },
                label = { Text("Usuário") },
                modifier = Modifier //.fillMaxWidth(),
                    .width(350.dp)
            )
            OutlinedTextField(
                value = senha,
                onValueChange = { senha = it },
                label = { Text("Senha") },
>>>>>>> 70a824c (fazendo de minha conta)
                visualTransformation = PasswordVisualTransformation(),
                keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password),
                modifier = Modifier //.fillMaxWidth(),
                    .padding(10.dp)
                    .width(350.dp)
            )

<<<<<<< HEAD
            Button(onClick = { },
                colors = ButtonDefaults.run { buttonColors( Color.DarkGray) },
=======
        Row {


            Button(onClick = {
                viewModel.login(
                    usuario,
                    senha,
                    onSuccess = {
                        navController.navigate("inicio")
                    },
                    onError = {

                    }
                )

            }, colors = ButtonDefaults.run { buttonColors(Color.White) },
>>>>>>> 70a824c (fazendo de minha conta)
                modifier = Modifier
                    .padding(20.dp)
                    .width(200.dp)
            ) {
                Text("Entrar")

            }

<<<<<<< HEAD
=======

        }

>>>>>>> 70a824c (fazendo de minha conta)
        }
    }
}

<<<<<<< HEAD
@Preview(showBackground = true)
@Composable
fun LoginScreenPreview() {
    AndroidcomposeintroducaoTheme {
        LoginScreen()
    }
}
=======
//@Preview(showBackground = true)
//@Composable
//fun LoginScreenPreview() {
//    AndroidcomposeintroducaoTheme {
//        LoginScreen()
//    }
//}
>>>>>>> 70a824c (fazendo de minha conta)
