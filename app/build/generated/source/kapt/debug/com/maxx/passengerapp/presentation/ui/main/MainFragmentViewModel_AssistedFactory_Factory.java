package com.maxx.passengerapp.presentation.ui.main;

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
public final class MainFragmentViewModel_AssistedFactory_Factory implements Factory<MainFragmentViewModel_AssistedFactory> {
  private final Provider<PassengerRepository> repositoryProvider;

  public MainFragmentViewModel_AssistedFactory_Factory(
      Provider<PassengerRepository> repositoryProvider) {
    this.repositoryProvider = repositoryProvider;
  }

  @Override
  public MainFragmentViewModel_AssistedFactory get() {
    return newInstance(repositoryProvider);
  }

  public static MainFragmentViewModel_AssistedFactory_Factory create(
      Provider<PassengerRepository> repositoryProvider) {
    return new MainFragmentViewModel_AssistedFactory_Factory(repositoryProvider);
  }

  public static MainFragmentViewModel_AssistedFactory newInstance(
      Provider<PassengerRepository> repository) {
    return new MainFragmentViewModel_AssistedFactory(repository);
  }
}
