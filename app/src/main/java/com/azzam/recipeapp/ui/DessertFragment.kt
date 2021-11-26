package com.azzam.recipeapp.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.GridLayoutManager
import com.azzam.recipeapp.R
import com.azzam.recipeapp.adapter.RecipesAdapter
import com.azzam.recipeapp.data.DataRecipe
import com.azzam.recipeapp.databinding.FragmentBreakfastBinding
import com.azzam.recipeapp.databinding.FragmentDessertBinding


class DessertFragment : Fragment() {
        private var _binding: FragmentDessertBinding? = null
        private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentDessertBinding.inflate(inflater, container, false)

        binding.rvDessert.apply {
            setHasFixedSize(true)
            layoutManager = GridLayoutManager(context, 2)
            adapter =  RecipesAdapter(DataRecipe.listDessert)
        }
        return binding.root
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }


}