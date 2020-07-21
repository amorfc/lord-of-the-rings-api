package com.example.lord_of_the_rings_api.view.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import androidx.navigation.findNavController
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import com.example.lord_of_the_rings_api.R
import com.google.android.material.bottomnavigation.BottomNavigationView


class HomeActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        val navController = findNavController(R.id.navHostFragment)

        setupActionBarWithNavController(navController)

        findViewById<BottomNavigationView>(R.id.bottomNavigationView)
            .setupWithNavController(navController)


    }



    override fun onSupportNavigateUp() = findNavController(R.id.navHostFragment).navigateUp()

}