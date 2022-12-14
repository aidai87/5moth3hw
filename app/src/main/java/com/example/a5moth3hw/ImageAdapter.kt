package com.example.a5moth3hw

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import coil.load
import com.example.a5moth3hw.databinding.ActivityMainBinding
import com.example.a5moth3hw.databinding.ItemImageBinding

class ImageAdapter(private val list:ArrayList<ImageModel>):
    RecyclerView.Adapter<ImageAdapter.ImageViewHolder> () {
    class ImageViewHolder(private val binding: ItemImageBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun onBind(imageModel: ImageModel) {

            binding.imageView.load(imageModel.largeImageURL)
        }

    }


       fun addImage(imageModel: ImageModel){
           list.add(imageModel)
           notifyDataSetChanged()

}

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ImageViewHolder {
        return ImageViewHolder(
            ItemImageBinding.inflate(
                LayoutInflater.from(parent.context),
            parent,
            false
          )

        )
    }

    override fun onBindViewHolder(holder: ImageViewHolder, position: Int) {
        holder.onBind(list[position])
    }

    override fun getItemCount(): Int {
        return  list.size

    }

}
