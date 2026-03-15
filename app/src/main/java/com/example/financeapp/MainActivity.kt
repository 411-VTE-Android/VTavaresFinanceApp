package com.example.financeapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.financeapp.components.SummarySection
import com.example.financeapp.components.TopBar
import com.example.financeapp.components.TransactionSection
import com.example.financeapp.models.currentUser
import com.example.financeapp.models.summaryCardsData
import com.example.financeapp.models.transactionsData
import com.example.financeapp.ui.theme.FinanceAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            FinanceAppTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Column(
                        modifier = Modifier
                            .fillMaxSize()
                            .padding(innerPadding)
                    ) {
                        TopBar(user = currentUser)
                        Spacer(modifier = Modifier.height(8.dp))

                        SummarySection(cards = summaryCardsData)
                        Spacer(modifier = Modifier.height(24.dp))

                        TransactionSection(transactions = transactionsData)
                    }
                }
                }
            }
        }
    }

