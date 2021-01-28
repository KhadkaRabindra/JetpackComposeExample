package com.maxx.passengerapp.domain.model

import com.maxx.passengerapp.network.passenger_response.Airline


data class Passenger(
    val trips: Int? = null,
    val V: Int? = null,
    val name: String? = null,
    val id: String? = null,
    val airline: ArrayList<Airline>
)