package com.maxx.passengerapp.repository

import com.maxx.passengerapp.domain.model.Passenger

interface PassengerRepository {

    suspend fun getPassengers(page: Int, size: Int): ArrayList<Passenger>

    suspend fun getPassengerById(id: String): Passenger
}