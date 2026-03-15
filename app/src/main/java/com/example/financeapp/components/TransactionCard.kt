package com.example.financeapp.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.financeapp.models.Transaction
import com.example.financeapp.models.transactionsData
import com.example.financeapp.ui.theme.PrimaryTextBlack
import com.example.financeapp.ui.theme.SecondaryTextGrey
import com.example.financeapp.ui.theme.TransactionItemBackground

@Composable
fun TransactionCard(transaction: Transaction) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .clip(RoundedCornerShape(16.dp))
            .background(TransactionItemBackground)
            .padding(16.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Box(
            modifier = Modifier
                .size(48.dp)
                .clip(CircleShape)
                .background(PrimaryTextBlack),
            contentAlignment = Alignment.Center
        ) {
            Icon(
                imageVector = transaction.icon,
                contentDescription = transaction.category,
                tint = Color.White,
                modifier = Modifier
                    .size(24.dp)
            )
        }

        Spacer(modifier = Modifier
            .width(16.dp))
        Column(modifier = Modifier
            .weight(1f)) {
            Text(
                text = transaction.businessName,
                fontSize = 16.sp,
                fontWeight = FontWeight.Bold,
                color = PrimaryTextBlack
            )
            Spacer(modifier = Modifier
                .height(4.dp))
            Text(
                text = transaction.category,
                fontSize = 12.sp,
                color = SecondaryTextGrey
            )
        }

        Column(horizontalAlignment = Alignment.End) {
            Text(
                text = "$${transaction.amount}",
                fontSize = 16.sp,
                fontWeight = FontWeight.Bold,
                color = PrimaryTextBlack
            )
            Spacer(modifier = Modifier
                .height(4.dp))
            Text(
                text = transaction.time,
                fontSize = 12.sp,
                color = SecondaryTextGrey
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun TransactionCardPreview() {
    TransactionCard(transaction = transactionsData[2])
}