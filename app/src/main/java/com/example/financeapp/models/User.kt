package com.example.financeapp.models

data class User (
    val name: String,
    val currentBalance: Double
)

val currentUser = User ("VIctor",10500.0
)