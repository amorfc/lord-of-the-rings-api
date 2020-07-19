package com.example.lord_of_the_rings_api.view.ui

import android.os.Bundle
import android.util.Log
import android.widget.Toast
import android.widget.Toolbar
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentTransaction
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.NavigationUI
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import com.example.lord_of_the_rings_api.R
import com.google.android.material.bottomnavigation.BottomNavigationView
import kotlinx.android.synthetic.main.activity_home.*
import timber.log.Timber


class HomeActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
        Timber.i("ON CREATEEE")

        val navController = this.findNavController(R.id.navHostFragment)
        setupActionBarWithNavController(navController)

        findViewById<BottomNavigationView>(R.id.bottomNavigationView)
            .setupWithNavController(navController)

    }

    override fun onSupportNavigateUp() = findNavController(R.id.navHostFragment).navigateUp()

    fun initListeners(){

    }
}