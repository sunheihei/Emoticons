package com.funtune.emoticons.utils

import android.content.Context
import com.funtune.emoticons.AppContext

object SuperSp {

    const val TYPE_LIST_ONE_ROW = 0
    const val TYPE_GRID_TWO_ROW = 1

    private const val TAG = "SuperAdSp"

    private const val BASE_KEY1 = "BASE_KEY1"


    private val sharedPreferences = (AppContext.getContext()).getSharedPreferences(
        (AppContext.getContext()).packageName + "_prefs_ads_internal", Context.MODE_PRIVATE
    )

    var isFromFacebook
        get() = sharedPreferences.getBoolean(BASE_KEY1, false)
        set(value) = sharedPreferences.edit().putBoolean(BASE_KEY1, value).apply()


}