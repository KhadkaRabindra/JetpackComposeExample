package com.maxx.passengerapp.presentation.ui.detail;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0019\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0013J\u000e\u0010\u0014\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00020\u0016R\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0019\u0010\f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0017"}, d2 = {"Lcom/maxx/passengerapp/presentation/ui/detail/DetailFragmentViewModel;", "Landroidx/lifecycle/ViewModel;", "repository", "Lcom/maxx/passengerapp/repository/PassengerRepository;", "state", "Landroidx/lifecycle/SavedStateHandle;", "(Lcom/maxx/passengerapp/repository/PassengerRepository;Landroidx/lifecycle/SavedStateHandle;)V", "loading", "Landroidx/compose/runtime/MutableState;", "", "getLoading", "()Landroidx/compose/runtime/MutableState;", "passengerLiveData", "Lcom/maxx/passengerapp/domain/model/Passenger;", "getPassengerLiveData", "getRecipe", "", "id", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onTriggerEvent", "event", "Lcom/maxx/passengerapp/presentation/ui/detail/PassengerEvent;", "app_debug"})
public final class DetailFragmentViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private final androidx.compose.runtime.MutableState<com.maxx.passengerapp.domain.model.Passenger> passengerLiveData = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.compose.runtime.MutableState<java.lang.Boolean> loading = null;
    private final com.maxx.passengerapp.repository.PassengerRepository repository = null;
    private final androidx.lifecycle.SavedStateHandle state = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.compose.runtime.MutableState<com.maxx.passengerapp.domain.model.Passenger> getPassengerLiveData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.compose.runtime.MutableState<java.lang.Boolean> getLoading() {
        return null;
    }
    
    public final void onTriggerEvent(@org.jetbrains.annotations.NotNull()
    com.maxx.passengerapp.presentation.ui.detail.PassengerEvent event) {
    }
    
    @androidx.hilt.lifecycle.ViewModelInject()
    public DetailFragmentViewModel(@org.jetbrains.annotations.NotNull()
    com.maxx.passengerapp.repository.PassengerRepository repository, @org.jetbrains.annotations.NotNull()
    @androidx.hilt.Assisted()
    androidx.lifecycle.SavedStateHandle state) {
        super();
    }
}