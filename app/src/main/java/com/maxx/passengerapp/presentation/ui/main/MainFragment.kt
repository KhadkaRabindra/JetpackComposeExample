package com.maxx.passengerapp.presentation.ui.main

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.material.rememberScaffoldState
import androidx.compose.ui.platform.ComposeView
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.lifecycle.lifecycleScope
import androidx.navigation.findNavController
import com.codingwithmitch.mvvmrecipeapp.presentation.theme.AppTheme
import com.maxx.passengerapp.MyApplication
import com.maxx.passengerapp.presentation.components.PassengerList
import com.maxx.passengerapp.presentation.components.util.SnackbarController
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
                    PassengerList(
                        loading = loading,
                        passengers = passengers,
                        onChangeScrollPosition = viewModel::onChangeRecipeScrollPosition,
                        page = page,
                        onTriggerNextPage = {viewModel.onTriggerEvent(PassengerListEvent.NextPageEvent)},
                        navController = findNavController(),
                        scaffoldState = scaffoldState,
                        snackbarController = snackbarController,
                    )
                }
            }
        }
    }


}