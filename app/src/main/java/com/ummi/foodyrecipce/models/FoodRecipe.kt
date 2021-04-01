package com.ummi.foodyrecipce.models

import com.google.gson.annotations.SerializedName
import com.ummi.foodyrecipce.models.Result


data class FoodRecipe(
    @SerializedName("results")
    val results: List<Result>
)