package com.maxx.passengerapp.presentation.ui.detail

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.ui.platform.ComposeView
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.lifecycle.lifecycleScope
import com.maxx.passengerapp.MyApplication
import com.maxx.passengerapp.presentation.components.util.SnackbarController
import com.maxx.passengerapp.presentation.ui.main.MainFragmentViewModel
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
            //viewModel.onTriggerEvent(GetRecipeEvent(recipeId))
        }
    }

    @ExperimentalMaterialApi
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return ComposeView(requireContext()).apply {
            setContent {
            }
        }
    }
}