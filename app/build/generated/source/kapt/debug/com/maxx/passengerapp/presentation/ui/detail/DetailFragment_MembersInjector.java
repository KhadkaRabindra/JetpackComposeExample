package com.maxx.passengerapp.presentation.ui.detail;

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
public final class DetailFragment_MembersInjector implements MembersInjector<DetailFragment> {
  private final Provider<MyApplication> applicationProvider;

  public DetailFragment_MembersInjector(Provider<MyApplication> applicationProvider) {
    this.applicationProvider = applicationProvider;
  }

  public static MembersInjector<DetailFragment> create(
      Provider<MyApplication> applicationProvider) {
    return new DetailFragment_MembersInjector(applicationProvider);
  }

  @Override
  public void injectMembers(DetailFragment instance) {
    injectApplication(instance, applicationProvider.get());
  }

  @InjectedFieldSignature("com.maxx.passengerapp.presentation.ui.detail.DetailFragment.application")
  public static void injectApplication(DetailFragment instance, MyApplication application) {
    instance.application = application;
  }
}
