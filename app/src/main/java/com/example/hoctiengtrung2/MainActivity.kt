package com.example.hoctiengtrung2

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.platform.LocalContext
import com.example.hoctiengtrung2.ui.screens.MainScreen
import com.example.hoctiengtrung2.ui.theme.HocTiengTrung2Theme
import com.example.hoctiengtrung2.utils.SessionManager
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            val context = LocalContext.current
            LaunchedEffect(Unit) {
                SessionManager.khoiTao(context)
            }
            HocTiengTrung2Theme(darkTheme = SessionManager.isDarkModeState.value) {
                MainScreen()
            }
        }
    }
}
