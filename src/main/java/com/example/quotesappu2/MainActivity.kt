package com.example.quotesappu2

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.AbsoluteAlignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.quotesappu2.ui.theme.QuotesAppU2Theme
import data.data
import model.Quote

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            QuotesAppU2Theme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    QuotesApp()
                }
            }
        }
    }
}

@Composable

fun QuotesList(quotesList: List<Quote>, modifier:Modifier = Modifier)
{
    LazyColumn {
        items(quotesList){
                quote: Quote -> QuoteCard(quote = quote,
            modifier = Modifier.padding(8.dp))

        }
    }
}

@Composable
fun QuotesApp()
{
    QuotesList(
        quotesList = data().loadQuotes()
    )
}

@Composable
fun QuoteCard(quote: Quote, modifier: Modifier = Modifier)
{
    Card(modifier = modifier)
    {
        Column() {
            Row() {
                Text(
                    text = stringResource(id = quote.authorResourceId),
                    modifier = modifier.padding(10.dp),
                    style = MaterialTheme.typography.headlineSmall
                )
                Image(
                    painter = painterResource(id = quote.imageResourceId),
                    contentDescription = stringResource(id = quote.stringResourceId),
                    modifier = modifier
                        .padding(horizontal = 50.dp)
                        .height(194.dp),
                    contentScale = ContentScale.Crop
                )
            }
            Text(
                text = stringResource(id = quote.stringResourceId),
                modifier = modifier.padding(10.dp),
                style = MaterialTheme.typography.headlineSmall
            )
        }

    }
}

@Composable
@Preview
fun QuoteCardPreview()
{
    QuotesApp()
    //QuoteCard(Quote(R.string.quotes1, R.drawable.image1))
}

// string, image
// class quote()