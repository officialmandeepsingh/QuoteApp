package com.mandeepspurwa.quotesapp.ui.screen

import android.util.Log
import android.widget.Toast
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.itemsIndexed
import androidx.compose.material3.AlertDialog
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
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

    LazyVerticalGrid(columns = GridCells.Fixed(2)) {
        itemsIndexed(QuotesData.data) { index, it ->
            QuoteItem(quote = it) {
                Log.d("TAG", "QuoteList() called: ${index}")
                Log.d("TAG", "QuoteList() called: ${QuotesData.data.get(index).toString()}")
//                ShowAlertDialog(it)
            }
        }
    }
}


@Composable
fun ShowAlertDialog(quote: Quote) {
    val openDialog by rememberSaveable { mutableStateOf(true) }
    AlertDialog(
        title = { Text(text = "Geeks for Geeks", color = Color.White) },
        onDismissRequest = {  },
        // below line is use to display
        // description to our alert dialog.
        text = { Text("Hello! This is our Alert Dialog..", color = Color.White) },
        confirmButton = {
            // below line we are adding on click
            // listener for our confirm button.
            TextButton(
                onClick = {
//                    openDialog.value = false

                }
            ) {
                // in this line we are adding
                // text for our confirm button.
                Text("Confirm", color = Color.White)
            }
        },
    )
}