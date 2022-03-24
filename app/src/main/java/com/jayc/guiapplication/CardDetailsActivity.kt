package com.jayc.guiapplication

import android.os.Bundle
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.button.MaterialButton
import com.google.android.material.textview.MaterialTextView

class CardDetailsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_card_details)

        val cardHolderNameEditText = findViewById<EditText>(R.id.card_holder_name_input)
        val cardNumberEditText = findViewById<EditText>(R.id.card_number_input)
        val cardExpiryEditText = findViewById<EditText>(R.id.card_expiry_input)
        val cardCVVEditText = findViewById<EditText>(R.id.card_cvv_input)

        val enterBtn = findViewById<MaterialButton>(R.id.enter_button)
        enterBtn.setOnClickListener {
            val cardHolderName = cardHolderNameEditText.text
            val cardNumber = cardNumberEditText.text
            val cardExpiry = cardExpiryEditText.text
            val cardCVV = cardCVVEditText.text

            Toast.makeText(
                this,
                "Card Holder: $cardHolderName \n Card Number: $cardNumber \n Expiry Date: $cardExpiry \n CVV: $cardCVV ",
                Toast.LENGTH_SHORT
            ).show()

        }


    }
}