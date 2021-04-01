package com.ummi.foodyrecipce.data.database

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import com.ummi.foodyrecipce.data.database.entities.FavoritesEntity
import com.ummi.foodyrecipce.data.database.entities.FoodJokeEntity
import com.ummi.foodyrecipce.data.database.entities.RecipesEntity


@Database(
    entities = [RecipesEntity::class, FavoritesEntity::class, FoodJokeEntity::class],
    version = 1,
    exportSchema = false
)
//untuk menyimpan beberapa type costum dalam database
@TypeConverters(RecipesTypeConverter::class)
abstract class RecipesDatabase: RoomDatabase() {

    abstract fun recipesDao(): RecipesDao

}