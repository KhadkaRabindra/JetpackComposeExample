package com.maxx.passengerapp.presentation.ui.detail

import android.util.Log
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.hilt.Assisted
import androidx.hilt.lifecycle.ViewModelInject
import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.maxx.passengerapp.domain.model.Passenger
import com.maxx.passengerapp.repository.PassengerRepository
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch


const val STATE_KEY_RECIPE = "passenger.state.passenger.key"

class DetailFragmentViewModel@ViewModelInject
constructor(
    private val repository: PassengerRepository,
    @Assisted private val state: SavedStateHandle,
) : ViewModel() {


    val recipe: MutableState<Passenger?> = mutableStateOf(null)

    val loading = mutableStateOf(false)

    init {
        // restore if process dies
        state.get<Int>(STATE_KEY_RECIPE)?.let{ recipeId ->
            onTriggerEvent(PassengerEvent.GetPassengerEvent(recipeId))
        }
    }

    fun onTriggerEvent(event: PassengerEvent){
        viewModelScope.launch {
            try {
                when(event){
                    is PassengerEvent.GetPassengerEvent -> {
                        if(recipe.value == null){
                            getRecipe(event.id)
                        }
                    }
                }
            }catch (e: Exception){
                Log.e("TAG", "launchJob: Exception: ${e}, ${e.cause}")
                e.printStackTrace()
            }
        }
    }

    private suspend fun getRecipe(id: Int){
        loading.value = true

        // simulate a delay to show loading
        delay(1000)

        /*val recipe = repository.get(token=token, id=id)
        this.recipe.value = recipe

        state.set(STATE_KEY_RECIPE, recipe.id)

        loading.value = false*/
    }
}