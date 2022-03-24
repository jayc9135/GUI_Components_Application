package com.jayc.guiapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.CheckBox
import android.widget.Checkable
import android.widget.Toast

class CheckBoxActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_check_box)

        val cyclingCheckBox = findViewById<CheckBox>(R.id.question_one_cycling)
        val dancingCheckBox = findViewById<CheckBox>(R.id.question_one_dancing)
        val readingCheckBox = findViewById<CheckBox>(R.id.question_one_reading)
        val paintingCheckBox = findViewById<CheckBox>(R.id.question_one_painting)

        val enterBtn = findViewById<Button>(R.id.enter_button1)
        enterBtn.setOnClickListener {
            if (cyclingCheckBox.isChecked){
                Toast.makeText(this, "Cycling is Hobby!", Toast.LENGTH_SHORT).show()
            }
            if (dancingCheckBox.isChecked){
                Toast.makeText(this, "Dancing is Hobby!", Toast.LENGTH_SHORT).show()
            }
            if (readingCheckBox.isChecked){
                Toast.makeText(this, "Reading is Hobby!", Toast.LENGTH_SHORT).show()
            }
            if (paintingCheckBox.isChecked){
                Toast.makeText(this, "Painting is Hobby!", Toast.LENGTH_SHORT).show()
            }
        }
    }
}