package com.application.app_android.Fragments

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.application.app_android.R
import com.application.app_android.databinding.FragmentMenuBinding

class MenuFragment : Fragment() {

    private var _binding : FragmentMenuBinding? = null
    private val binding get() = _binding!!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        //return inflater.inflate(R.layout.fragment_menu, container, false)

        _binding = FragmentMenuBinding.inflate(inflater, container, false)

        val savedUsername = requireContext().getSharedPreferences("savedUsername", Context.MODE_PRIVATE)
        val username = savedUsername.getString("username", "")
        binding.tvUser.text = username

        binding.btnSignOut.setOnClickListener {
            findNavController().navigate(R.id.action_menuFragment_to_loginFragment)
        }
        binding.btnMW.setOnClickListener {
            findNavController().navigate(R.id.action_menuFragment_to_mwweaponsFragment)
        }
        return binding.root
    }
}