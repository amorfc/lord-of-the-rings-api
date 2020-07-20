package com.example.lord_of_the_rings_api.view.ui.chars

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import com.example.lord_of_the_rings_api.databinding.CharDetailsFragmentBinding
import com.example.lord_of_the_rings_api.viewModel.chars.CharDetailsViewModel
import com.example.lord_of_the_rings_api.viewModel.chars.CharDetailsViewModelFactory
import kotlinx.android.synthetic.main.char_details_fragment.*

class CharDetailsFragment : Fragment() {

    private lateinit var detailsViewModel: CharDetailsViewModel
    private lateinit var charDetailsFragmentBinding: CharDetailsFragmentBinding
    private lateinit var charDetailsViewModelFactory: CharDetailsViewModelFactory

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        charDetailsFragmentBinding = CharDetailsFragmentBinding.inflate(inflater,container,false)
        return charDetailsFragmentBinding.root
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        charDetailsViewModelFactory = CharDetailsViewModelFactory(CharsFragmentArgs.fromBundle(requireArguments()).selectedChar)

        detailsViewModel = ViewModelProvider(this,charDetailsViewModelFactory).get(CharDetailsViewModel::class.java)

        charDetailsFragmentBinding.charDetailsViewModel = detailsViewModel
    }

}