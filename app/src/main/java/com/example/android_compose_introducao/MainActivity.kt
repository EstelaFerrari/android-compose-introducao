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
import com.example.android_compose_introducao.ui.theme.AndroidcomposeintroducaoTheme
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.android_compose_introducao.ui.InicioScreen
import com.example.android_compose_introducao.ui.LoginScreen
import com.example.composeintroduoaula.ui.MinhaContaScreen

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            val navController = rememberNavController()

            AndroidcomposeintroducaoTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {

                    Greeting("Android")
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
                }
            }
        }
    }
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
}
