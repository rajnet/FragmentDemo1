package com.comprehensivetutorial.fragmentdemo1.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.os.bundleOf
import androidx.navigation.findNavController
import com.comprehensivetutorial.fragmentdemo1.R
import com.comprehensivetutorial.fragmentdemo1.databinding.FragmentHomeBinding


class HomeFragment : Fragment() {
    private lateinit var binding: FragmentHomeBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentHomeBinding.inflate(inflater, container, false)

        binding.btnSubmit.setOnClickListener {
            val bundle = bundleOf("user_name" to binding.etName.text.toString())
            it.findNavController()
                .navigate(
                    R.id.action_homeFragment_to_secondFragment,
                    bundle
                )
        }

        return binding.root
    }

}