package com.example.orhan_ucar_odev3

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import com.example.orhan_ucar_odev3.databinding.FragmentGaleriBinding

class Galeri : Fragment() {

    private var _binding: FragmentGaleriBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentGaleriBinding.inflate(inflater, container, false)

        return binding.root

    }


}