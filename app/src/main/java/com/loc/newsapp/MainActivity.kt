package com.loc.newsapp

import android.os.Bundle
import android.view.View
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
import com.loc.newsapp.presentation.onboarding.onBoardingScreen
import com.loc.newsapp.ui.theme.NewsAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        // Setting Our Splash Screen
        super.onCreate(savedInstanceState)
        // hiding actionBar
        actionBar?.hide()

        installSplashScreen()
        setContent {
            NewsAppTheme {
                onBoardingScreen()
            }
        }
    }
}
