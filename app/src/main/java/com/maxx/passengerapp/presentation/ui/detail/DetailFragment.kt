package com.maxx.passengerapp.presentation.ui.detail

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.material.Scaffold
import androidx.compose.material.rememberScaffoldState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.ComposeView
import androidx.compose.ui.unit.dp
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.lifecycle.lifecycleScope
import com.codingwithmitch.mvvmrecipeapp.presentation.theme.AppTheme
import com.maxx.passengerapp.MyApplication
import com.maxx.passengerapp.presentation.components.CircularIndeterminateProgressBar
import com.maxx.passengerapp.presentation.components.DefaultSnackbar
import com.maxx.passengerapp.presentation.components.LoadingPassengerShimmer
import com.maxx.passengerapp.presentation.components.PassengerView
import com.maxx.passengerapp.presentation.components.util.SnackbarController
import com.maxx.passengerapp.presentation.ui.main.IMAGE_HEIGHT
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.launch
import javax.inject.Inject

@ExperimentalMaterialApi
@ExperimentalCoroutinesApi
@AndroidEntryPoint
class DetailFragment : Fragment() {

    @Inject
    lateinit var application: MyApplication

    private val snackbarController = SnackbarController(lifecycleScope)

    private val viewModel: DetailFragmentViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.getString("passengerID")?.let { passengerID ->
            Log.i("PASSENGER_ID", passengerID)
            viewModel.onTriggerEvent(PassengerEvent.GetPassengerEvent(passengerID))
        }
    }

    @ExperimentalMaterialApi
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return ComposeView(requireContext()).apply {
            setContent {

                val loading = viewModel.loading.value

                val recipe = viewModel.passengerLiveData.value

                val scaffoldState = rememberScaffoldState()

                AppTheme(
                    displayProgressBar = loading,
                    scaffoldState = scaffoldState,
                    darkTheme = application.isDark.value,
                ) {
                    Scaffold(
                        scaffoldState = scaffoldState,
                        snackbarHost = {
                            scaffoldState.snackbarHostState
                        }
                    ) {
                        Box(
                            modifier = Modifier.fillMaxSize()
                        ) {
                            recipe?.let {
                                PassengerView(
                                    passenger = it,
                                )
                            }

                            CircularIndeterminateProgressBar(
                                isDisplayed = loading,
                                verticalBias = 0.3f
                            )
                            DefaultSnackbar(
                                snackbarHostState = scaffoldState.snackbarHostState,
                                onDismiss = {
                                    scaffoldState.snackbarHostState.currentSnackbarData?.dismiss()
                                },
                                modifier = Modifier.align(Alignment.BottomCenter)
                            )
                        }
                    }
                }
            }
        }
    }
}