package com.maxx.passengerapp.di;

import com.google.gson.Gson;
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
public final class NetworkModule_ProvideConverterFactory implements Factory<Gson> {
  @Override
  public Gson get() {
    return provideConverter();
  }

  public static NetworkModule_ProvideConverterFactory create() {
    return InstanceHolder.INSTANCE;
  }

  public static Gson provideConverter() {
    return Preconditions.checkNotNull(NetworkModule.INSTANCE.provideConverter(), "Cannot return null from a non-@Nullable @Provides method");
  }

  private static final class InstanceHolder {
    private static final NetworkModule_ProvideConverterFactory INSTANCE = new NetworkModule_ProvideConverterFactory();
  }
}
