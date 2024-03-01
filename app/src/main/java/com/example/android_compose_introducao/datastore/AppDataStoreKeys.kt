package com.example.android_compose_introducao.datastore

import androidx.datastore.preferences.core.booleanPreferencesKey

object AppDataStoreKeys {
    val AUTENTICADO = booleanPreferencesKey("autenticado")
}