package com.maxx.passengerapp.di

import com.maxx.passengerapp.network.PassengerService
import com.maxx.passengerapp.network.passenger_model.PassengerDtoMapper
import com.maxx.passengerapp.repository.PassengerRepository
import com.maxx.passengerapp.repository.PassengerRepository_Impl
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ApplicationComponent
import javax.inject.Singleton

@Module
@InstallIn(ApplicationComponent::class)
object RepositoryModule {

    @Singleton
    @Provides
    fun providePassengerRepository(
        passengerService: PassengerService,
        passengerDtoMapper: PassengerDtoMapper,
    ): PassengerRepository {
        return PassengerRepository_Impl(
            passengerService = passengerService,
            mapper = passengerDtoMapper
        )
    }

}

