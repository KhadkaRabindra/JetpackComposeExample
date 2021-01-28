package com.maxx.passengerapp.presentation.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.asImageBitmap
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.unit.dp
import com.maxx.passengerapp.domain.model.Passenger
import com.maxx.passengerapp.domain.model.Recipe
import com.maxx.passengerapp.util.DEFAULT_RECIPE_IMAGE
import com.maxx.passengerapp.util.loadPicture
import kotlinx.coroutines.ExperimentalCoroutinesApi

@ExperimentalCoroutinesApi
@Composable
fun PassengerCard(
        passenger: Passenger,
        onClick: () -> Unit,
){
    Card(
        shape = MaterialTheme.shapes.small,
        modifier = Modifier
            .padding(
                bottom = 6.dp,
                top = 6.dp,
            )
            .fillMaxWidth()
            .clickable(onClick = onClick),
        elevation = 8.dp,
    ) {

        Row() {
            /*passenger.featuredImage?.let { url ->
                val image = loadPicture(url = url, defaultImage = DEFAULT_RECIPE_IMAGE).value
                image?.let { img ->
                    Image(
                            bitmap = img.asImageBitmap(),
                            modifier = Modifier
                                    .fillMaxWidth()
                                    .preferredHeight(225.dp),
                            contentScale = ContentScale.Crop,
                    )
                }
            }*/
            passenger.name?.let { title ->
                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(top=12.dp, bottom=12.dp, start = 8.dp, end=8.dp)
                ){
                    Text(
                        text = "Name $title",
                        modifier = Modifier
                            .fillMaxWidth(0.85f)
                            .wrapContentWidth(Alignment.Start)
                        ,
                        style = MaterialTheme.typography.h3
                    )
                    val trips  = passenger.trips.toString()
                    Text(
                        text = "Trips $trips",
                        modifier = Modifier
                            .fillMaxWidth()
                            .wrapContentWidth(Alignment.Start)
                            .align(Alignment.Start)
                        ,
                        style = MaterialTheme.typography.h5
                    )
                }
            }
        }
    }
}