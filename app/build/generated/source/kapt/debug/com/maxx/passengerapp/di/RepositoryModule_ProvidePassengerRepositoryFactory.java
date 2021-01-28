package com.maxx.passengerapp.di;

import com.maxx.passengerapp.network.PassengerService;
import com.maxx.passengerapp.network.passenger_model.PassengerDtoMapper;
import com.maxx.passengerapp.repository.PassengerRepository;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
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
public final class RepositoryModule_ProvidePassengerRepositoryFactory implements Factory<PassengerRepository> {
  private final Provider<PassengerService> passengerServiceProvider;

  private final Provider<PassengerDtoMapper> passengerDtoMapperProvider;

  public RepositoryModule_ProvidePassengerRepositoryFactory(
      Provider<PassengerService> passengerServiceProvider,
      Provider<PassengerDtoMapper> passengerDtoMapperProvider) {
    this.passengerServiceProvider = passengerServiceProvider;
    this.passengerDtoMapperProvider = passengerDtoMapperProvider;
  }

  @Override
  public PassengerRepository get() {
    return providePassengerRepository(passengerServiceProvider.get(), passengerDtoMapperProvider.get());
  }

  public static RepositoryModule_ProvidePassengerRepositoryFactory create(
      Provider<PassengerService> passengerServiceProvider,
      Provider<PassengerDtoMapper> passengerDtoMapperProvider) {
    return new RepositoryModule_ProvidePassengerRepositoryFactory(passengerServiceProvider, passengerDtoMapperProvider);
  }

  public static PassengerRepository providePassengerRepository(PassengerService passengerService,
      PassengerDtoMapper passengerDtoMapper) {
    return Preconditions.checkNotNull(RepositoryModule.INSTANCE.providePassengerRepository(passengerService, passengerDtoMapper), "Cannot return null from a non-@Nullable @Provides method");
  }
}
