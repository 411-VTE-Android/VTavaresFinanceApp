package com.example.financeapp.models

data class User (
    val name: String,
    val currentBalance: Double
)

val currentUser = User ("Victor",10500.0
)