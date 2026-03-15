package com.example.financeapp.models

import androidx.compose.ui.graphics.Color
import com.example.financeapp.ui.theme.ProfitsCardPurple
import com.example.financeapp.ui.theme.SalesCardOrange

data class SummaryCard (
    val title : String,
    val amount :  Double,
    val backgroundColor : Color
)

val summaryCardsData = listOf(
    SummaryCard("Ventas",280.99,SalesCardOrange),
    SummaryCard("Ganancias", 280.99, ProfitsCardPurple)
)