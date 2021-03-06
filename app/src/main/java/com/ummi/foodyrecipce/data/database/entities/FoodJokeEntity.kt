package com.ummi.foodyrecipce.data.database.entities

import androidx.room.Embedded
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.ummi.foodyrecipce.models.FoodJoke
import com.ummi.foodyrecipce.util.Constants.Companion.FOOD_JOKE_TABLE

@Entity(tableName = FOOD_JOKE_TABLE)
class FoodJokeEntity(
    //Menandai bidang Entitas atau POJO untuk memungkinkan bidang bertumpuk
    // (yaitu bidang kelas bidang yang dianotasikan) untuk dirujuk langsung di kueri SQL.
    @Embedded
    var foodJoke: FoodJoke
) {
    @PrimaryKey(autoGenerate = false)
    var id: Int = 0
}