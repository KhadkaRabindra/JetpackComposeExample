package com.maxx.passengerapp.presentation.ui.main;

import com.maxx.passengerapp.MyApplication;
import dagger.MembersInjector;
import dagger.internal.InjectedFieldSignature;
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
public final class MainFragment_MembersInjector implements MembersInjector<MainFragment> {
  private final Provider<MyApplication> applicationProvider;

  public MainFragment_MembersInjector(Provider<MyApplication> applicationProvider) {
    this.applicationProvider = applicationProvider;
  }

  public static MembersInjector<MainFragment> create(Provider<MyApplication> applicationProvider) {
    return new MainFragment_MembersInjector(applicationProvider);
  }

  @Override
  public void injectMembers(MainFragment instance) {
    injectApplication(instance, applicationProvider.get());
  }

  @InjectedFieldSignature("com.maxx.passengerapp.presentation.ui.main.MainFragment.application")
  public static void injectApplication(MainFragment instance, MyApplication application) {
    instance.application = application;
  }
}
