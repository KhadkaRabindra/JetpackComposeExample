package com.maxx.passengerapp.presentation.ui.main;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0003\u0004\u0005B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u0082\u0001\u0003\u0006\u0007\b\u00a8\u0006\t"}, d2 = {"Lcom/maxx/passengerapp/presentation/ui/main/PassengerListEvent;", "", "()V", "NewSearchEvent", "NextPageEvent", "RestoreStateEvent", "Lcom/maxx/passengerapp/presentation/ui/main/PassengerListEvent$NewSearchEvent;", "Lcom/maxx/passengerapp/presentation/ui/main/PassengerListEvent$NextPageEvent;", "Lcom/maxx/passengerapp/presentation/ui/main/PassengerListEvent$RestoreStateEvent;", "app_debug"})
public abstract class PassengerListEvent {
    
    private PassengerListEvent() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/maxx/passengerapp/presentation/ui/main/PassengerListEvent$NewSearchEvent;", "Lcom/maxx/passengerapp/presentation/ui/main/PassengerListEvent;", "()V", "app_debug"})
    public static final class NewSearchEvent extends com.maxx.passengerapp.presentation.ui.main.PassengerListEvent {
        @org.jetbrains.annotations.NotNull()
        public static final com.maxx.passengerapp.presentation.ui.main.PassengerListEvent.NewSearchEvent INSTANCE = null;
        
        private NewSearchEvent() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/maxx/passengerapp/presentation/ui/main/PassengerListEvent$NextPageEvent;", "Lcom/maxx/passengerapp/presentation/ui/main/PassengerListEvent;", "()V", "app_debug"})
    public static final class NextPageEvent extends com.maxx.passengerapp.presentation.ui.main.PassengerListEvent {
        @org.jetbrains.annotations.NotNull()
        public static final com.maxx.passengerapp.presentation.ui.main.PassengerListEvent.NextPageEvent INSTANCE = null;
        
        private NextPageEvent() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/maxx/passengerapp/presentation/ui/main/PassengerListEvent$RestoreStateEvent;", "Lcom/maxx/passengerapp/presentation/ui/main/PassengerListEvent;", "()V", "app_debug"})
    public static final class RestoreStateEvent extends com.maxx.passengerapp.presentation.ui.main.PassengerListEvent {
        @org.jetbrains.annotations.NotNull()
        public static final com.maxx.passengerapp.presentation.ui.main.PassengerListEvent.RestoreStateEvent INSTANCE = null;
        
        private RestoreStateEvent() {
            super();
        }
    }
}