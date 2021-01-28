package com.maxx.passengerapp.presentation.ui.main;

import androidx.hilt.lifecycle.ViewModelAssistedFactory;
import androidx.lifecycle.ViewModel;
import dagger.Binds;
import dagger.Module;
import dagger.hilt.InstallIn;
import dagger.hilt.android.components.ActivityRetainedComponent;
import dagger.hilt.codegen.OriginatingElement;
import dagger.multibindings.IntoMap;
import dagger.multibindings.StringKey;
import javax.annotation.Generated;

@Generated("androidx.hilt.AndroidXHiltProcessor")
@Module
@InstallIn(ActivityRetainedComponent.class)
@OriginatingElement(
    topLevelClass = MainFragmentViewModel.class
)
public interface MainFragmentViewModel_HiltModule {
  @Binds
  @IntoMap
  @StringKey("com.maxx.passengerapp.presentation.ui.main.MainFragmentViewModel")
  ViewModelAssistedFactory<? extends ViewModel> bind(MainFragmentViewModel_AssistedFactory factory);
}
