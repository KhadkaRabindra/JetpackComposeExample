package com.maxx.passengerapp.presentation.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.maxx.passengerapp.network.passenger_response.Airline
import kotlinx.coroutines.ExperimentalCoroutinesApi

@ExperimentalMaterialApi
@ExperimentalCoroutinesApi
@Composable
fun AirlineList(
    loading: Boolean,
    airlines: ArrayList<Airline>
){
    Box(modifier = Modifier
        .background(color = MaterialTheme.colors.surface)
    ) {
        if (loading && airlines.isEmpty()) {
            LoadingRecipeListShimmer(imageHeight = 250.dp,)
        } else {
            LazyColumn{
                itemsIndexed(
                    items = airlines
                ) { index, airline ->
                    RecipeCard(
                        airline = airline
                    )
                }
            }
        }
    }
}