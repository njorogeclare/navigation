package com.example.clare.ui.theme.screen.home
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.*
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

class homeScreen {
    @Composable
    fun HomeScreen() {
        Box {
//            Image(painter = painterResource(id = R.drawable.pl6), contentDescription = ".", contentScale = ContentScale.FillBounds,
//                modifier = Modifier.matchParentSize())
        }
        var selectedTab by remember { mutableStateOf("Home") }

        Surface(color = Color.LightGray) {
            Row(
                modifier = Modifier
                    .padding(16.dp)
                    .fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically

            ) {
                Text(
                    text = "Mama Power",
                    style = MaterialTheme.typography.headlineMedium,
                    fontWeight = FontWeight.Bold
                )
                Row {
                    NavigationButton("Home", selectedTab == "Home") { selectedTab = "Home" }
                    NavigationButton("About Us", selectedTab == "About Us") { selectedTab = "About Us" }
                    NavigationButton("Contact", selectedTab == "Contact") { selectedTab = "Contact" }
                    NavigationButton("Login", selectedTab == "Login") { selectedTab = "Login" }
                }
            }
        }
    }

    @Composable
    fun NavigationButton(text: String, isSelected: Boolean, onClick: () -> Unit) {
        TextButton(onClick = onClick) {
            Text(
                text = text,
                style = MaterialTheme.typography.bodyMedium,
                color = if (isSelected) MaterialTheme.colorScheme.primary else Color.Black
            )
        }
    }

    @Preview
    @Composable
    fun HomeScreenPreview() {
        HomeScreen()
    }

}