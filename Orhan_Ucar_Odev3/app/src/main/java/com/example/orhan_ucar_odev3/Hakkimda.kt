package com.example.orhan_ucar_odev3

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.orhan_ucar_odev3.databinding.FragmentHakkimdaBinding

class Hakkimda : Fragment() {

    private var _binding: FragmentHakkimdaBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentHakkimdaBinding.inflate(inflater, container, false)
        return binding.root
    }

}