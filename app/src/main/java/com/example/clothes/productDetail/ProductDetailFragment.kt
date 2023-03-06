package com.example.clothes.productDetail

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.clothes.OnClick
import com.example.clothes.R
import com.example.clothes.databinding.FragmentProductDetailBinding


class ProductDetailFragment : Fragment(), OnClick {
    private val list = ArrayList<DetalModel>()
    private val adapter = DetailAdapter(list, this)
    private lateinit var navArgs: ProductDetailFragmentArgs
    private lateinit var binding: FragmentProductDetailBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentProductDetailBinding.inflate(layoutInflater)
        return binding.root
    }

    @SuppressLint("ResourceAsColor")
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.detailRecycle.adapter = adapter

        //надо принять фото и картину


        loadInfo()

    }

    private fun loadInfo() {
        list.add(DetalModel(R.drawable.ic_4photo, 120.00.toString()))
        list.add(DetalModel(R.drawable.ic_2photo, 120.00.toString()))

    }

    override fun OnClicker(position: Int) {
        findNavController().navigate(ProductDetailFragmentDirections.actionProductDetailFragmentToCatagoryFragment())
    }
}


