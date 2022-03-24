package com.jayc.guiapplication

import android.os.Bundle
import android.widget.Button
import android.widget.ProgressBar
import androidx.appcompat.app.AppCompatActivity

class ProgressBarActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_progress_bar)

        val progressBar = findViewById<ProgressBar>(R.id.progress_bar)


        val tenPercentBtn = findViewById<Button>(R.id.set_ten_percent)
        val twentyPercentBtn = findViewById<Button>(R.id.set_twenty_percent)
        val thirtyPercentBtn = findViewById<Button>(R.id.set_thirty_percent)
        val fiftyPercentBtn = findViewById<Button>(R.id.set_fifty_percent)
        val sixtyPercentBtn = findViewById<Button>(R.id.set_sixty_percent)
        val hundredPercentBtn = findViewById<Button>(R.id.set_hundred_percent)

        tenPercentBtn.setOnClickListener {
            progressBar.progress = 10
        }

        twentyPercentBtn.setOnClickListener {
            progressBar.progress = 20
        }

        thirtyPercentBtn.setOnClickListener {
            progressBar.progress = 30
        }

        fiftyPercentBtn.setOnClickListener {
            progressBar.progress = 50
        }

        sixtyPercentBtn.setOnClickListener {
            progressBar.progress = 60
        }

        hundredPercentBtn.setOnClickListener {
            progressBar.progress = 100
        }


    }
}