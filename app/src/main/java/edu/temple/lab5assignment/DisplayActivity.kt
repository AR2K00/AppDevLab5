package edu.temple.lab5assignment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class DisplayActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_display)

        val bundle = intent.extras
        val image_id = intent.getIntExtra("resourceID", 1)
        val image_description = intent.getStringExtra("Description")



    }
}