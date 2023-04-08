package com.example.laba1

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.laba1.databinding.FragmentOneBinding
import com.example.laba1.databinding.FragmentThreeBinding

class Fragment3: Fragment() {

    private var _binding: FragmentThreeBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View{

        _binding = FragmentThreeBinding.inflate(inflater)
        return binding.root
    }

}