package com.maxx.passengerapp.presentation.ui.detail;

import com.maxx.passengerapp.repository.PassengerRepository;
import dagger.internal.Factory;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class DetailFragmentViewModel_AssistedFactory_Factory implements Factory<DetailFragmentViewModel_AssistedFactory> {
  private final Provider<PassengerRepository> repositoryProvider;

  public DetailFragmentViewModel_AssistedFactory_Factory(
      Provider<PassengerRepository> repositoryProvider) {
    this.repositoryProvider = repositoryProvider;
  }

  @Override
  public DetailFragmentViewModel_AssistedFactory get() {
    return newInstance(repositoryProvider);
  }

  public static DetailFragmentViewModel_AssistedFactory_Factory create(
      Provider<PassengerRepository> repositoryProvider) {
    return new DetailFragmentViewModel_AssistedFactory_Factory(repositoryProvider);
  }

  public static DetailFragmentViewModel_AssistedFactory newInstance(
      Provider<PassengerRepository> repository) {
    return new DetailFragmentViewModel_AssistedFactory(repository);
  }
}
