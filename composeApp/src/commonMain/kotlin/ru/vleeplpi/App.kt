package ru.vleeplpi

import androidx.compose.animation.core.*
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.unit.dp
import cafe.adriel.voyager.navigator.Navigator
import cafe.adriel.voyager.transitions.SlideTransition
import smartshopcart.composeapp.generated.resources.*
import ru.vleeplpi.theme.AppTheme
import ru.vleeplpi.theme.LocalThemeIsDark
import org.jetbrains.compose.resources.Font
import org.jetbrains.compose.resources.stringResource
import org.jetbrains.compose.resources.vectorResource
import ru.vleeplpi.presentation.screen.home.HomeScreen

@Composable
internal fun App() = AppTheme {
    Navigator(HomeScreen()){
        SlideTransition(it)
    }
}