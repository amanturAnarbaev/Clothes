package com.example.clothes.NewProduct

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.core.view.isVisible
import androidx.recyclerview.widget.RecyclerView
import com.example.clothes.OnClick
import com.example.clothes.databinding.ItemNewProductBinding

class NewProductAdapter(private val list: ArrayList<ProductModel>, private val onClick: OnClick) :
    RecyclerView.Adapter<NewProductAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(
            ItemNewProductBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        )
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.onBind(list[position])
        holder.itemView.setOnClickListener { onClick.OnClicker(position) }

    }

    override fun getItemCount(): Int {
        return list.size
    }

    inner class ViewHolder(private val binding: ItemNewProductBinding) :
        RecyclerView.ViewHolder(binding.root) {
        @SuppressLint("SetTextI18n")
        fun onBind(productModel: ProductModel) {
            binding.description.text = productModel.description
            binding.image.setImageResource(productModel.image)
            binding.price.text = "$" + productModel.price
            binding.wordNew.isVisible = productModel.isNew

        }

    }
}