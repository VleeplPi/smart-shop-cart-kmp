package ru.vleeplpi.presentation.screen.home

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.AlertDialog
import androidx.compose.material3.BasicAlertDialog
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.input.key.Key.Companion.R
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import cafe.adriel.voyager.core.screen.Screen
import org.jetbrains.compose.resources.stringResource
import ru.vleeplpi.domain.entities.Product
import ru.vleeplpi.domain.entities.states.RequestState
import ru.vleeplpi.theme.mediumShapes
import smartshopcart.composeapp.generated.resources.Res
import smartshopcart.composeapp.generated.resources.home_title
import smartshopcart.composeapp.generated.resources.theme

class HomeScreen: Screen {
    @OptIn(ExperimentalMaterial3Api::class)
    @Composable
    override fun Content(){
        Scaffold(topBar = {
            CenterAlignedTopAppBar(
                title = {
                    Text(
                        text=stringResource(Res.string.home_title),
                        fontWeight = FontWeight.SemiBold,

                        )
                }
            )
        },
            floatingActionButton = {
                FloatingActionButton(
                    onClick = {},
                    shape = RoundedCornerShape(size= mediumShapes)
                ){
                    Icon(imageVector= Icons.Default.Add, contentDescription = "add icon")
                }
            }
        ){padding ->
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(padding)
            ){

            }
        }
    }
}
