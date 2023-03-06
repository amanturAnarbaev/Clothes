package com.example.clothes.NewProduct

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import com.example.clothes.OnClick
import com.example.clothes.R
import com.example.clothes.databinding.FragmentNewProductBinding

class NewProductFragment() : Fragment(), OnClick {

    private lateinit var binding: FragmentNewProductBinding

    private val list = ArrayList<ProductModel>()

    private val adapter = NewProductAdapter(list, this)


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentNewProductBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val meneger = StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.VERTICAL)
        binding.recycler.layoutManager = meneger

        binding.recycler.adapter = adapter

        loadInfo()
    }

    private fun loadInfo() {
        list.add(ProductModel(R.drawable.ic_1photo, "21WN reversible angora cardigan", "120", true))
        list.add(ProductModel(R.drawable.ic_2photo, "21WN reversible angora cardigan", "120", true))
        list.add(ProductModel(R.drawable.ic_3photo, "21WN reversible angora cardigan", "120", true))
        list.add(ProductModel(R.drawable.ic_4photo, "Oblong bag", "120", true))

    }

    override fun OnClicker(position: Int) {
        findNavController().navigate(
            NewProductFragmentDirections.actionNewProductFragmentToProductDetailFragment(
                list[position].price, list[position].image.toString()
            )
        )

    }
}


