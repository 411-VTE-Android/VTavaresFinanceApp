package com.example.financeapp.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Mood
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.financeapp.models.SummaryCard
import com.example.financeapp.models.summaryCardsData
import com.example.financeapp.ui.theme.ActivityCardGreen
import com.example.financeapp.ui.theme.PrimaryTextBlack
import com.example.financeapp.ui.theme.SecondaryTextGrey

@Composable
fun SummarySection(cards: List<SummaryCard>) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 20.dp)
            .height(200.dp),
        horizontalArrangement = Arrangement.spacedBy(16.dp)
    ) {
        Column(
            modifier = Modifier
                .weight(1f)
                .fillMaxHeight()
                .clip(RoundedCornerShape(16.dp))
                .background(ActivityCardGreen)
                .padding(16.dp),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Icon(
                imageVector = Icons.Rounded.Mood,
                contentDescription = "Actividad",
                tint = PrimaryTextBlack,
                modifier = Modifier
                    .size(32.dp)
                    .padding(bottom = 4.dp)
            )
            Text(
                text = "Actividad",
                fontSize = 18.sp,
                fontWeight = FontWeight.Bold,
                color = PrimaryTextBlack
            )
            Text(
                text = "de la Semana",
                fontSize = 12.sp,
                color = SecondaryTextGrey
            )
        }

        Column(
            modifier = Modifier
                .weight(1f)
                .fillMaxHeight(),
            verticalArrangement = Arrangement.spacedBy(16.dp)
        ) {
            cards.forEach { card ->
                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .weight(1f)
                        .clip(RoundedCornerShape(16.dp))
                        .background(card.backgroundColor)
                        .padding(16.dp),
                    verticalArrangement = Arrangement.Center,
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Text(
                        text = card.title,
                        fontSize = 14.sp,
                        color = SecondaryTextGrey,
                        modifier = Modifier
                            .padding(bottom = 4.dp)
                    )
                    Text(
                        text = "$${card.amount}",
                        fontSize = 18.sp,
                        fontWeight = FontWeight.Bold,
                        color = PrimaryTextBlack
                    )
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun SummarySectionPreview() {
    SummarySection(cards = summaryCardsData)
}