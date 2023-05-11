package com.mandeepspurwa.quotesapp.ui.screen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.mandeepspurwa.quotesapp.data.repository.QuotesData
import com.mandeepspurwa.quotesapp.ui.elements.QuoteItem

/**
 * App Name: Quotes App
 * Package Name: com.mandeepspurwa.quotesapp.ui.screen
 * Author : Mandeep Singh
 * Email Id: officialmandeepsp@gmail.com
 * Date: Thu 11 May, 2023
 *
 **/

@Composable
fun QuoteDetail(navController: NavHostController?) {
    val quoteId = navController?.currentBackStackEntry?.arguments?.getString("quoteId") ?: "1"
    Box(
        contentAlignment = Alignment.Center,
        modifier = Modifier
            .fillMaxSize()
            .background(color = Color.Gray)
    ) {
        Card(elevation = CardDefaults.cardElevation(8.dp), modifier = Modifier.padding(30.dp)) {
            QuoteItem(quote = QuotesData.data[quoteId.toInt()]) {}
        }
    }


}


@Composable
@Preview
fun PreviewDetails() {
    QuoteDetail(navController = rememberNavController())
}