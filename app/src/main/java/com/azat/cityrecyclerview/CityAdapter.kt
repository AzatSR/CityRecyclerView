package com.azat.cityrecyclerview

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class CityAdapter(private val cityNameList: List<City>) : RecyclerView.Adapter<CityViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CityViewHolder {
        val cityItemView = LayoutInflater.from(parent.context)
            .inflate(R.layout.city_list_item, parent, false)
        return CityViewHolder(cityItemView)
    }

    override fun onBindViewHolder(holder: CityViewHolder, position: Int) {
        val city = cityNameList[position]
        holder.bind(city)
    }

    override fun getItemCount(): Int {
        return cityNameList.size
    }
}