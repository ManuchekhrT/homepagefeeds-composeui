package com.example.androidcomposeui.ui

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.runtime.livedata.observeAsState
import coil.annotation.ExperimentalCoilApi
import com.example.androidcomposeui.ui.presentation.MainViewModel
import com.example.androidcomposeui.ui.theme.AndroidComposeUITheme
import com.example.androidcomposeui.ui.widget.UICards
import dagger.hilt.android.AndroidEntryPoint

@ExperimentalCoilApi
@AndroidEntryPoint
class MainActivity : ComponentActivity() {

    private val viewModel: MainViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewModel.fetchUIPage()
        setContent {
            AndroidComposeUITheme {
                // A surface container using the 'background' color from the theme
                Surface(color = MaterialTheme.colors.background) {
                    UIPages(viewModel = viewModel)
                }
            }
        }
    }
}

@ExperimentalCoilApi
@Composable
fun UIPages(viewModel: MainViewModel) {
    val cards = viewModel.cards.observeAsState()
    cards.value?.let {
        UICards(cards = it)
    }
}


