package com.garmin.android.stockmarketer

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), AdapterView.OnItemSelectedListener {
    override fun onNothingSelected(parent: AdapterView<*>?) { }

    override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {
        Toast.makeText(this, categories[position], Toast.LENGTH_LONG).show()
    }

    private val categories = arrayOf("Finance", "Technology", "Social Media", "Constructions")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setSpinner()

    }

    private fun setSpinner() {
        val adapter = ArrayAdapter(this, android.R.layout.simple_spinner_dropdown_item, categories)
        categorySpinner.apply {
            this.adapter = adapter
            this.onItemSelectedListener = this@MainActivity
        }

    }
}
