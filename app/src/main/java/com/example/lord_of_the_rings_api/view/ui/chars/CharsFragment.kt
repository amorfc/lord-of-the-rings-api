package com.example.lord_of_the_rings_api.view.ui.chars

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.lord_of_the_rings_api.R
import com.example.lord_of_the_rings_api.service.model.Character
import com.example.lord_of_the_rings_api.view.adapter.CharsAdapter
import com.example.lord_of_the_rings_api.viewModel.chars.CharsListViewModel
import kotlinx.android.synthetic.main.chars_list_fragment.*

class CharsFragment : Fragment() {

    private lateinit var viewModel: CharsListViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.chars_list_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        val charsViewModel = ViewModelProvider(this).get(CharsListViewModel::class.java)
        charsViewModel.getMovieListObserver().observe(viewLifecycleOwner, object : Observer<List<Character>>{
            override fun onChanged(charactersList: List<Character>?) {
                charactersList?.let {
                    charsRecyclerView.also {
                        it.layoutManager = GridLayoutManager(context,3)
                        it.setHasFixedSize(true)
                        it.adapter =  CharsAdapter(charactersList)
                    }
                }
            }
        })
    }

}