package com.jayc.guiapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.RadioButton
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        Toast.makeText(this, "Recycler View used here!", Toast.LENGTH_SHORT).show()

        val recyclerview = findViewById<RecyclerView>(R.id.components_recyclerview)

        recyclerview.layoutManager = LinearLayoutManager(this)
        val componentsList = arrayOf<String>("RatingBar", "Toast", "Debit Card Info (EditText & Button)", "RadioButton", "CheckBox", "ProgressBar", "DatePicker")

        val adapter = ComponentsAdapter(componentsList)

        recyclerview.adapter = adapter
        adapter.setOnItemClickListener(object : ComponentsAdapter.onItemClickListener{
            override fun onItemClick(position: Int) {
                Toast.makeText(this@MainActivity, "Clicked on $position", Toast.LENGTH_SHORT).show()
                when(position){
                    0 -> {openRatingActivity()}

                    1 -> {Toast.makeText(this@MainActivity, "THIS IS TOAST!!", Toast.LENGTH_LONG).show()}

                    2 -> {openCardDetailsActivity()}

                    3 -> {openRadioButtonActivity()}

                    4 -> {openCheckBoxActivity()}

                    5 -> {openProgressBarActivity()}

                    6 -> {openDatePickerActivity()}

                }

            }

        })
    }

    fun openRatingActivity(){
        val intent = Intent(this, RatingBarActivity::class.java)
        startActivity(intent)
    }
    fun openCardDetailsActivity(){
        val intent = Intent(this, CardDetailsActivity::class.java)
        startActivity(intent)
    }
    fun openRadioButtonActivity(){
        val intent = Intent(this, RadioButtonActivity::class.java)
        startActivity(intent)
    }
    fun openCheckBoxActivity(){
        val intent = Intent(this, CheckBoxActivity::class.java)
        startActivity(intent)
    }
    fun openDatePickerActivity(){
        val intent = Intent(this, DatePickerActivity::class.java)
        startActivity(intent)
    }
    fun openProgressBarActivity(){
        val intent = Intent(this, ProgressBarActivity::class.java)
        startActivity(intent)
    }
}