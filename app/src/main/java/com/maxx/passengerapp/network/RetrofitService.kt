package com.maxx.passengerapp.network

import com.maxx.passengerapp.network.passenger_response.PassengerDataItem
import com.maxx.passengerapp.network.passenger_response.PassengerResponse
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query


interface PassengerService {

    @GET("passenger")
    suspend fun getPassengers(@Query("page") page : Int, @Query("size") size : Int) : PassengerResponse

    @GET("passenger/{id}")
    suspend fun getPassengerById(@Path("id") id : String) : PassengerDataItem
}











