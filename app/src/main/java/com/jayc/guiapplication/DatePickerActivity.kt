package com.jayc.guiapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.DatePicker
import android.widget.Toast

class DatePickerActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_date_picker)

        val datePicker = findViewById<DatePicker>(R.id.date_picker)
        val dateEnterBtn = findViewById<Button>(R.id.date_enter_button)
        dateEnterBtn.setOnClickListener {

            val day = datePicker.dayOfMonth
            val month = (datePicker.month + 1)
            val year = datePicker.year

            Toast.makeText(this, "Date: $day / $month / $year", Toast.LENGTH_SHORT).show()
        }


    }
}
