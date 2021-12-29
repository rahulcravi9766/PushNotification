package com.rahul.myapplication

import android.os.Bundle
import android.transition.Transition
import android.transition.TransitionInflater
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.rahul.myapplication.databinding.FragmentHomeBinding
import com.rahul.myapplication.databinding.FragmentSecondBinding

class SecondFragment : Fragment() {

    lateinit var binding : FragmentSecondBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentSecondBinding.inflate(inflater,container,false)

           //here we will create the animation
            val animation = TransitionInflater.from(requireContext()).inflateTransition(
                android.R.transition.slide_bottom
            )
                  sharedElementEnterTransition = animation
        sharedElementEnterTransition = animation



        return binding.root
    }

}