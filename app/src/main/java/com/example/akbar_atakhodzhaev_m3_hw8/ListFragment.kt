package com.example.akbar_atakhodzhaev_m3_hw8

import android.content.Intent
import android.graphics.BitmapFactory
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.os.bundleOf
import androidx.navigation.fragment.findNavController
import com.example.akbar_atakhodzhaev_m3_hw8.List
import com.example.akbar_atakhodzhaev_m3_hw8.databinding.ListMainBinding

class ListFragment : Fragment() {
    private lateinit var binding: ListMainBinding
    private lateinit var listAdapter: ListAdapter
    private val list = ArrayList<List>()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = ListMainBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initAdapter()
        initList()
    }

    private fun initAdapter() {
        listAdapter = ListAdapter(list, this::onClick)
        binding.rvList.adapter = listAdapter
    }

    private fun initList() {
        val rickBitmap = BitmapFactory.decodeResource(resources, R.drawable.rick)
        val mortyBitmap = BitmapFactory.decodeResource(resources, R.drawable.morty)
        val jerryBitmap = BitmapFactory.decodeResource(resources, R.drawable.jerry)

        list.add(List("Рик", "Живой", rickBitmap))
        list.add(List("Морти", "Живой", mortyBitmap))
        list.add(List("Джерри", "Живой", jerryBitmap))
    }

    private fun onClick(position: Int) {
        val selectedListItem = list[position]
        val imageBitmap = selectedListItem.image

        val bundle = bundleOf(
            "name" to selectedListItem.name,
            "status" to selectedListItem.status,
            "imageBitmap" to imageBitmap
        )

        findNavController().navigate(R.id.openedFragment, bundle)
    }


}




