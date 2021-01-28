package com.maxx.passengerapp.network.passenger_model

import com.maxx.passengerapp.domain.model.Passenger
import com.maxx.passengerapp.domain.util.DomainMapper
import com.maxx.passengerapp.network.passenger_response.PassengerDataItem


class PassengerDtoMapper : DomainMapper<PassengerDataItem, Passenger> {
    override fun mapToDomainModel(model: PassengerDataItem): Passenger {
        return Passenger(
            trips = model.trips,
            V = model.V,
            name = model.name,
            id = model.id,
            airline = model.airline
        )
    }

    override fun mapFromDomainModel(domainModel: Passenger): PassengerDataItem {
        return PassengerDataItem(
            trips = domainModel.trips,
            V = domainModel.V,
            name = domainModel.name,
            id = domainModel.id,
            airline = domainModel.airline
        )
    }

    fun toDomainList(initial: List<PassengerDataItem>): List<Passenger> {
        return initial.map { mapToDomainModel(it) }
    }

    fun fromDomainList(initial: List<Passenger>): List<PassengerDataItem> {
        return initial.map { mapFromDomainModel(it) }
    }

}