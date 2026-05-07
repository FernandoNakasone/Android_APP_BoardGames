package com.github.FernandoNakasone.ludoboardgames.ui.screens

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.github.FernandoNakasone.ludoboardgames.ui.components.LudoBGTopBar

@Composable
fun BoardGamesScreen(modifier: Modifier = Modifier) {

    Scaffold(
        topBar = { LudoBGTopBar(
            actions = {
                IconButton(onClick = {}){
                    Icon(Icons.Default.Search, contentDescription = "Pesquisa")
                }
                IconButton(onClick = {}){
                    Icon(Icons.Default.Notifications, contentDescription = "Notificações")
                }
            }
        )}
    ) {

        innerPadding ->


    }

}