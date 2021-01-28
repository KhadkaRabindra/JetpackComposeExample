package com.maxx.passengerapp.presentation.components

import android.os.Bundle
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.material.MaterialTheme
import androidx.compose.material.ScaffoldState
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.maxx.passengerapp.R
import com.maxx.passengerapp.domain.model.Passenger
import com.maxx.passengerapp.domain.model.Recipe
import com.maxx.passengerapp.presentation.components.util.SnackbarController
import com.maxx.passengerapp.presentation.ui.main.PAGE_SIZE
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.launch

@ExperimentalMaterialApi
@ExperimentalCoroutinesApi
@Composable
fun PassengerList(
        loading: Boolean,
        passengers: List<Passenger>,
        onChangeScrollPosition: (Int) -> Unit,
        page: Int,
        onTriggerNextPage: () -> Unit,
        navController: NavController,
        scaffoldState: ScaffoldState,
        snackbarController: SnackbarController,
){
    Box(modifier = Modifier
        .background(color = MaterialTheme.colors.surface)
    ) {
        if (loading && passengers.isEmpty()) {
            LoadingRecipeListShimmer(imageHeight = 70.dp,)
        } else {
            LazyColumn{
                itemsIndexed(
                    items = passengers
                ) { index, passenger ->
                    onChangeScrollPosition(index)
                    if ((index + 1) >= (page * PAGE_SIZE) && !loading) {
                        onTriggerNextPage()
                    }
                    PassengerCard(
                        passenger = passenger,
                        onClick = {
                            if(passenger.id != null){
                                val bundle = Bundle()
                                bundle.putString("passengerID", passenger.id)
                                navController.navigate(R.id.viewDetail, bundle)
                            }
                            else{
                                snackbarController.getScope().launch {
                                    snackbarController.showSnackbar(
                                        scaffoldState = scaffoldState,
                                        message = "Recipe Error",
                                        actionLabel = "OK",
                                    )
                                }
                            }
                        }
                    )
                }
            }
        }
    }
}