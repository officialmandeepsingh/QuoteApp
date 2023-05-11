package com.mandeepspurwa.quotesapp.ui.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.mandeepspurwa.quotesapp.ui.screen.QuoteList

/**
 * App Name: Quotes App
 * Package Name: com.mandeepspurwa.quotesapp.ui.navigation
 * Author : Mandeep Singh
 * Email Id: officialmandeepsp@gmail.com
 * Date: Thu 11 May, 2023
 *
 **/
@Composable
fun Navigation(navHostController: NavHostController) {
    NavHost(navController = navHostController, startDestination = Route.QUOTE_LIST.name) {
        composable(Screens.Home.route.name) { QuoteList(navHostController) }
        composable(
            "${Screens.Quote_Details.route.name}/{quoteId}",
            arguments = listOf(navArgument("userId") { type = NavType.StringType })
        ) {
            QuoteList(navHostController)
        }
    }
}

@Composable
@Preview
fun PreviewNavigation() {
    Navigation(rememberNavController())
}