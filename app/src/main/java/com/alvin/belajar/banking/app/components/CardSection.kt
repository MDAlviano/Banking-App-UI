package com.alvin.belajar.banking.app.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.alvin.belajar.banking.app.R
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
    LazyRow {
        items(cards.size) { index ->
            CartItem(index)
        }
    }
}

@Composable
fun CartItem(index: Int) {
    val card = cards[index]
    var lastItemPaddingEnd = 0.dp
    if (index == cards.size - 1) {
        lastItemPaddingEnd = 16.dp
    }

    var image = painterResource(id = R.drawable.ic_visa)
    if (card.cardType == "MASTER CARD") {
        image = painterResource(id = R.drawable.ic_mastercard)
    }
    
    Box(
        modifier = Modifier
            .padding(start = 16.dp, end = lastItemPaddingEnd)
    ) {
        Column(
            modifier = Modifier
                .clip(RoundedCornerShape(25.dp))
                .background(card.color)
                .width(250.dp)
                .height(160.dp)
                .clickable { }
                .padding(vertical = 12.dp, horizontal = 16.dp),
            verticalArrangement = Arrangement.SpaceBetween
        ) {
            
            Image(
                painter = image,
                contentDescription = card.cardName,
                modifier = Modifier.width(60.dp)
            )
            
            Spacer(modifier = Modifier.height(10.dp))
            
            Text(
                text = card.cardNumber,
                color = Color.White,
                fontSize = 17.sp,
                fontWeight = FontWeight.Bold
            )

            Text(
                text = "$${card.balance}",
                color = Color.White,
                fontSize = 22.sp,
                fontWeight = FontWeight.Bold
            )

            Text(
                text = card.cardNumber,
                color = Color.White,
                fontSize = 18.sp,
                fontWeight = FontWeight.Bold
            )
            
        }
    }
}
