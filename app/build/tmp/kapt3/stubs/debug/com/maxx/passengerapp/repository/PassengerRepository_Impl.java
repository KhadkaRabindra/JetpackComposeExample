package com.maxx.passengerapp.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0019\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000bJ1\u0010\f\u001a\u0012\u0012\u0004\u0012\u00020\b0\rj\b\u0012\u0004\u0012\u00020\b`\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0010H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0012R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0013"}, d2 = {"Lcom/maxx/passengerapp/repository/PassengerRepository_Impl;", "Lcom/maxx/passengerapp/repository/PassengerRepository;", "passengerService", "Lcom/maxx/passengerapp/network/PassengerService;", "mapper", "Lcom/maxx/passengerapp/network/passenger_model/PassengerDtoMapper;", "(Lcom/maxx/passengerapp/network/PassengerService;Lcom/maxx/passengerapp/network/passenger_model/PassengerDtoMapper;)V", "getPassengerById", "Lcom/maxx/passengerapp/domain/model/Passenger;", "id", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getPassengers", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "page", "", "size", "(IILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public final class PassengerRepository_Impl implements com.maxx.passengerapp.repository.PassengerRepository {
    private final com.maxx.passengerapp.network.PassengerService passengerService = null;
    private final com.maxx.passengerapp.network.passenger_model.PassengerDtoMapper mapper = null;
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object getPassengers(int page, int size, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.ArrayList<com.maxx.passengerapp.domain.model.Passenger>> p2) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object getPassengerById(@org.jetbrains.annotations.NotNull()
    java.lang.String id, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.maxx.passengerapp.domain.model.Passenger> p1) {
        return null;
    }
    
    public PassengerRepository_Impl(@org.jetbrains.annotations.NotNull()
    com.maxx.passengerapp.network.PassengerService passengerService, @org.jetbrains.annotations.NotNull()
    com.maxx.passengerapp.network.passenger_model.PassengerDtoMapper mapper) {
        super();
    }
}