package com.example.lord_of_the_rings_api.view.ui.chars

import androidx.lifecycle.ViewModelProviders
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import com.example.lord_of_the_rings_api.R
import com.example.lord_of_the_rings_api.databinding.CharDetailsFragmentBinding
import com.example.lord_of_the_rings_api.viewModel.chars.CharDetailsViewModel

class CharDetailsFragment : Fragment() {

    private lateinit var viewModel: CharDetailsViewModel
    private lateinit var charDetailsFragmentBinding: CharDetailsFragmentBinding


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        charDetailsFragmentBinding = CharDetailsFragmentBinding.inflate(inflater,container,false)
        return charDetailsFragmentBinding.root
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(CharDetailsViewModel::class.java)
        // TODO: Use the ViewModel
    }

}