package com.maxx.passengerapp.util

import com.google.gson.*
import com.google.gson.reflect.TypeToken
import com.maxx.passengerapp.network.passenger_response.Airline
import com.maxx.passengerapp.network.passenger_response.PassengerDataItem
import org.json.JSONArray
import org.json.JSONObject
import java.lang.reflect.Type
import java.util.*
import kotlin.collections.ArrayList


class PassengerDeserializer : JsonDeserializer<PassengerDataItem?> {
    @Throws(JsonParseException::class)
    override fun deserialize(
        json: JsonElement,
        typeOfT: Type?,
        context: JsonDeserializationContext
    ): PassengerDataItem {
        val monumentElement = json.asJsonObject["airline"]

        val gson = json.asJsonObject
        val jsonObject = JSONObject(gson.toString())

        val passengerID = jsonObject.getString("_id")
        val passengerName = jsonObject.getString("name")
        val passengerTrips = jsonObject.getInt("trips")
        val passenger_v = jsonObject.getInt("__v")

        return if (monumentElement.isJsonArray) {
            val airLineList = ArrayList<Airline>()

            val tempJsonArray = monumentElement.asJsonArray
            val jsonArray = JSONArray(tempJsonArray.toString())
            val gson2 = GsonBuilder().setPrettyPrinting().create()
            for (i in 0 until jsonArray.length()) {
                val customLogBulkData = gson2?.fromJson(jsonArray[i].toString(), Airline::class.java)
                airLineList.add(customLogBulkData!!)
            }

            PassengerDataItem(
                id = passengerID,
                name = passengerName,
                trips = passengerTrips,
                V = passenger_v,
                airline = airLineList

            )
        } else if (monumentElement.isJsonObject) {
            val airlineList = ArrayList<Airline>()
            airlineList.add(
                context.deserialize<Any>(
                    monumentElement.asJsonObject,
                    Airline::class.java
                ) as Airline
            )

            PassengerDataItem(
                id = passengerID,
                name = passengerName,
                trips = passengerTrips,
                V = passenger_v,
                airline = airlineList

            )
        } else {
            throw JsonParseException("Unsupported type of monument element")
        }
    }
}