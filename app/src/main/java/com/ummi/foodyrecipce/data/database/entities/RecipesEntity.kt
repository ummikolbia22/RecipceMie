package com.ummi.foodyrecipce.data.database.entities

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.ummi.foodyrecipce.models.FoodRecipe
import com.ummi.foodyrecipce.util.Constants.Companion.RECIPES_TABLE

@Entity(tableName = RECIPES_TABLE)
class RecipesEntity(
    var foodRecipe: FoodRecipe
) {
    @PrimaryKey(autoGenerate = false)
    var id: Int = 0
}