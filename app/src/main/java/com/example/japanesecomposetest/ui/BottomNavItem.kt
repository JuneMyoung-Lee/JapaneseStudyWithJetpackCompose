package com.example.japanesecomposetest.ui

import com.example.japanesecomposetest.GATAGANA
import com.example.japanesecomposetest.HIRAGANA
import com.example.japanesecomposetest.HOME
import com.example.japanesecomposetest.R
import com.example.japanesecomposetest.WORD

sealed class BottomNavItem(
    val title: Int, val screenRoute: String
) {
    object Home : BottomNavItem(R.string.navigation_item_title_home, HOME)
    object Hiragana : BottomNavItem(R.string.navigation_item_title_hiragana, HIRAGANA)
    object Gatagana : BottomNavItem(R.string.navigation_item_title_gatagana, GATAGANA)
    object Word : BottomNavItem(R.string.navigation_item_title_word, WORD)
}