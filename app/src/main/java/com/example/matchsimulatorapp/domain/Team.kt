package com.example.matchsimulatorapp.domain

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.parcelize.Parcelize

@Parcelize
data class Team (
    @SerializedName("nome")
    val name:String,
    @SerializedName("forca")
    val stars: Int,
    @SerializedName("imagem")
    val image:String,
    var score: Int? // var tem get e set. não precisa do serialized pois não está vindo da api
    ): Parcelable