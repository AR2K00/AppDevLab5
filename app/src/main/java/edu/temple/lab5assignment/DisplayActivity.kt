package edu.temple.lab5assignment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class DisplayActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_display)

        val bundle = intent.extras
        val image_id = intent.getIntExtra("resourceID", 1)
        val image_description = intent.getStringExtra("Description")

        val imageView = findViewById<ImageView>(R.id.DisplayedImage)
        val textView = findViewById<TextView>(R.id.DisplayedText)
        val button = findViewById<Button>(R.id.MyButton)

        imageView.setImageResource(image_id)
        textView.text = image_description
    }
}