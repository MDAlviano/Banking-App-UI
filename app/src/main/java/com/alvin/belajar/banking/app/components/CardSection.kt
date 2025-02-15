package com.alvin.belajar.banking.app.components

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import com.alvin.belajar.banking.app.data.Card
import com.alvin.belajar.banking.app.ui.theme.BlueEnd
import com.alvin.belajar.banking.app.ui.theme.BlueStart
import com.alvin.belajar.banking.app.ui.theme.GreenEnd
import com.alvin.belajar.banking.app.ui.theme.GreenStart
import com.alvin.belajar.banking.app.ui.theme.OrangeEnd
import com.alvin.belajar.banking.app.ui.theme.OrangeStart
import com.alvin.belajar.banking.app.ui.theme.PurpleEnd
import com.alvin.belajar.banking.app.ui.theme.PurpleStart

val cards = listOf(
    Card(
        cardType = "VISA",
        cardNumber = "1234 5678 9012 3456",
        cardName = "Business",
        balance = 46.467,
        color = getGradient(PurpleStart, PurpleEnd)
    ),
    Card(
        cardType = "MASTER CARD",
        cardNumber = "1234 5678 9012 3456",
        cardName = "Savings",
        balance = 6.467,
        color = getGradient(BlueStart, BlueEnd)
    ),
    Card(
        cardType = "VISA",
        cardNumber = "1234 5678 9012 3456",
        cardName = "School",
        balance = 6.891,
        color = getGradient(OrangeStart, OrangeEnd)
    ),
    Card(
        cardType = "MASTER CARD",
        cardNumber = "1234 5678 9012 3456",
        cardName = "Trips",
        balance = 16.891,
        color = getGradient(GreenStart, GreenEnd)
    ),
)

fun getGradient(
    startColor: Color,
    endColor: Color
): Brush {
    return Brush.horizontalGradient(
        colors = listOf(startColor, endColor)
    )
}

@Composable
fun CardsSection() {

}