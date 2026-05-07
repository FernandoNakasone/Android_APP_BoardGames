package com.github.FernandoNakasone.ludoboardgames.repository

import com.github.FernandoNakasone.ludoboardgames.model.BoardGame
import com.github.FernandoNakasone.ludoboardgames.model.GamePublisher

fun getAllBoardGames(): List<BoardGame> {
    return listOf(
        BoardGame("Azul", listOf(Asmodee)),
        BoardGame("Ticket To Ride", listOf(Asmodee)),
        BoardGame("Quem Foi?", listOf(PaperGames)),
    )
}

fun getBoardGameBy(gamePublisher: GamePublisher) : List<BoardGame> {
    return getAllBoardGames().filter { it.gamePublisher.contains(gamePublisher) }
}