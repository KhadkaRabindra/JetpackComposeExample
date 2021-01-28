package com.maxx.passengerapp.presentation.ui.detail;

import androidx.annotation.NonNull;
import androidx.hilt.lifecycle.ViewModelAssistedFactory;
import androidx.lifecycle.SavedStateHandle;
import com.maxx.passengerapp.repository.PassengerRepository;
import java.lang.Override;
import javax.annotation.Generated;
import javax.inject.Inject;
import javax.inject.Provider;

@Generated("androidx.hilt.AndroidXHiltProcessor")
public final class DetailFragmentViewModel_AssistedFactory implements ViewModelAssistedFactory<DetailFragmentViewModel> {
  private final Provider<PassengerRepository> repository;

  @Inject
  DetailFragmentViewModel_AssistedFactory(Provider<PassengerRepository> repository) {
    this.repository = repository;
  }

  @Override
  @NonNull
  public DetailFragmentViewModel create(@NonNull SavedStateHandle arg0) {
    return new DetailFragmentViewModel(repository.get(), arg0);
  }
}
