package com.example.androidcomposeui.ui.presentation

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.androidcomposeui.data.model.UICard
import com.example.androidcomposeui.data.repository.MainRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(private val repository: MainRepository) : ViewModel() {

    private val _cards = MutableLiveData<List<UICard>>()
    val cards: LiveData<List<UICard>> = _cards

    fun fetchUIPage() {
        viewModelScope.launch {
            repository.getPage()
                .collect {
                    it.data?.page?.cards?.let { cards ->
                        _cards.value = cards
                    }
                }
        }
    }

}