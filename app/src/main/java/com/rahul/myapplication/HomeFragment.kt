package com.rahul.myapplication

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.FragmentNavigatorExtras
import androidx.navigation.fragment.findNavController
import com.rahul.myapplication.databinding.FragmentHomeBinding
import com.rahul.myapplication.databinding.FragmentSecondBinding

class HomeFragment : Fragment() {

    private lateinit var binding: FragmentHomeBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentHomeBinding.inflate(inflater,container,false)


        binding.imageView.setOnClickListener {

            //to make transition possible, add extras
            val extras = FragmentNavigatorExtras(binding.imageView to "large_imageView")
            findNavController().navigate(
                R.id.action_homeFragment_to_secondFragment,null,null,extras
            )
        }

        return binding.root
    }

}