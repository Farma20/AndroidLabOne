package com.example.laba1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.example.laba1.databinding.ActivityMain2Binding
import com.example.laba1.databinding.ActivityMain3Binding

class MainActivity3 : AppCompatActivity() {

    private lateinit var binding: ActivityMain3Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMain3Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.button1.setOnClickListener{
            onFragmentSelected(Fragment1())
        }

        binding.button2.setOnClickListener{
            onFragmentSelected(Fragment2())
        }

        binding.button3.setOnClickListener{
            onFragmentSelected(Fragment3())
        }
    }

    private fun onFragmentSelected(fragment: Fragment){
        supportFragmentManager.beginTransaction()
            .replace(R.id.fragment_container, fragment)
            .commit()
    }
}