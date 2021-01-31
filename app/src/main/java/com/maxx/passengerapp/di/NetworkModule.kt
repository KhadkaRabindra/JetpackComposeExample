package com.maxx.passengerapp.di

import com.google.gson.Gson
import com.google.gson.GsonBuilder
import com.maxx.passengerapp.BuildConfig
import com.maxx.passengerapp.network.PassengerService
import com.maxx.passengerapp.network.passenger_model.PassengerDtoMapper
import com.maxx.passengerapp.network.passenger_response.PassengerDataItem
import com.maxx.passengerapp.util.PassengerDeserializer
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ApplicationComponent
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@Module
@InstallIn(ApplicationComponent::class)
object NetworkModule {

    @Singleton
    @Provides
    fun providePassengerMapper(): PassengerDtoMapper {
        return PassengerDtoMapper()
    }

    @Singleton
    @Provides
    fun provideRecipeService(okHttpClient: OkHttpClient): PassengerService {
        return Retrofit.Builder()
            .baseUrl("https://api.instantwebtools.net/v1/")
            .client(okHttpClient)
            .addConverterFactory(GsonConverterFactory.create(provideConverter()))
            .build()
            .create(PassengerService::class.java)
    }

    @Singleton
    @Provides
    fun provideOkHttpClient(): OkHttpClient {
        return OkHttpClient
            .Builder()
            //.addInterceptor(RemoteServiceInterceptor())
            .addInterceptor(HttpLoggingInterceptor().apply {
                level =
                    if (BuildConfig.DEBUG) HttpLoggingInterceptor.Level.BODY
                    else
                        HttpLoggingInterceptor.Level.NONE
            }).build()
    }

    @Singleton
    @Provides
    fun provideConverter() : Gson{
        return GsonBuilder().registerTypeAdapter(PassengerDataItem::class.java, PassengerDeserializer())
            .create()
    }


    @Singleton
    @Provides
    fun provideGson(): Gson {
        return GsonBuilder().setPrettyPrinting().create()
    }


}