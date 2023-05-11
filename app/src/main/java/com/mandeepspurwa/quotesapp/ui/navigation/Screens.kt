package com.mandeepspurwa.quotesapp.ui.navigation

/**
 * App Name: Quotes App
 * Package Name: com.mandeepspurwa.quotesapp.ui.navigation
 * Author : Mandeep Singh
 * Email Id: officialmandeepsp@gmail.com
 * Date: Thu 11 May, 2023
 *
 **/
enum class  Route{
    QUOTE_LIST,
    QUOTE_DETAIL
}
sealed class Screens(val route: Route) {
    object Home: Screens(Route.QUOTE_LIST)
    object Quote_Details: Screens(Route.QUOTE_DETAIL)
}