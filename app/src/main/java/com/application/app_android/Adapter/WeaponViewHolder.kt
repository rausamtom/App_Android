package com.application.app_android.Adapter

import android.view.View
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.application.app_android.Weapon
import com.application.app_android.databinding.ItemWeaponBinding
import com.bumptech.glide.Glide

class WeaponViewHolder(view : View) : RecyclerView.ViewHolder(view) {
    val binding = ItemWeaponBinding.bind(view)

    fun render(weaponModel: Weapon, onClickListener: (Weapon) -> Unit) {
        Glide.with(binding.ivWeapon.context).load(weaponModel.preview).into(binding.ivWeapon)
        binding.tvWeapon.text = weaponModel.weapon
        binding.tvCategory.text = weaponModel.category
        binding.tvCaliber.text = weaponModel.caliber

        /*binding.ivWeapon.setOnClickListener {
            Toast.makeText(
                binding.ivWeapon.context,
                weaponModel.weapon,
                Toast.LENGTH_SHORT
            ).show()
        }
        itemView.setOnClickListener {
            Toast.makeText(
                binding.ivWeapon.context,
                weaponModel.category,
                Toast.LENGTH_SHORT
            ).show()
        }*/

        itemView.setOnClickListener {onClickListener(weaponModel)}
    }
}