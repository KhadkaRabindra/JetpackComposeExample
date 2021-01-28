package com.maxx.passengerapp.presentation.components

import androidx.compose.foundation.ScrollableColumn
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.maxx.passengerapp.domain.model.Passenger
import kotlinx.coroutines.ExperimentalCoroutinesApi

@ExperimentalCoroutinesApi
@Composable
fun PassengerView(
    passenger: Passenger,
) {
    ScrollableColumn(
        modifier = Modifier
            .fillMaxWidth()
    ) {
        Column(){
            Text(
                text = "Name : ${passenger.name}",
                modifier = Modifier
                    .fillMaxWidth(0.85f)
                    .wrapContentWidth(Alignment.Start)
                ,
                style = MaterialTheme.typography.h3
            )
            val trips  = passenger.trips.toString()
            Text(
                text = "Trips : $trips",
                modifier = Modifier
                    .fillMaxWidth()
                    .wrapContentWidth(Alignment.Start)
                    .align(Alignment.Start)
                ,
                style = MaterialTheme.typography.h5
            )
        }
    }
}