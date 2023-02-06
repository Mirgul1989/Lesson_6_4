package com.tradehouse.lesson_6_4.fragment1

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.os.bundleOf
import androidx.fragment.app.activityViewModels
import androidx.fragment.app.viewModels
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import com.tradehouse.lesson_6_4.R
import com.tradehouse.lesson_6_4.databinding.FragmentFirstBinding
import com.tradehouse.lesson_6_4.ui.MainViewModel
import dagger.hilt.android.AndroidEntryPoint

class FirstFragment : Fragment() {
    private lateinit var binding: FragmentFirstBinding
    private lateinit var viewModel: MainViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentFirstBinding.inflate(inflater, container, false)
        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel = ViewModelProvider(requireActivity())[MainViewModel::class.java]

        binding.btnIncrement.setOnClickListener {
            viewModel.onIncrementInt()

        }
        binding.btnDecrement.setOnClickListener {
            viewModel.onDecrement()
        }
    }
}