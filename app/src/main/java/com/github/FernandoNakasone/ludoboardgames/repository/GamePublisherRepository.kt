package com.github.FernandoNakasone.ludoboardgames.repository

import com.github.FernandoNakasone.ludoboardgames.model.GamePublisher

val Asmodee = GamePublisher(name = "Asmodee")
val Devir = GamePublisher(name = "Devir")
val Calamity = GamePublisher(name = "Calamity")
val Conclave = GamePublisher(name = "Conclave")
val PaperGames = GamePublisher(name = "PaperGames")
val MeepleBR = GamePublisher(name = "Meeple BR")
val JellyMonster = GamePublisher(name = "Jelly Monster")
    val AcrossTheBoard = GamePublisher(name = "Across the Board",)
val Grok = GamePublisher(name = "Grok")
val Mosaico = GamePublisher(name = "Mosaico")
val Buro = GamePublisher(name = "Buro")
fun getAllGamesPublishers(): List<GamePublisher> {
    return listOf(
        Asmodee,
        Devir,
        Calamity,
        Conclave,
        PaperGames,
        MeepleBR,
        JellyMonster,
        AcrossTheBoard,
        Grok,
        Mosaico,
        Buro
    )
}