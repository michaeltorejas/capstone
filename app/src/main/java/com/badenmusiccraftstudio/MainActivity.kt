package com.badenmusiccraftstudio

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.runtime.*
import com.badenmusiccraftstudio.ui.theme.BadenMusicCraftStudioTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        setContent {
            BadenMusicCraftStudioTheme {

                var isLoggedIn by remember { mutableStateOf(false) }

                if (isLoggedIn) {
                    DashboardScreen()
                } else {
                    LoginScreen {
                        isLoggedIn = true
                    }
                }
            }
        }
    }
}
