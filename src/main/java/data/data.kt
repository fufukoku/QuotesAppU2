package data

import com.example.quotesappu2.R
import model.Quote


class data {
    fun loadQuotes(): List<Quote>{
        return listOf<Quote>(
            Quote(R.string.quotes1, R.drawable.author1, R.string.author1),
            Quote(R.string.quotes2, R.drawable.author2, R.string.author2),
            Quote(R.string.quotes3, R.drawable.author3, R.string.author3),
            Quote(R.string.quotes4, R.drawable.author4, R.string.author4),
            Quote(R.string.quotes5, R.drawable.author5, R.string.author5),
            Quote(R.string.quotes6, R.drawable.author6, R.string.author6),
            Quote(R.string.quotes7, R.drawable.author7, R.string.author7),
            Quote(R.string.quotes8, R.drawable.author8, R.string.author8),
            Quote(R.string.quotes9, R.drawable.author9, R.string.author9),
            Quote(R.string.quotes10, R.drawable.author10, R.string.author10)
        )
    }
}