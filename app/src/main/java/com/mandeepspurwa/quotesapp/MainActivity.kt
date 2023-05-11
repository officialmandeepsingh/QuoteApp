package com.mandeepspurwa.quotesapp

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.rememberNavController
import com.mandeepspurwa.quotesapp.data.repository.DataRepository
import com.mandeepspurwa.quotesapp.ui.navigation.Navigation
import com.mandeepspurwa.quotesapp.ui.screen.QuoteList
import com.mandeepspurwa.quotesapp.ui.theme.QuotesAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            QuotesAppTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    MyApp()
//                    Greeting(name = "demo")
                }
            }
        }
    }
}

@Composable
fun MyApp(){
    val navController = rememberNavController()
    Navigation(navHostController = navController)
}
@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Log.d("TAG", "load Data: ${DataRepository.quotesList.size} ")
    QuoteList(rememberNavController())
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    QuotesAppTheme {
        Greeting("Android")
    }
}