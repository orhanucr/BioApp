package com.example.orhan_ucar_odev3

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.orhan_ucar_odev3.databinding.FragmentAnasayfaBinding
import com.example.orhan_ucar_odev3.databinding.FragmentBlogBinding
import com.example.orhan_ucar_odev3.databinding.FragmentIletisimBinding

class Iletisim : Fragment() {

    private var _binding: FragmentIletisimBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentIletisimBinding.inflate(inflater, container, false)
        return binding.root
    }

}