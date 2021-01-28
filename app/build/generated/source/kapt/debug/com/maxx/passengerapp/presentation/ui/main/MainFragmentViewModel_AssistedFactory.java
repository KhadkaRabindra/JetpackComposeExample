package com.maxx.passengerapp.presentation.ui.main;

import androidx.annotation.NonNull;
import androidx.hilt.lifecycle.ViewModelAssistedFactory;
import androidx.lifecycle.SavedStateHandle;
import com.maxx.passengerapp.repository.PassengerRepository;
import java.lang.Override;
import javax.annotation.Generated;
import javax.inject.Inject;
import javax.inject.Provider;

@Generated("androidx.hilt.AndroidXHiltProcessor")
public final class MainFragmentViewModel_AssistedFactory implements ViewModelAssistedFactory<MainFragmentViewModel> {
  private final Provider<PassengerRepository> repository;

  @Inject
  MainFragmentViewModel_AssistedFactory(Provider<PassengerRepository> repository) {
    this.repository = repository;
  }

  @Override
  @NonNull
  public MainFragmentViewModel create(@NonNull SavedStateHandle arg0) {
    return new MainFragmentViewModel(repository.get(), arg0);
  }
}
