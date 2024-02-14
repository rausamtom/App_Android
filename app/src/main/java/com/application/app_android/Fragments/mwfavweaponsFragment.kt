package com.application.app_android.Fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.application.app_android.R
import com.application.app_android.databinding.FragmentMwfavweaponsBinding

class mwfavweaponsFragment : Fragment() {

    private var _binding : FragmentMwfavweaponsBinding? = null
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
        //return inflater.inflate(R.layout.fragment_mwfavweapons, container, false)

        _binding = FragmentMwfavweaponsBinding.inflate(inflater, container, false)

        return binding.root
    }
}