package com.application.app_android.Adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.application.app_android.R
import com.application.app_android.Weapon

class WeaponAdapter(private val weaponList : List<Weapon>, private val onClickListener: (Weapon) -> Unit) : RecyclerView.Adapter<WeaponViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): WeaponViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        return WeaponViewHolder(layoutInflater.inflate(R.layout.item_weapon, parent, false))
    }

    /** Devuelve el tamaño de la lista del provider */
    override fun getItemCount(): Int {
        return weaponList.size
    }

    override fun onBindViewHolder(holder: WeaponViewHolder, position: Int) {
        holder.render(weaponList[position], onClickListener)
    }
}