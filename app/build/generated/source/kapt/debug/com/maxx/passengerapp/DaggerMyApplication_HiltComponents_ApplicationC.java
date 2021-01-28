package com.maxx.passengerapp;

import android.app.Activity;
import android.app.Service;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.hilt.lifecycle.ViewModelAssistedFactory;
import androidx.hilt.lifecycle.ViewModelFactoryModules_ActivityModule_ProvideFactoryFactory;
import androidx.hilt.lifecycle.ViewModelFactoryModules_FragmentModule_ProvideFactoryFactory;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import com.maxx.passengerapp.di.AppModule;
import com.maxx.passengerapp.di.AppModule_ProvideApplicationFactory;
import com.maxx.passengerapp.di.NetworkModule;
import com.maxx.passengerapp.di.NetworkModule_ProvidePassengerMapperFactory;
import com.maxx.passengerapp.di.NetworkModule_ProvideRecipeServiceFactory;
import com.maxx.passengerapp.di.RepositoryModule;
import com.maxx.passengerapp.di.RepositoryModule_ProvidePassengerRepositoryFactory;
import com.maxx.passengerapp.network.PassengerService;
import com.maxx.passengerapp.network.passenger_model.PassengerDtoMapper;
import com.maxx.passengerapp.presentation.ui.detail.DetailFragment;
import com.maxx.passengerapp.presentation.ui.detail.DetailFragmentViewModel_AssistedFactory;
import com.maxx.passengerapp.presentation.ui.detail.DetailFragmentViewModel_AssistedFactory_Factory;
import com.maxx.passengerapp.presentation.ui.detail.DetailFragment_MembersInjector;
import com.maxx.passengerapp.presentation.ui.main.MainActivity;
import com.maxx.passengerapp.presentation.ui.main.MainFragment;
import com.maxx.passengerapp.presentation.ui.main.MainFragmentViewModel_AssistedFactory;
import com.maxx.passengerapp.presentation.ui.main.MainFragmentViewModel_AssistedFactory_Factory;
import com.maxx.passengerapp.presentation.ui.main.MainFragment_MembersInjector;
import com.maxx.passengerapp.repository.PassengerRepository;
import dagger.hilt.android.internal.builders.ActivityComponentBuilder;
import dagger.hilt.android.internal.builders.ActivityRetainedComponentBuilder;
import dagger.hilt.android.internal.builders.FragmentComponentBuilder;
import dagger.hilt.android.internal.builders.ServiceComponentBuilder;
import dagger.hilt.android.internal.builders.ViewComponentBuilder;
import dagger.hilt.android.internal.builders.ViewWithFragmentComponentBuilder;
import dagger.hilt.android.internal.modules.ApplicationContextModule;
import dagger.hilt.android.internal.modules.ApplicationContextModule_ProvideApplicationFactory;
import dagger.hilt.android.internal.modules.ApplicationContextModule_ProvideContextFactory;
import dagger.internal.DoubleCheck;
import dagger.internal.MapBuilder;
import dagger.internal.MemoizedSentinel;
import dagger.internal.Preconditions;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
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
public final class DaggerMyApplication_HiltComponents_ApplicationC extends MyApplication_HiltComponents.ApplicationC {
  private final ApplicationContextModule applicationContextModule;

  private volatile Object passengerService = new MemoizedSentinel();

  private volatile Object passengerDtoMapper = new MemoizedSentinel();

  private volatile Object passengerRepository = new MemoizedSentinel();

  private volatile Provider<PassengerRepository> providePassengerRepositoryProvider;

  private volatile Object myApplication = new MemoizedSentinel();

  private DaggerMyApplication_HiltComponents_ApplicationC(
      ApplicationContextModule applicationContextModuleParam) {
    this.applicationContextModule = applicationContextModuleParam;
  }

  public static Builder builder() {
    return new Builder();
  }

  private PassengerService getPassengerService() {
    Object local = passengerService;
    if (local instanceof MemoizedSentinel) {
      synchronized (local) {
        local = passengerService;
        if (local instanceof MemoizedSentinel) {
          local = NetworkModule_ProvideRecipeServiceFactory.provideRecipeService();
          passengerService = DoubleCheck.reentrantCheck(passengerService, local);
        }
      }
    }
    return (PassengerService) local;
  }

  private PassengerDtoMapper getPassengerDtoMapper() {
    Object local = passengerDtoMapper;
    if (local instanceof MemoizedSentinel) {
      synchronized (local) {
        local = passengerDtoMapper;
        if (local instanceof MemoizedSentinel) {
          local = NetworkModule_ProvidePassengerMapperFactory.providePassengerMapper();
          passengerDtoMapper = DoubleCheck.reentrantCheck(passengerDtoMapper, local);
        }
      }
    }
    return (PassengerDtoMapper) local;
  }

  private PassengerRepository getPassengerRepository() {
    Object local = passengerRepository;
    if (local instanceof MemoizedSentinel) {
      synchronized (local) {
        local = passengerRepository;
        if (local instanceof MemoizedSentinel) {
          local = RepositoryModule_ProvidePassengerRepositoryFactory.providePassengerRepository(getPassengerService(), getPassengerDtoMapper());
          passengerRepository = DoubleCheck.reentrantCheck(passengerRepository, local);
        }
      }
    }
    return (PassengerRepository) local;
  }

  private Provider<PassengerRepository> getPassengerRepositoryProvider() {
    Object local = providePassengerRepositoryProvider;
    if (local == null) {
      local = new SwitchingProvider<>(0);
      providePassengerRepositoryProvider = (Provider<PassengerRepository>) local;
    }
    return (Provider<PassengerRepository>) local;
  }

  private MyApplication getMyApplication() {
    Object local = myApplication;
    if (local instanceof MemoizedSentinel) {
      synchronized (local) {
        local = myApplication;
        if (local instanceof MemoizedSentinel) {
          local = AppModule_ProvideApplicationFactory.provideApplication(ApplicationContextModule_ProvideContextFactory.provideContext(applicationContextModule));
          myApplication = DoubleCheck.reentrantCheck(myApplication, local);
        }
      }
    }
    return (MyApplication) local;
  }

  @Override
  public void injectMyApplication(MyApplication myApplication) {
  }

  @Override
  public ActivityRetainedComponentBuilder retainedComponentBuilder() {
    return new ActivityRetainedCBuilder();
  }

  @Override
  public ServiceComponentBuilder serviceComponentBuilder() {
    return new ServiceCBuilder();
  }

  public static final class Builder {
    private ApplicationContextModule applicationContextModule;

    private Builder() {
    }

    /**
     * @deprecated This module is declared, but an instance is not used in the component. This method is a no-op. For more, see https://dagger.dev/unused-modules.
     */
    @Deprecated
    public Builder appModule(AppModule appModule) {
      Preconditions.checkNotNull(appModule);
      return this;
    }

    public Builder applicationContextModule(ApplicationContextModule applicationContextModule) {
      this.applicationContextModule = Preconditions.checkNotNull(applicationContextModule);
      return this;
    }

    /**
     * @deprecated This module is declared, but an instance is not used in the component. This method is a no-op. For more, see https://dagger.dev/unused-modules.
     */
    @Deprecated
    public Builder networkModule(NetworkModule networkModule) {
      Preconditions.checkNotNull(networkModule);
      return this;
    }

    /**
     * @deprecated This module is declared, but an instance is not used in the component. This method is a no-op. For more, see https://dagger.dev/unused-modules.
     */
    @Deprecated
    public Builder repositoryModule(RepositoryModule repositoryModule) {
      Preconditions.checkNotNull(repositoryModule);
      return this;
    }

    public MyApplication_HiltComponents.ApplicationC build() {
      Preconditions.checkBuilderRequirement(applicationContextModule, ApplicationContextModule.class);
      return new DaggerMyApplication_HiltComponents_ApplicationC(applicationContextModule);
    }
  }

  private final class ActivityRetainedCBuilder implements MyApplication_HiltComponents.ActivityRetainedC.Builder {
    @Override
    public MyApplication_HiltComponents.ActivityRetainedC build() {
      return new ActivityRetainedCImpl();
    }
  }

  private final class ActivityRetainedCImpl extends MyApplication_HiltComponents.ActivityRetainedC {
    private ActivityRetainedCImpl() {

    }

    @Override
    public ActivityComponentBuilder activityComponentBuilder() {
      return new ActivityCBuilder();
    }

    private final class ActivityCBuilder implements MyApplication_HiltComponents.ActivityC.Builder {
      private Activity activity;

      @Override
      public ActivityCBuilder activity(Activity activity) {
        this.activity = Preconditions.checkNotNull(activity);
        return this;
      }

      @Override
      public MyApplication_HiltComponents.ActivityC build() {
        Preconditions.checkBuilderRequirement(activity, Activity.class);
        return new ActivityCImpl(activity);
      }
    }

    private final class ActivityCImpl extends MyApplication_HiltComponents.ActivityC {
      private final Activity activity;

      private volatile Provider<DetailFragmentViewModel_AssistedFactory> detailFragmentViewModel_AssistedFactoryProvider;

      private volatile Provider<MainFragmentViewModel_AssistedFactory> mainFragmentViewModel_AssistedFactoryProvider;

      private ActivityCImpl(Activity activityParam) {
        this.activity = activityParam;
      }

      private DetailFragmentViewModel_AssistedFactory getDetailFragmentViewModel_AssistedFactory() {
        return DetailFragmentViewModel_AssistedFactory_Factory.newInstance(DaggerMyApplication_HiltComponents_ApplicationC.this.getPassengerRepositoryProvider());
      }

      private Provider<DetailFragmentViewModel_AssistedFactory> getDetailFragmentViewModel_AssistedFactoryProvider(
          ) {
        Object local = detailFragmentViewModel_AssistedFactoryProvider;
        if (local == null) {
          local = new SwitchingProvider<>(0);
          detailFragmentViewModel_AssistedFactoryProvider = (Provider<DetailFragmentViewModel_AssistedFactory>) local;
        }
        return (Provider<DetailFragmentViewModel_AssistedFactory>) local;
      }

      private MainFragmentViewModel_AssistedFactory getMainFragmentViewModel_AssistedFactory() {
        return MainFragmentViewModel_AssistedFactory_Factory.newInstance(DaggerMyApplication_HiltComponents_ApplicationC.this.getPassengerRepositoryProvider());
      }

      private Provider<MainFragmentViewModel_AssistedFactory> getMainFragmentViewModel_AssistedFactoryProvider(
          ) {
        Object local = mainFragmentViewModel_AssistedFactoryProvider;
        if (local == null) {
          local = new SwitchingProvider<>(1);
          mainFragmentViewModel_AssistedFactoryProvider = (Provider<MainFragmentViewModel_AssistedFactory>) local;
        }
        return (Provider<MainFragmentViewModel_AssistedFactory>) local;
      }

      private Map<String, Provider<ViewModelAssistedFactory<? extends ViewModel>>> getMapOfStringAndProviderOfViewModelAssistedFactoryOf(
          ) {
        return MapBuilder.<String, Provider<ViewModelAssistedFactory<? extends ViewModel>>>newMapBuilder(2).put("com.maxx.passengerapp.presentation.ui.detail.DetailFragmentViewModel", (Provider) getDetailFragmentViewModel_AssistedFactoryProvider()).put("com.maxx.passengerapp.presentation.ui.main.MainFragmentViewModel", (Provider) getMainFragmentViewModel_AssistedFactoryProvider()).build();
      }

      private ViewModelProvider.Factory getProvideFactory() {
        return ViewModelFactoryModules_ActivityModule_ProvideFactoryFactory.provideFactory(activity, ApplicationContextModule_ProvideApplicationFactory.provideApplication(DaggerMyApplication_HiltComponents_ApplicationC.this.applicationContextModule), getMapOfStringAndProviderOfViewModelAssistedFactoryOf());
      }

      @Override
      public void injectMainActivity(MainActivity mainActivity) {
      }

      @Override
      public Set<ViewModelProvider.Factory> getActivityViewModelFactory() {
        return Collections.<ViewModelProvider.Factory>singleton(getProvideFactory());
      }

      @Override
      public FragmentComponentBuilder fragmentComponentBuilder() {
        return new FragmentCBuilder();
      }

      @Override
      public ViewComponentBuilder viewComponentBuilder() {
        return new ViewCBuilder();
      }

      private final class FragmentCBuilder implements MyApplication_HiltComponents.FragmentC.Builder {
        private Fragment fragment;

        @Override
        public FragmentCBuilder fragment(Fragment fragment) {
          this.fragment = Preconditions.checkNotNull(fragment);
          return this;
        }

        @Override
        public MyApplication_HiltComponents.FragmentC build() {
          Preconditions.checkBuilderRequirement(fragment, Fragment.class);
          return new FragmentCImpl(fragment);
        }
      }

      private final class FragmentCImpl extends MyApplication_HiltComponents.FragmentC {
        private final Fragment fragment;

        private FragmentCImpl(Fragment fragmentParam) {
          this.fragment = fragmentParam;
        }

        private ViewModelProvider.Factory getProvideFactory() {
          return ViewModelFactoryModules_FragmentModule_ProvideFactoryFactory.provideFactory(fragment, ApplicationContextModule_ProvideApplicationFactory.provideApplication(DaggerMyApplication_HiltComponents_ApplicationC.this.applicationContextModule), ActivityCImpl.this.getMapOfStringAndProviderOfViewModelAssistedFactoryOf());
        }

        @Override
        public void injectDetailFragment(DetailFragment detailFragment) {
          injectDetailFragment2(detailFragment);
        }

        @Override
        public void injectMainFragment(MainFragment mainFragment) {
          injectMainFragment2(mainFragment);
        }

        @Override
        public Set<ViewModelProvider.Factory> getFragmentViewModelFactory() {
          return Collections.<ViewModelProvider.Factory>singleton(getProvideFactory());
        }

        @Override
        public ViewWithFragmentComponentBuilder viewWithFragmentComponentBuilder() {
          return new ViewWithFragmentCBuilder();
        }

        private DetailFragment injectDetailFragment2(DetailFragment instance) {
          DetailFragment_MembersInjector.injectApplication(instance, DaggerMyApplication_HiltComponents_ApplicationC.this.getMyApplication());
          return instance;
        }

        private MainFragment injectMainFragment2(MainFragment instance) {
          MainFragment_MembersInjector.injectApplication(instance, DaggerMyApplication_HiltComponents_ApplicationC.this.getMyApplication());
          return instance;
        }

        private final class ViewWithFragmentCBuilder implements MyApplication_HiltComponents.ViewWithFragmentC.Builder {
          private View view;

          @Override
          public ViewWithFragmentCBuilder view(View view) {
            this.view = Preconditions.checkNotNull(view);
            return this;
          }

          @Override
          public MyApplication_HiltComponents.ViewWithFragmentC build() {
            Preconditions.checkBuilderRequirement(view, View.class);
            return new ViewWithFragmentCImpl(view);
          }
        }

        private final class ViewWithFragmentCImpl extends MyApplication_HiltComponents.ViewWithFragmentC {
          private ViewWithFragmentCImpl(View view) {

          }
        }
      }

      private final class ViewCBuilder implements MyApplication_HiltComponents.ViewC.Builder {
        private View view;

        @Override
        public ViewCBuilder view(View view) {
          this.view = Preconditions.checkNotNull(view);
          return this;
        }

        @Override
        public MyApplication_HiltComponents.ViewC build() {
          Preconditions.checkBuilderRequirement(view, View.class);
          return new ViewCImpl(view);
        }
      }

      private final class ViewCImpl extends MyApplication_HiltComponents.ViewC {
        private ViewCImpl(View view) {

        }
      }

      private final class SwitchingProvider<T> implements Provider<T> {
        private final int id;

        SwitchingProvider(int id) {
          this.id = id;
        }

        @SuppressWarnings("unchecked")
        @Override
        public T get() {
          switch (id) {
            case 0: // com.maxx.passengerapp.presentation.ui.detail.DetailFragmentViewModel_AssistedFactory 
            return (T) ActivityCImpl.this.getDetailFragmentViewModel_AssistedFactory();

            case 1: // com.maxx.passengerapp.presentation.ui.main.MainFragmentViewModel_AssistedFactory 
            return (T) ActivityCImpl.this.getMainFragmentViewModel_AssistedFactory();

            default: throw new AssertionError(id);
          }
        }
      }
    }
  }

  private final class ServiceCBuilder implements MyApplication_HiltComponents.ServiceC.Builder {
    private Service service;

    @Override
    public ServiceCBuilder service(Service service) {
      this.service = Preconditions.checkNotNull(service);
      return this;
    }

    @Override
    public MyApplication_HiltComponents.ServiceC build() {
      Preconditions.checkBuilderRequirement(service, Service.class);
      return new ServiceCImpl(service);
    }
  }

  private final class ServiceCImpl extends MyApplication_HiltComponents.ServiceC {
    private ServiceCImpl(Service service) {

    }
  }

  private final class SwitchingProvider<T> implements Provider<T> {
    private final int id;

    SwitchingProvider(int id) {
      this.id = id;
    }

    @SuppressWarnings("unchecked")
    @Override
    public T get() {
      switch (id) {
        case 0: // com.maxx.passengerapp.repository.PassengerRepository 
        return (T) DaggerMyApplication_HiltComponents_ApplicationC.this.getPassengerRepository();

        default: throw new AssertionError(id);
      }
    }
  }
}
