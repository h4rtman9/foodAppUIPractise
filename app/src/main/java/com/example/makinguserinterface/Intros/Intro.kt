package com.example.makinguserinterface.Intros

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.makinguserinterface.R
import com.example.makinguserinterface.databinding.ActivityMainBinding

class Intro : Fragment() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View?
    { // Inflate the layout for this fragment

        binding = ActivityMainBinding.inflate(layoutInflater)
        return inflater.inflate(R.layout.fragment_intro, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        Thread.sleep(2000)
        supportFragmentManager.beginTransaction()
            .replace( binding.fragmentContainerView.id , Intro()).commit()
    }
}