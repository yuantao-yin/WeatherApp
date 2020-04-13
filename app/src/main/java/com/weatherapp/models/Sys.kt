package com.weatherapp.models


import com.google.gson.annotations.SerializedName
import java.io.Serializable

data class Sys(
    @SerializedName("country")
    val country: String,
    @SerializedName("message")
    val message: Double,
    @SerializedName("sunrise")
    val sunrise: Int,
    @SerializedName("sunset")
    val sunset: Int
): Serializable