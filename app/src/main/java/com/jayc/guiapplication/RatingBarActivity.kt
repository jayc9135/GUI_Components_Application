package com.jayc.guiapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.RatingBar
import android.widget.Toast

class RatingBarActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_rating_bar)

        val ratingBar = findViewById<RatingBar>(R.id.ratingbar)

        val submitBtn = findViewById<Button>(R.id.rating_submit_button)
        submitBtn.setOnClickListener {
            val msg = ratingBar.rating.toString()
            Toast.makeText(this, "Rating is: $msg", Toast.LENGTH_SHORT).show()
        }

    }
}