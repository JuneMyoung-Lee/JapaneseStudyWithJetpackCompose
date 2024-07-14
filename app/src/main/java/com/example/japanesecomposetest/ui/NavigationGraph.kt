package com.example.japanesecomposetest.ui

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.japanesecomposetest.ui.screen.GataganaScreen
import com.example.japanesecomposetest.ui.screen.HiraganaScreen
import com.example.japanesecomposetest.ui.screen.HomeScreen
import com.example.japanesecomposetest.ui.screen.WordScreen

@Composable
fun NavigationGraph(navController: NavHostController) {
    NavHost(navController = navController, startDestination = BottomNavItem.Home.screenRoute) {
        composable(BottomNavItem.Home.screenRoute) {
            HomeScreen()
        }
        composable(BottomNavItem.Hiragana.screenRoute) {
            HiraganaScreen()
        }
        composable(BottomNavItem.Gatagana.screenRoute) {
            GataganaScreen()
        }
        composable(BottomNavItem.Word.screenRoute) {
            WordScreen()
        }
    }
}