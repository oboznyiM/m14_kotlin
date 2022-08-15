package com.example.class3_1.data

import android.app.Activity
import android.content.Context

private const val KEY_OPTION = "isDark"
private const val DEFAULT_OPTION_VALUE = true

class AppPreferences (context: Activity) {
    private val preferences = context.getPreferences(Context.MODE_PRIVATE)

    fun setOption(value: Boolean) {
        with (preferences.edit()) {
            putBoolean(KEY_OPTION, value)
            apply()
        }
    }
    fun getOptions(): Boolean {
        return preferences.getBoolean(KEY_OPTION, DEFAULT_OPTION_VALUE)
    }
}