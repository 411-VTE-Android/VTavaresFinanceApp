package com.example.financeapp.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.AccountCircle
import androidx.compose.material.icons.rounded.Menu
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
import com.example.financeapp.models.User
import com.example.financeapp.models.currentUser
import com.example.financeapp.ui.theme.PrimaryTextBlack
import com.example.financeapp.ui.theme.ProfitsCardPurple
import com.example.financeapp.ui.theme.SalesCardOrange
import com.example.financeapp.ui.theme.SecondaryTextGrey

@Composable
fun TopBar(user: User) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 20.dp, vertical = 16.dp)
    ) {
        Box(
            modifier = Modifier
                .size(54.dp)
                .clip(CircleShape)
                .background(ProfitsCardPurple),
            contentAlignment = Alignment.Center
        ) {
            Icon(
                imageVector = Icons.Rounded.AccountCircle,
                contentDescription = "perfil",
                tint = PrimaryTextBlack,
                modifier = Modifier
                    .size(40.dp)
            )
        }

        Spacer(modifier = Modifier
            .width(12.dp))
        Column (
            modifier = Modifier
                .weight(1f)
                .padding(top = 4.dp)
        ){
            Text (
                text = "Hola ${user.name}",
                fontSize = 25.sp,
                fontWeight = FontWeight.ExtraBold,
                color = PrimaryTextBlack
            )
            Text (
                text = "Bienvenido",
                fontSize = 15.sp,
                color = SecondaryTextGrey
            )
            Text (
                text = "Saldo total: $${user.currentBalance}",
                fontSize = 14.sp,
                color = PrimaryTextBlack,
                fontWeight = FontWeight.Bold,
                modifier = Modifier
                    .padding(top = 5.dp)
            )
        }

        Icon(
            imageVector = Icons.Rounded.Menu,
            contentDescription = "menu",
            tint = PrimaryTextBlack,
            modifier = Modifier
                .size(32.dp)
                .padding(top = 11.dp)
        )
    }
}

@Preview(showBackground = true)
@Composable
fun TopBarPreview() {
    TopBar(user = currentUser)
}