package com.github.FernandoNakasone.ludoboardgames.ui.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.github.FernandoNakasone.ludoboardgames.repository.getAllBoardGames
import com.github.FernandoNakasone.ludoboardgames.repository.getAllGamesPublishers
import com.github.FernandoNakasone.ludoboardgames.repository.getBoardGameBy
import com.github.FernandoNakasone.ludoboardgames.ui.components.BoardGameCardList
import com.github.FernandoNakasone.ludoboardgames.ui.components.GamePublisherCard
import com.github.FernandoNakasone.ludoboardgames.ui.components.LudoBGTopBar

@Composable
fun BoardGamesScreen(modifier: Modifier = Modifier) {

    val gamesPublisherState by remember { mutableStateOf(getAllGamesPublishers())  }
    var boardGames by remember { mutableStateOf(getAllBoardGames()) }

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

        Column(
            modifier = Modifier.fillMaxSize()
                .padding(innerPadding)
                .padding(16.dp)
        ){

            LazyRow(
                contentPadding = PaddingValues(horizontal = 16.dp),
                horizontalArrangement = Arrangement.spacedBy(16.dp)
            ) {
                items(gamesPublisherState){
                    GamePublisherCard(it) {
                        boardGames = getBoardGameBy(it)
                    }
                }
            }
            Spacer(modifier = Modifier.height(32.dp))
            LazyColumn {
                items(boardGames){
                    BoardGameCardList(it)
                }
            }

        }

    }

}