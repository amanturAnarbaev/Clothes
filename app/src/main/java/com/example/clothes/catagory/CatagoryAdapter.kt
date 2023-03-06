package com.example.clothes.catagory

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.clothes.databinding.ItemCatagoryBinding

class CatagoryAdapter(private val list: ArrayList<CatagoryModel>) :
    RecyclerView.Adapter<CatagoryAdapter.ViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(
            ItemCatagoryBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.onBind(list[position])
    }

    override fun getItemCount(): Int {
        return list.size
    }

    inner class ViewHolder(private val binding: ItemCatagoryBinding) :
        RecyclerView.ViewHolder(binding.root) {
        @SuppressLint("SetTextI18n")
        fun onBind(catagoryModel: CatagoryModel) {
            binding.price.text="$"+catagoryModel.price+".00"
            binding.image.setImageResource(catagoryModel.image)
            binding.description.text=catagoryModel.description
        }


    }
}