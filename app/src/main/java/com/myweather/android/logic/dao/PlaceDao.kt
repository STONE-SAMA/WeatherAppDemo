package com.myweather.android.logic.dao

import android.content.Context
import androidx.core.content.edit
import com.google.gson.Gson
import com.myweather.android.MyWeatherApplication
import com.myweather.android.logic.model.Place

object PlaceDao {
    fun savePlace(place: Place){
        sharedPreferences().edit(){
            putString("place", Gson().toJson(place))
        }
    }

    fun getSavedPlace(): Place{
        val placeJson = sharedPreferences().getString("place", "")
        return Gson().fromJson(placeJson, Place::class.java)
    }

    fun isPlaceSaved() = sharedPreferences().contains("place")

    private fun sharedPreferences() = MyWeatherApplication.context.getSharedPreferences("my_weather", Context.MODE_PRIVATE)

}