package com.ummi.foodyrecipce.bindingadapters

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.databinding.BindingAdapter
import androidx.recyclerview.widget.RecyclerView
import com.ummi.foodyrecipce.adapters.FavoriteRecipesAdapter
import com.ummi.foodyrecipce.data.database.entities.FavoritesEntity

class FavoriteRecipesBinding {

    companion object {
        //BindingAdapter diterapkan ke metode yang digunakan untuk memanipulasi bagaimana nilai
        // dengan ekspresi diatur ke tampilan.
        @BindingAdapter("viewVisibility", "setData", requireAll = false)
        @JvmStatic
        //Untuk membuat fungsi objek atau properti di Kotlin menjadi kelas statis Java yang dihasilkan
        fun setDataAndViewVisibility(
            view: View,
            favoritesEntity: List<FavoritesEntity>?,
            mAdapter: FavoriteRecipesAdapter?
        ) {
            if (favoritesEntity.isNullOrEmpty()) {
                when (view) {
                    is ImageView -> {
                        view.visibility = View.VISIBLE
                    }
                    is TextView -> {
                        view.visibility = View.VISIBLE
                    }
                    is RecyclerView -> {
                        view.visibility = View.INVISIBLE
                    }
                }
            } else {
                when (view) {
                    is ImageView -> {
                        view.visibility = View.INVISIBLE
                    }
                    is TextView -> {
                        view.visibility = View.INVISIBLE
                    }
                    is RecyclerView -> {
                        view.visibility = View.VISIBLE
                        mAdapter?.setData(favoritesEntity)
                    }
                }
            }
        }

    }

}