package com.maxx.passengerapp.presentation.ui.detail

sealed class PassengerEvent{

    data class GetPassengerEvent(
        val id: Int
    ): PassengerEvent()

}