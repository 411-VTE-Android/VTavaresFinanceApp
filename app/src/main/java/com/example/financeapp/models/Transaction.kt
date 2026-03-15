package com.example.financeapp.models

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.rounded.MenuBook
import androidx.compose.material.icons.rounded.LocalCafe
import androidx.compose.material.icons.rounded.LocalGasStation
import androidx.compose.material.icons.rounded.MenuBook
import androidx.compose.material.icons.rounded.Restaurant
import androidx.compose.material.icons.rounded.ShoppingCart
import androidx.compose.material.icons.rounded.Tv
import androidx.compose.ui.graphics.vector.ImageVector

data class Transaction (
    val businessName : String,
    val category : String,
    val amount : Double,
    val time : String,
    val icon : ImageVector
)

val transactionsData = listOf(
    Transaction("Supermarket", "Groceries", 45.99, "10:30 AM", Icons.Rounded.ShoppingCart),
    Transaction("Gas Station", "Fuel", -30.5, "12:15 PM", Icons.Rounded.LocalGasStation),
    Transaction("Coffee Shop", "Food & Drinks", 5.75, "8:00 AM", Icons.Rounded.LocalCafe),
    Transaction("Electronics Store", "Electronics", 120.0, "3:45 PM", Icons.Rounded.Tv),
    Transaction("Bookstore", "Books", 25.99, "2:00 PM", Icons.Rounded.MenuBook),
    Transaction("Restaurant", "Dining", 60.0, "7:30 PM", Icons.Rounded.Restaurant)
)