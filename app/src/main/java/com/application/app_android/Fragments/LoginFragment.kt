package com.application.app_android.Fragments

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.navigation.fragment.findNavController
import com.application.app_android.R
import com.application.app_android.databinding.FragmentLoginBinding

class LoginFragment : Fragment() {

    private var _binding : FragmentLoginBinding? = null
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
        //return inflater.inflate(R.layout.fragment_login, container, false)

        _binding = FragmentLoginBinding.inflate(inflater, container, false)

        binding.btnSignIn.setOnClickListener {
            if (binding.etUsername.text.toString().isNotEmpty()) {
                findNavController().navigate(R.id.action_loginFragment_to_menuFragment)
                val username = binding.etUsername.text.toString()
                val saveUsername = requireContext().getSharedPreferences("savedUsername", Context.MODE_PRIVATE)
                saveUsername.edit().putString("username", username).apply()
            }
            else {
                Toast.makeText(requireContext(), "Username is empty", Toast.LENGTH_SHORT).show()
            }
        }
        return binding.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}