package com.maxx.passengerapp.presentation.ui.main

sealed class PassengerListEvent {

    object NewSearchEvent : PassengerListEvent()

    object NextPageEvent : PassengerListEvent()

    // restore after process death
    object RestoreStateEvent: PassengerListEvent()
}