package com.maxx.passengerapp.di;

import com.maxx.passengerapp.network.passenger_model.PassengerDtoMapper;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;

@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class NetworkModule_ProvidePassengerMapperFactory implements Factory<PassengerDtoMapper> {
  @Override
  public PassengerDtoMapper get() {
    return providePassengerMapper();
  }

  public static NetworkModule_ProvidePassengerMapperFactory create() {
    return InstanceHolder.INSTANCE;
  }

  public static PassengerDtoMapper providePassengerMapper() {
    return Preconditions.checkNotNull(NetworkModule.INSTANCE.providePassengerMapper(), "Cannot return null from a non-@Nullable @Provides method");
  }

  private static final class InstanceHolder {
    private static final NetworkModule_ProvidePassengerMapperFactory INSTANCE = new NetworkModule_ProvidePassengerMapperFactory();
  }
}
