package com.example.financeapp.models

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.rounded.MenuBook
import androidx.compose.material.icons.rounded.Computer
import androidx.compose.material.icons.rounded.FitnessCenter
import androidx.compose.material.icons.rounded.LocalCafe
import androidx.compose.material.icons.rounded.LocalGasStation
import androidx.compose.material.icons.rounded.MenuBook
import androidx.compose.material.icons.rounded.PhoneIphone
import androidx.compose.material.icons.rounded.Restaurant
import androidx.compose.material.icons.rounded.ShoppingCart
import androidx.compose.material.icons.rounded.SportsEsports
import androidx.compose.material.icons.rounded.Storage
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
    Transaction("Electronics Store", "Electronics", 120.0, "3:45 PM", Icons.Rounded.PhoneIphone),
    Transaction("Bookstore", "Books", 25.99, "2:00 PM", Icons.Rounded.MenuBook),
    Transaction("Restaurant", "Dining", 60.0, "7:30 PM", Icons.Rounded.Restaurant),
    Transaction("Desarrollo Web Freelance", "Income", 500.00, "09:00 AM", Icons.Rounded.Computer),
    Transaction("Mantenimiento de Servidores", "Income", 350.00, "11:30 AM", Icons.Rounded.Computer),
    Transaction("Campestre Coffee Shop", "Food & Drinks", -12.50, "01:15 PM", Icons.Rounded.LocalCafe),
    Transaction("Videogames Store", "Entertainment", -60.00, "08:30 PM", Icons.Rounded.SportsEsports),
    Transaction("Gym", "Health", -35.00, "07:00 AM", Icons.Rounded.FitnessCenter),
    Transaction("Supermarket", "Groceries", -45.99, "10:30 AM", Icons.Rounded.ShoppingCart),
    Transaction("Gas Station", "Fuel", -30.50, "12:15 PM", Icons.Rounded.LocalGasStation),
    Transaction("Electronics Store", "Electronics", -120.00, "3:45 PM", Icons.Rounded.PhoneIphone)
)