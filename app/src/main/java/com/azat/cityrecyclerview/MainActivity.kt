package com.azat.cityrecyclerview

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        /* val cityNameList:List<City> = listOf("Moskow", "Tula", "Ryazan", "Bryansk", "Pskov",
            "Vladimir", "Grozny", "Ekaterinburg", "Tomsk", "Novosibirsk", "Vladivostok",
            "Ussuriysk", "Krasnodar", "Krasnoyarsk", "Chelyabinsk", "Magadan")*/
            val cityNameList: List<City> = listOf(
            City("Moskow", 12655050),
            City("Tula", 467955),
            City("Ryazan", 534801),
            City("Bryansk", 399579),
            City("Pskov", 209426),
            City("Vladimir", 352347),
            City("Grozny", 324602),
            City("Ekaterinburg", 1495066),
            City("Tomsk", 568508),
            City("Novosibirsk", 1620162),
            City("Vladivostok", 600871),
            City("Ussuriysk", 172942),
            City("Krasnodar", 948827),
            City("Krasnoyarsk", 1092851),
            City("Chelyabinsk", 1187960),
            City("Magadan", 91797)
        )
        val cityRecycleView: RecyclerView = findViewById(R.id.city_recycle_view)
        cityRecycleView.layoutManager =
            LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        cityRecycleView.adapter = CityAdapter(cityNameList)
        //cityRecycleView.adapter = GorodAdapter(gorodList)
        cityRecycleView.addItemDecoration(
            DividerItemDecoration(
                this,
                DividerItemDecoration.VERTICAL
            )
        )


    }
}