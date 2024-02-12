package com.application.app_android.Fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import com.application.app_android.Adapter.WeaponAdapter
import com.application.app_android.R
import com.application.app_android.Weapon
import com.application.app_android.WeaponProvider
import com.application.app_android.databinding.FragmentMwweaponsBinding

class mwweaponsFragment : Fragment() {

    private var _binding : FragmentMwweaponsBinding? = null
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
        //return inflater.inflate(R.layout.fragment_mwweapons, container, false)

        _binding = FragmentMwweaponsBinding.inflate(inflater, container, false)

        initializeRecyclerView()

        return binding.root
    }

    fun initializeRecyclerView() {
        val manager = LinearLayoutManager(requireContext())
        binding.weaponRecycler.layoutManager = manager
        binding.weaponRecycler.adapter = WeaponAdapter(WeaponProvider.weaponList) {weapon -> onItemSelected(weapon)}
    }
    private fun onItemSelected(weapon: Weapon) {
        Toast.makeText(requireContext(),
            weapon.weapon,
            Toast.LENGTH_SHORT
        ).show()
    }
}