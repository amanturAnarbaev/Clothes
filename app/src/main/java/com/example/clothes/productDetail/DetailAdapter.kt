package com.example.clothes.productDetail

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.clothes.OnClick
import com.example.clothes.databinding.ItemDetailProductBinding

class DetailAdapter(private val list: ArrayList<DetalModel>, private val onClick: OnClick) :
    RecyclerView.Adapter<DetailAdapter.ViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(
            ItemDetailProductBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.onBind(list[position])
        holder.itemView.setOnClickListener {
            onClick.OnClicker(position)
        }

    }

    override fun getItemCount(): Int {
        return list.size

    }

    inner class ViewHolder(private val binding: ItemDetailProductBinding) :
        RecyclerView.ViewHolder(binding.root) {
        @SuppressLint("SetTextI18n")
        fun onBind(detalModel: DetalModel) {
            binding.image.setImageResource(detalModel.image)
            binding.price.text = "$" + detalModel.price

        }

    }
}