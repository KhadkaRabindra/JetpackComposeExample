package com.maxx.passengerapp.presentation.ui.main

import android.util.Log
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.hilt.Assisted
import androidx.hilt.lifecycle.ViewModelInject
import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.maxx.passengerapp.domain.model.Passenger
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import com.maxx.passengerapp.presentation.ui.main.PassengerListEvent.*
import com.maxx.passengerapp.repository.PassengerRepository

const val PAGE_SIZE = 30

const val STATE_KEY_PAGE = "passenger.state.page.key"
const val STATE_KEY_QUERY = "passenger.state.query.key"
const val STATE_KEY_LIST_POSITION = "passenger.state.query.list_position"

class MainFragmentViewModel
@ViewModelInject
constructor(
    private val repository: PassengerRepository,
    @Assisted private val savedStateHandle: SavedStateHandle,
) : ViewModel() {

    val passengers: MutableState<List<Passenger>> = mutableStateOf(ArrayList())

    val query = mutableStateOf("")

    val loading = mutableStateOf(false)

    // Pagination starts at '1' (-1 = exhausted)
    val page = mutableStateOf(1)

    var recipeListScrollPosition = 0

    init {
        savedStateHandle.get<Int>(STATE_KEY_PAGE)?.let { p ->
            setPage(p)
        }
        savedStateHandle.get<String>(STATE_KEY_QUERY)?.let { q ->
            setQuery(q)
        }
        savedStateHandle.get<Int>(STATE_KEY_LIST_POSITION)?.let { p ->
            setListScrollPosition(p)
        }

        if (recipeListScrollPosition != 0) {
            onTriggerEvent(RestoreStateEvent)
        } else {
            onTriggerEvent(NewSearchEvent)
        }

    }

    fun onTriggerEvent(event: PassengerListEvent) {
        viewModelScope.launch {
            try {
                when (event) {
                    is NewSearchEvent -> {
                        newSearch()
                    }
                    is NextPageEvent -> {
                        nextPage()
                    }
                    is RestoreStateEvent -> {
                        restoreState()
                    }
                }
            } catch (e: Exception) {
                Log.e("TAG", "launchJob: Exception: ${e}, ${e.cause}")
                e.printStackTrace()
            } finally {
                Log.d("TAG", "launchJob: finally called.")
            }
        }
    }

    private suspend fun restoreState() {
        loading.value = true
        val results: MutableList<Passenger> = mutableListOf()
        for (p in 1..page.value) {
            val result = repository.getPassengers(
                page = p,
                size = PAGE_SIZE
            )
            results.addAll(result)
            if (p == page.value) { // done
                passengers.value = results
                loading.value = false
            }
        }
    }

    private suspend fun newSearch() {
        loading.value = true

        resetSearchState()

        delay(2000)

        val result = repository.getPassengers(
            page = 1,
            size = PAGE_SIZE
        )
        passengers.value = result

        loading.value = false
    }

    private suspend fun nextPage() {
        // prevent duplicate event due to recompose happening to quickly
        if ((recipeListScrollPosition + 1) >= (page.value * PAGE_SIZE)) {
            loading.value = true
            incrementPage()
            Log.d("TAG", "nextPage: triggered: ${page.value}")

            // just to show pagination, api is fast
            delay(1000)

            if (page.value > 1) {
                val result = repository.getPassengers(page = page.value, size = PAGE_SIZE)
                Log.d("TAG", "search: appending")
                appendRecipes(result)
            }
            loading.value = false
        }
    }

    /**
     * Append new recipes to the current list of recipes
     */
    private fun appendRecipes(recipes: List<Passenger>) {
        val current = ArrayList(this.passengers.value)
        current.addAll(recipes)
        this.passengers.value = current
    }

    private fun incrementPage() {
        setPage(page.value + 1)
    }

    fun onChangeRecipeScrollPosition(position: Int) {
        setListScrollPosition(position = position)
    }

    /**
     * Called when a new search is executed.
     */
    private fun resetSearchState() {
        passengers.value = listOf()
        page.value = 1
        onChangeRecipeScrollPosition(0)
    }


    private fun setListScrollPosition(position: Int) {
        recipeListScrollPosition = position
        savedStateHandle.set(STATE_KEY_LIST_POSITION, position)
    }

    private fun setPage(page: Int) {
        this.page.value = page
        savedStateHandle.set(STATE_KEY_PAGE, page)
    }

    private fun setQuery(query: String) {
        this.query.value = query
        savedStateHandle.set(STATE_KEY_QUERY, query)
    }
}