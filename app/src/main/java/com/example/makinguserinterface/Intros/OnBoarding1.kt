package com.example.makinguserinterface.Intros

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.makinguserinterface.R
import com.example.makinguserinterface.databinding.FragmentOnBoardingBinding
class OnBoarding1 : Fragment() {
    private lateinit var binding: FragmentOnBoardingBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        binding = FragmentOnBoardingBinding.inflate(layoutInflater)
        return inflater.inflate(R.layout.fragment_on_boarding, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.next.setOnClickListener {

        }
    }

}