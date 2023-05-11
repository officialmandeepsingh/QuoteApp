package com.mandeepspurwa.quotesapp.ui.screen

import android.util.Log
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.itemsIndexed
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavHostController
import com.mandeepspurwa.quotesapp.data.model.Quote
import com.mandeepspurwa.quotesapp.data.repository.QuotesData
import com.mandeepspurwa.quotesapp.ui.elements.QuoteItem

/**
 * App Name: Quotes App
 * Package Name: com.mandeepspurwa.quotesapp.ui.screen
 * Author : Mandeep Singh
 * Email Id: officialmandeepsp@gmail.com
 * Date: Wed 10 May, 2023
 *
 **/
@Composable
fun QuoteList(navController: NavHostController?) {
    val quotesList = arrayOf(
        Quote("quote", "author"),
        Quote("quote", "author"),
        Quote("quote", "author"),
        Quote("quote", "author"),
        Quote("quote", "author"),
        Quote("quote", "author"),
        Quote("quote", "author")
    )

    /*LazyColumn(content = {
        items(items = quotesList) {
            QuoteItem(quote = it)
        }
    })*/

    LazyVerticalGrid(columns = GridCells.Fixed(2)) {
        itemsIndexed(QuotesData.data) { index, it ->
            QuoteItem(quote = it) {
                Log.d("TAG", "QuoteList() called: ${index}")
                Log.d("TAG", "QuoteList() called: ${QuotesData.data.get(index).toString()}")

            }
        }
    }
}