package com.mandeepspurwa.quotesapp.data.repository

import android.content.Context
import com.google.gson.Gson
import com.mandeepspurwa.quotesapp.data.model.Quote

/**
 * App Name: Quotes App
 * Package Name: com.mandeepspurwa.quotesapp.data.repository
 * Author : Mandeep Singh
 * Email Id: officialmandeepsp@gmail.com
 * Date: Tue 09 May, 2023
 *
 **/
object DataRepository {
    var quotesList = emptyArray<Quote>()
    fun loadQuotes(context: Context){
        val inputStream = context.assets.open("quotes.json")
        val jsonString = inputStream.bufferedReader().use { it.readText() }
        val gson = Gson()
        quotesList = gson.fromJson(jsonString, Array<Quote>::class.java)
    }
}