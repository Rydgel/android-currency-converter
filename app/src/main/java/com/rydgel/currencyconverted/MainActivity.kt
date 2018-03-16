package com.rydgel.currencyconverted

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        title = "Currency converter"
        setContentView(R.layout.activity_main)
    }

    fun convertCurrency(buttonView: View) {
        val inputText = amountEditText.text.toString()
        val textResponse =
            inputText.toDoubleOrNull()
            ?.let { euros -> euros * 1.23 }
            ?.let { dollars -> String.format("Converted: $%.2f", dollars) }
            ?: "Can't convert input into a number"

        Toast.makeText(this, textResponse, Toast.LENGTH_LONG).show()
    }
}
