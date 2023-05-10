package com.mandeepspurwa.quotesapp.ui.elements

import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.ExperimentalTextApi
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.mandeepspurwa.quotesapp.data.model.Quote

/**
 * App Name: Quotes App
 * Package Name: com.mandeepspurwa.quotesapp.ui.elements
 * Author : Mandeep Singh
 * Email Id: officialmandeepsp@gmail.com
 * Date: Wed 10 May, 2023
 *
 **/
@OptIn(ExperimentalTextApi::class)
@Composable
fun QuoteItem(quote: Quote, onClick: () -> Unit) {
    val gradientColors = listOf(Color.Cyan, Color.Blue)
    Card(
        elevation = CardDefaults.cardElevation(8.dp),
        modifier = Modifier
            .padding(7.dp)
            .border(
                width = 1.dp,
                brush = Brush.linearGradient(gradientColors),
                shape = RoundedCornerShape(10.dp)
            )
            .clickable { onClick()}


    ) {
        Column(modifier = Modifier.padding(10.dp)) {
            Text(
                text = quote.quote,
                fontSize = 15.sp,
                maxLines = 2,
                overflow = TextOverflow.Ellipsis,
                fontWeight = FontWeight.Bold,
            )
            Text(text = quote.author, fontSize = 10.sp)
        }
    }
}

@Preview
@Composable
fun PreviewQuoteItem() {
    QuoteItem(Quote("quote here", "author name")){}
}