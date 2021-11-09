package com.azat.cityrecyclerview

import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView

class CityViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

    fun bind(city: City) {

        val cityNameTextView: TextView = itemView.findViewById(R.id.city_name_text_view)
        val cityQuantityTextView: TextView = itemView.findViewById(R.id.quantity_text_view)

        val nameFormatted = "City: ${city.name}"
        cityNameTextView.text = nameFormatted
        val quantityFormatted = "Count: ${city.quantity} чел."
        cityQuantityTextView.text = quantityFormatted

        val toastButton: Button = itemView.findViewById(R.id.toast_button)
        toastButton.setOnClickListener {
            Toast.makeText(itemView.context, city.name, Toast.LENGTH_SHORT).show()
        }
    }
}


