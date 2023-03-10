package com.tradehouse.lesson_6_4.fragment2

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.tradehouse.lesson_6_4.databinding.FragmentCountBinding
import com.tradehouse.lesson_6_4.ui.MainViewModel

class CountFragment : Fragment() {

    private lateinit var binding: FragmentCountBinding
    private lateinit var  viewModel: MainViewModel
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentCountBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel = ViewModelProvider(requireActivity())[MainViewModel::class.java]
        viewModel.data.observe(viewLifecycleOwner){
            binding.tvClick.text=it.toString()
        }

    }
}