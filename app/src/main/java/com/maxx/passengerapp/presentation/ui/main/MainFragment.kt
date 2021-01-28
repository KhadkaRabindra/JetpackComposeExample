package com.maxx.passengerapp.presentation.ui.main

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.compose.material.*
import androidx.compose.material.MaterialTheme.colors
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Menu
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Color.Companion.Blue
import androidx.compose.ui.graphics.Color.Companion.White
import androidx.compose.ui.platform.ComposeView
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.unit.TextUnit
import androidx.core.content.ContextCompat
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.lifecycle.lifecycleScope
import androidx.navigation.findNavController
import com.codingwithmitch.mvvmrecipeapp.presentation.theme.AppTheme
import com.maxx.passengerapp.MyApplication
import com.maxx.passengerapp.presentation.components.PassengerList
import com.maxx.passengerapp.presentation.components.util.SnackbarController
import com.maxx.passengerapp.util.ColorUtils
import com.maxx.passengerapp.util.ColorUtils.getColor
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.ExperimentalCoroutinesApi
import javax.inject.Inject

@ExperimentalMaterialApi
@ExperimentalCoroutinesApi
@AndroidEntryPoint
class MainFragment : Fragment() {

    @Inject
    lateinit var application: MyApplication

    private val viewModel: MainFragmentViewModel by viewModels()

    private val snackbarController = SnackbarController(lifecycleScope)

    @ExperimentalMaterialApi
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return ComposeView(requireContext()).apply {
            setContent {

                val loading = viewModel.loading.value
                val passengers = viewModel.passengers.value

                val page = viewModel.page.value
                val scaffoldState = rememberScaffoldState()
                AppTheme(
                        displayProgressBar = loading,
                        scaffoldState = scaffoldState,
                        darkTheme = application.isDark.value,
                ) {
                    Scaffold(
                        topBar = {
                            TopAppBar(
                                title = {
                                    Text(
                                        text = "PassengerApp",
                                        color = getColor("FFFFFFFF"),
                                        fontSize = TextUnit.Sp(20)
                                    )
                                },
                                backgroundColor = getColor("FF3700B3"),
                                navigationIcon = {
                                    IconButton(onClick = { }) {
                                        Icon(Icons.Filled.Menu, tint = ColorUtils.getColor("FFFFFFFF"))
                                    }
                                }

                            )
                        },
                        bodyContent = {
                            PassengerList(
                                loading = loading,
                                passengers = passengers,
                                onChangeScrollPosition = viewModel::onChangeRecipeScrollPosition,
                                page = page,
                                onTriggerNextPage = { viewModel.onTriggerEvent(PassengerListEvent.NextPageEvent) },
                                navController = findNavController(),
                                scaffoldState = scaffoldState,
                                snackbarController = snackbarController,
                            )
                        }
                    )
                }
            }
        }
    }


}