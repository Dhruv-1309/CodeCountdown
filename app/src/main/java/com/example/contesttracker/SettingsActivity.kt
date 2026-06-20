package com.example.contesttracker

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class SettingsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        finish() // Redirect to MainActivity or just close
    }

    companion object {
        const val PREFS_NAME = "clist_settings"
    }
}
