package com.example.financeapp.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.financeapp.models.Transaction
import com.example.financeapp.models.transactionsData
import com.example.financeapp.ui.theme.PrimaryTextBlack
import com.example.financeapp.ui.theme.SecondaryTextGrey

@Composable
fun TransactionSection(transactions: List<Transaction>) {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 20.dp)
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(bottom = 15.dp),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.Bottom
        ) {
            Text(
                text = "Transactions",
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold,
                color = PrimaryTextBlack
            )
            Text(
                text = "See All",
                fontSize = 15.sp,
                color = SecondaryTextGrey,
                fontWeight = FontWeight.Medium
            )
        }

        LazyColumn(
            modifier = Modifier
                .fillMaxWidth(),
            verticalArrangement = Arrangement.spacedBy(10.dp)
        ) {
            items(transactions) { transaction ->
                TransactionCard(transaction = transaction)
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun TransactionSectionPreview() {
    TransactionSection(transactions = transactionsData)
}