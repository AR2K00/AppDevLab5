package edu.temple.lab5assignment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import android.content.Intent
import androidx.recyclerview.widget.GridLayoutManager

class SelectionActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_selection)

        val images: Array<DBZ> = arrayOf(
            DBZ(R.drawable.beerus, "Beerus"),
            DBZ(R.drawable.broly,"Broly"),
            DBZ(R.drawable.cell, "Cell"),
            DBZ(R.drawable.frieza, "frieza"),
            DBZ(R.drawable.gohan, "Gohan"),
            DBZ(R.drawable.goku, "Goku"),
            DBZ(R.drawable.jiren, "Jiren"),
            DBZ(R.drawable.krillin, "Krillin"),
            DBZ(R.drawable.piccolo, "Piccolo"),
            DBZ(R.drawable.vegeta, "Vegeta"),
            DBZ(R.drawable.whis, "Whis")
        )

        val recyclerView = findViewById<RecyclerView>(R.id.Recycler)
        recyclerView.layoutManager = GridLayoutManager(this, 2)


        val RecyclerViewFunction = { selectedImage: DBZ ->
            val intent = Intent(this, DisplayActivity::class.java).apply {
                putExtra("resourceID", selectedImage.resourceIDval)
                putExtra("Description", selectedImage.description)
            }
            startActivity(intent)
        }

        recyclerView.adapter = ImageAdapter(images, RecyclerViewFunction)
    }
}