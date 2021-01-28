package com.maxx.passengerapp.presentation.ui.detail

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.compose.animation.animatedColor
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Menu
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.ComposeView
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.core.content.ContextCompat
import androidx.core.view.size
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.lifecycle.lifecycleScope
import com.codingwithmitch.mvvmrecipeapp.presentation.theme.AppTheme
import com.maxx.passengerapp.MyApplication
import com.maxx.passengerapp.R
import com.maxx.passengerapp.presentation.components.*
import com.maxx.passengerapp.presentation.components.util.SnackbarController
import com.maxx.passengerapp.util.ColorUtils
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.ExperimentalCoroutinesApi
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
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
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
                        },
                        topBar = {
                            TopAppBar(
                                title = {
                                    Text(
                                        text = "PassengerApp",
                                        color = ColorUtils.getColor("FFFFFFFF"),
                                        fontSize = TextUnit.Sp(20)
                                    )
                                },
                                backgroundColor = ColorUtils.getColor("FF3700B3"),
                                navigationIcon = {
                                    IconButton(onClick = {
                                        requireActivity().onBackPressed()
                                    }) {
                                        Icon(Icons.Filled.ArrowBack, tint = ColorUtils.getColor("FFFFFFFF"))
                                    }
                                }

                            )
                        }


                    ) {
                        Box(
                            modifier = Modifier.fillMaxSize()
                        ) {

                            Column(
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .padding(top = 12.dp, bottom = 12.dp, start = 8.dp, end = 8.dp)
                            ) {
                                recipe?.let {
                                    PassengerView(
                                        passenger = it,
                                    )
                                }

                                if (recipe?.airline != null) {
                                    AirlineList(
                                        loading = loading,
                                        airlines = recipe?.airline!!
                                    )
                                }
                            }
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