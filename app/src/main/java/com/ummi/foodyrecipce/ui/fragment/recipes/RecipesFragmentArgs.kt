package com.ummi.foodyrecipce.ui.fragment.recipes

import android.os.Bundle
import androidx.navigation.NavArgs

data class RecipesFragmentArgs(
    val backFromBottomSheet: Boolean = false
) : NavArgs {
    fun toBundle(): Bundle {
        val result = Bundle()
        result.putBoolean("backFromBottomSheet", this.backFromBottomSheet)
        return result
    }

    companion object {
        @JvmStatic
        fun fromBundle(bundle: Bundle): RecipesFragmentArgs {
            bundle.setClassLoader(RecipesFragmentArgs::class.java.classLoader)
            val __backFromBottomSheet : Boolean
            if (bundle.containsKey("backFromBottomSheet")) {
                __backFromBottomSheet = bundle.getBoolean("backFromBottomSheet")
            } else {
                __backFromBottomSheet = false
            }
            return RecipesFragmentArgs(__backFromBottomSheet)
        }
    }
}
