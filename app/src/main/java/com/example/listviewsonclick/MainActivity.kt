package com.example.listviewsonclick

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_fruits_name.view.*
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val fruits = arrayOf<String>(
            "Apple",
            "Banana",
            "Kiwi",
            "Peach",
            "Orange",
            "Grapes",
            "Watermelon",
            "Berry",
            "Apple",
            "Banana",
            "Kiwi",
            "Peach",
            "Orange",
            "Grapes",
            "Watermelon",
            "Berry"
        )

        lv_fruitsName.adapter = ArrayAdapter<String>(
            this,
            R.layout.activity_fruits_name,
            R.id.textView,
            fruits,
        )

        lv_fruitsName.setOnItemClickListener { parent, view, position, id ->
            Toast.makeText(this, "Clicked on ${view.textView.text} at ${position+1}", Toast.LENGTH_LONG).show()
        }
    }
}