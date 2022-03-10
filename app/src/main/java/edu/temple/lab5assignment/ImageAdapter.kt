package edu.temple.lab5assignment
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView

class ImageAdapter (_images: Array<DBZ>, _RecyclerFunc: (DBZ)->Unit): RecyclerView.Adapter<ImageAdapter.ViewHolder>(){
    private val arrOfImages = _images
    val EventFunc = _RecyclerFunc

    inner class ViewHolder(_view: ImageView): RecyclerView.ViewHolder(_view){
        lateinit var image: DBZ
        val imageView = _view.apply { setOnClickListener{EventFunc(image)}}
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(ImageView(parent.context).apply { layoutParams = ViewGroup.LayoutParams(600,600) })
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.imageView.setImageResource(arrOfImages[position].resourceIDval)
        holder.image = arrOfImages[position]
    }

    override fun getItemCount(): Int {
        return arrOfImages.size
    }


}


