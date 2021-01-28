package com.maxx.passengerapp.repository

import com.maxx.passengerapp.domain.model.Passenger
import com.maxx.passengerapp.network.PassengerService
import com.maxx.passengerapp.network.passenger_model.PassengerDtoMapper

class PassengerRepository_Impl(
    private val passengerService: PassengerService,
    private val mapper: PassengerDtoMapper,
) : PassengerRepository {

    override suspend fun getPassengers(page: Int, size: Int): ArrayList<Passenger> {
        return mapper.toDomainList(
            passengerService.getPassengers(
                page = page,
                size = size
            ).data
        ) as ArrayList<Passenger>
    }

    override suspend fun getPassengerById(id: String): Passenger {
        return mapper.mapToDomainModel(passengerService.getPassengerById(id))
    }
}