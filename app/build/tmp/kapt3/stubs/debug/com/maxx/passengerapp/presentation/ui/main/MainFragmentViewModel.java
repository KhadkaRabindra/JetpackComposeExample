package com.maxx.passengerapp.presentation.ui.main;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0016\u0010\u001b\u001a\u00020\u001c2\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010H\u0002J\b\u0010\u001e\u001a\u00020\u001cH\u0002J\u0011\u0010\u001f\u001a\u00020\u001cH\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010 J\u0011\u0010!\u001a\u00020\u001cH\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010 J\u000e\u0010\"\u001a\u00020\u001c2\u0006\u0010#\u001a\u00020\rJ\u000e\u0010$\u001a\u00020\u001c2\u0006\u0010%\u001a\u00020&J\b\u0010\'\u001a\u00020\u001cH\u0002J\u0011\u0010(\u001a\u00020\u001cH\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010 J\u0010\u0010)\u001a\u00020\u001c2\u0006\u0010#\u001a\u00020\rH\u0002J\u0010\u0010*\u001a\u00020\u001c2\u0006\u0010\f\u001a\u00020\rH\u0002J\u0010\u0010+\u001a\u00020\u001c2\u0006\u0010\u0013\u001a\u00020\u0014H\u0002R\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u001d\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u00100\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000bR\u0017\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000bR\u001a\u0010\u0016\u001a\u00020\rX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006,"}, d2 = {"Lcom/maxx/passengerapp/presentation/ui/main/MainFragmentViewModel;", "Landroidx/lifecycle/ViewModel;", "repository", "Lcom/maxx/passengerapp/repository/PassengerRepository;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "(Lcom/maxx/passengerapp/repository/PassengerRepository;Landroidx/lifecycle/SavedStateHandle;)V", "loading", "Landroidx/compose/runtime/MutableState;", "", "getLoading", "()Landroidx/compose/runtime/MutableState;", "page", "", "getPage", "passengers", "", "Lcom/maxx/passengerapp/domain/model/Passenger;", "getPassengers", "query", "", "getQuery", "recipeListScrollPosition", "getRecipeListScrollPosition", "()I", "setRecipeListScrollPosition", "(I)V", "appendRecipes", "", "recipes", "incrementPage", "newSearch", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "nextPage", "onChangeRecipeScrollPosition", "position", "onTriggerEvent", "event", "Lcom/maxx/passengerapp/presentation/ui/main/PassengerListEvent;", "resetSearchState", "restoreState", "setListScrollPosition", "setPage", "setQuery", "app_debug"})
public final class MainFragmentViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private final androidx.compose.runtime.MutableState<java.util.List<com.maxx.passengerapp.domain.model.Passenger>> passengers = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.compose.runtime.MutableState<java.lang.String> query = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.compose.runtime.MutableState<java.lang.Boolean> loading = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.compose.runtime.MutableState<java.lang.Integer> page = null;
    private int recipeListScrollPosition = 0;
    private final com.maxx.passengerapp.repository.PassengerRepository repository = null;
    private final androidx.lifecycle.SavedStateHandle savedStateHandle = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.compose.runtime.MutableState<java.util.List<com.maxx.passengerapp.domain.model.Passenger>> getPassengers() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.compose.runtime.MutableState<java.lang.String> getQuery() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.compose.runtime.MutableState<java.lang.Boolean> getLoading() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.compose.runtime.MutableState<java.lang.Integer> getPage() {
        return null;
    }
    
    public final int getRecipeListScrollPosition() {
        return 0;
    }
    
    public final void setRecipeListScrollPosition(int p0) {
    }
    
    public final void onTriggerEvent(@org.jetbrains.annotations.NotNull()
    com.maxx.passengerapp.presentation.ui.main.PassengerListEvent event) {
    }
    
    /**
     * Append new recipes to the current list of recipes
     */
    private final void appendRecipes(java.util.List<com.maxx.passengerapp.domain.model.Passenger> recipes) {
    }
    
    private final void incrementPage() {
    }
    
    public final void onChangeRecipeScrollPosition(int position) {
    }
    
    /**
     * Called when a new search is executed.
     */
    private final void resetSearchState() {
    }
    
    private final void setListScrollPosition(int position) {
    }
    
    private final void setPage(int page) {
    }
    
    private final void setQuery(java.lang.String query) {
    }
    
    @androidx.hilt.lifecycle.ViewModelInject()
    public MainFragmentViewModel(@org.jetbrains.annotations.NotNull()
    com.maxx.passengerapp.repository.PassengerRepository repository, @org.jetbrains.annotations.NotNull()
    @androidx.hilt.Assisted()
    androidx.lifecycle.SavedStateHandle savedStateHandle) {
        super();
    }
}