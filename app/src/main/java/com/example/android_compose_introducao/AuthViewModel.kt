package com.example.android_compose_introducao

import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel

class AuthViewModel: ViewModel() {
    val autenticado = mutableStateOf(false)

    fun login(
        user: String,
        senha: String,
        onSuccess: () -> Unit,
        onError: (String) -> Unit
    ) {
        if (user == "Ana" && senha == "1234") {
            onSuccess()
        } else {
            onError("Usuário ou senha inválido")
        }
    }
}