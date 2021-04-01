package com.ummi.foodyrecipce.ui.fragment.recipes.bottomsheet

import android.os.Bundle
import androidx.navigation.NavDirections
import com.ummi.foodyrecipce.R

class RecipesBottomSheetDirections private constructor() {
    private data class ActionRecipesBottomSheetToRecipesFragment(
        val backFromBottomSheet: Boolean = false
    ) : NavDirections {
        override fun getActionId(): Int = R.id.action_recipesBottomSheet_to_recipesFragment

        override fun getArguments(): Bundle {
            val result = Bundle()
            result.putBoolean("backFromBottomSheet", this.backFromBottomSheet)
            return result
        }
    }

    companion object {
        fun actionRecipesBottomSheetToRecipesFragment(backFromBottomSheet: Boolean = false):
                NavDirections = ActionRecipesBottomSheetToRecipesFragment(backFromBottomSheet)
    }
}

