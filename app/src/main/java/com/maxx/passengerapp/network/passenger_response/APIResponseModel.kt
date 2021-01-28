package com.maxx.passengerapp.network.passenger_response

import com.google.gson.annotations.SerializedName


data class PassengerResponse(

	@field:SerializedName("totalPassengers")
	val totalPassengers: Int? = null,

	@field:SerializedName("data")
	val data: List<PassengerDataItem>,

	@field:SerializedName("totalPages")
	val totalPages: Int? = null
)

data class PassengerDataItem(

	@field:SerializedName("trips")
	val trips: Int? = null,

	@field:SerializedName("__v")
	val V: Int? = null,

	@field:SerializedName("name")
	val name: String? = null,

	@field:SerializedName("_id")
	val id: String? = null,

	@field:SerializedName("airline")
	val airline: ArrayList<Airline>

)

data class Airline(

	@field:SerializedName("established")
	val established: String? = null,

	@field:SerializedName("country")
	val country: String? = null,

	@field:SerializedName("website")
	val website: String? = null,

	@field:SerializedName("name")
	val name: String? = null,

	@field:SerializedName("head_quaters")
	val headQuaters: String? = null,

	@field:SerializedName("logo")
	val logo: String? = null,

	@field:SerializedName("id")
	val id: Int? = null,

	@field:SerializedName("slogan")
	val slogan: String? = null
)
