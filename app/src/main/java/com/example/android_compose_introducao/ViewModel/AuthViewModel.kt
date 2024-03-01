package com.example.android_compose_introducao.ViewModel

import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.android_compose_introducao.datastore.AppDataStore
import com.example.android_compose_introducao.datastore.AppDataStoreKeys
import dagger.hilt.android.lifecycle.HiltViewModel
import dagger.hilt.android.scopes.ViewModelScoped
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class AuthViewModel @Inject constructor(
    private val appDataStore: AppDataStore
): ViewModel() {
    val autenticado = mutableStateOf(false)

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


        if (user == "Ana" && senha == "1234") {
            viewModelScope.launch {
                //delay(2000)
                appDataStore.putBoolean(AppDataStoreKeys.AUTENTICADO, true).apply { onSuccess()  }
            }

        } else {
            onError("Usuário ou senha inválido")
        }
    }

    fun logout() {
        viewModelScope.launch {
            appDataStore.putBoolean(AppDataStoreKeys.AUTENTICADO, true)
        }
    }
}