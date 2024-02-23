package com.example.android_compose_introducao

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
<<<<<<< HEAD
import com.example.android_compose_introducao.ui.theme.AndroidcomposeintroducaoTheme
=======
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.android_compose_introducao.ui.InicioScreen
import com.example.android_compose_introducao.ui.LoginScreen
import com.example.android_compose_introducao.ui.theme.AndroidcomposeintroducaoTheme
import com.example.composeintroduoaula.ui.MinhaContaScreen
>>>>>>> 70a824c (fazendo de minha conta)

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
<<<<<<< HEAD
=======
            val navController = rememberNavController()
            
>>>>>>> 70a824c (fazendo de minha conta)
            AndroidcomposeintroducaoTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
<<<<<<< HEAD
                    Greeting("Android")
=======
                    NavHost(
                        navController = navController,
                        startDestination = "login") {

                        composable( "inicio") {
                            InicioScreen(navController)
                        }
                        composable("login"){
                            LoginScreen(navController)
                        }
                        composable("minha-conta") {
                            MinhaContaScreen(navController)
                        }
                    }
>>>>>>> 70a824c (fazendo de minha conta)
                }
            }
        }
    }
<<<<<<< HEAD
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    AndroidcomposeintroducaoTheme {
        Greeting("Android")
    }
=======
>>>>>>> 70a824c (fazendo de minha conta)
}