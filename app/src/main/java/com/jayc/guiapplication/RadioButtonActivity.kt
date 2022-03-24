package com.jayc.guiapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.Toast

class RadioButtonActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_radio_button)

        val questionOneRadioGroup = findViewById<RadioGroup>(R.id.question_one_options)

        val enterBtn = findViewById<Button>(R.id.enter_button)
        enterBtn.setOnClickListener {
            val selectedId = questionOneRadioGroup.checkedRadioButtonId
            val selectedRadioBtn = findViewById<RadioButton>(selectedId)
            if (selectedRadioBtn.text == "Delhi") {
                Toast.makeText(this, "Correct Answer", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(this, "Wrong Answer", Toast.LENGTH_SHORT).show()
            }
        }
    }
}