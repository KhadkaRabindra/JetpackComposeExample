package com.maxx.passengerapp.di;

import com.maxx.passengerapp.network.PassengerService;
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
public final class NetworkModule_ProvideRecipeServiceFactory implements Factory<PassengerService> {
  @Override
  public PassengerService get() {
    return provideRecipeService();
  }

  public static NetworkModule_ProvideRecipeServiceFactory create() {
    return InstanceHolder.INSTANCE;
  }

  public static PassengerService provideRecipeService() {
    return Preconditions.checkNotNull(NetworkModule.INSTANCE.provideRecipeService(), "Cannot return null from a non-@Nullable @Provides method");
  }

  private static final class InstanceHolder {
    private static final NetworkModule_ProvideRecipeServiceFactory INSTANCE = new NetworkModule_ProvideRecipeServiceFactory();
  }
}
