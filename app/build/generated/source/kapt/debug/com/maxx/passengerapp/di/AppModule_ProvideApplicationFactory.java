package com.maxx.passengerapp.di;

import android.content.Context;
import com.maxx.passengerapp.MyApplication;
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
public final class AppModule_ProvideApplicationFactory implements Factory<MyApplication> {
  private final Provider<Context> appProvider;

  public AppModule_ProvideApplicationFactory(Provider<Context> appProvider) {
    this.appProvider = appProvider;
  }

  @Override
  public MyApplication get() {
    return provideApplication(appProvider.get());
  }

  public static AppModule_ProvideApplicationFactory create(Provider<Context> appProvider) {
    return new AppModule_ProvideApplicationFactory(appProvider);
  }

  public static MyApplication provideApplication(Context app) {
    return Preconditions.checkNotNull(AppModule.INSTANCE.provideApplication(app), "Cannot return null from a non-@Nullable @Provides method");
  }
}
