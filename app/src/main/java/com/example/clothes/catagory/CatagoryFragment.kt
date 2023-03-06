package com.example.clothes.catagory

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import com.example.clothes.R
import com.example.clothes.databinding.FragmentCatagoryFragmentBinding


class CatagoryFragment : Fragment() {
    private lateinit var binding: FragmentCatagoryFragmentBinding
    private val list=ArrayList<CatagoryModel>()
    private val adapter=CatagoryAdapter(list)


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentCatagoryFragmentBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val meneger = StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.VERTICAL)
        binding.recycler.layoutManager = meneger

        binding.recycler.adapter=adapter

        list.add(CatagoryModel("21WN reversible angora cardigan","120", R.drawable.ic_4photo))
        list.add(CatagoryModel("21WN reversible angora cardigan","120", R.drawable.ic_4photo))
    }


}