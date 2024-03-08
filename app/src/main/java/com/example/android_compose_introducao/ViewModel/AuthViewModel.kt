package com.example.android_compose_introducao.ViewModel

import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.android_compose_introducao.datastore.AppDataStore
import com.example.android_compose_introducao.datastore.AppDataStoreKeys
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class AuthViewModel @Inject constructor(
    private val appDataStore: AppDataStore
): ViewModel() {
    val autenticado = mutableStateOf(false)
    var loading =  mutableStateOf(false)

    fun login(
        user: String,
        senha: String,
        onSuccess: () -> Unit,
        onError: (String) -> Unit
    ) {

        if(user.isEmpty()){
            onError("Informe o usuario")
        }

        if (senha.isEmpty())
            onError("Informe a senha")

        loading.value=true
        //API



        if (user == "Ana" && senha == "1234") {
            viewModelScope.launch {
                delay(2000)
                appDataStore.putBoolean(AppDataStoreKeys.AUTENTICADO, true).apply { onSuccess()  }
            }

        } else {
            onError("Usuário ou senha inválido")
        }
    }



    fun logout (onSuccess: () -> Unit) {
        loading.value=true

        viewModelScope.launch {
            delay(2000)
            appDataStore.putBoolean(AppDataStoreKeys.AUTENTICADO, true)
        }
    }
}