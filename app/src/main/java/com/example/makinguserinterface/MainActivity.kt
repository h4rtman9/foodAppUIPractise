package com.example.makinguserinterface

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.makinguserinterface.Intros.Intro
import com.example.makinguserinterface.databinding.ActivityMainBinding
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        getAccountInfo()
        if(getAccountInfo()){
            supportFragmentManager.beginTransaction()
                .replace( binding.fragmentContainerView.id , Intro()).commit()
        } //else { open another fragment and skip sign in}

        val navHostFragment = supportFragmentManager.findFragmentById(R.id.fragmentContainerView) as NavHostFragment
        val navController = navHostFragment.navController
        val navView: BottomNavigationView = findViewById(R.id.bottomNavMenu)
        navView.setupWithNavController(navController)
    }

    private fun getAccountInfo(): Boolean {
          return true
    }
}