package com.mandeepspurwa.quotesapp.ui.screen

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyHorizontalGrid
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.mandeepspurwa.quotesapp.data.model.Quote
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
@Preview
fun QuoteList() {
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

    LazyVerticalGrid(columns = GridCells.Fixed(2) ){
        items(quotesList){
            QuoteItem(quote = it)
        }
    }
}