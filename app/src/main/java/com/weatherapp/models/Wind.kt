package com.weatherapp.models


import com.google.gson.annotations.SerializedName
import java.io.Serializable

data class Wind(
    @SerializedName("deg")
    val deg: Int,
    @SerializedName("speed")
    val speed: Double
): Serializable