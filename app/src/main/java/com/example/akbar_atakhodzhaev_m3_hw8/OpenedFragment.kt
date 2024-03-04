package com.example.akbar_atakhodzhaev_m3_hw8

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.graphics.Bitmap
import android.widget.TextView
import android.widget.ImageView



class OpenedFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_opened, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val name = arguments?.getString("name")
        val status = arguments?.getString("status")
        val imageBitmap = arguments?.getParcelable<Bitmap>("imageBitmap")

        val tvName = view.findViewById<TextView>(R.id.tvName)
        val tvStatus = view.findViewById<TextView>(R.id.tvStatus)
        val imageView = view.findViewById<ImageView>(R.id.imageView)

        tvName.text = name
        tvStatus.text = status
        imageView.setImageBitmap(imageBitmap)
    }



}

