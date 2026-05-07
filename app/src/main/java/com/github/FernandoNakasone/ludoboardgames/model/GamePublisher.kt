package com.github.FernandoNakasone.ludoboardgames.model

import androidx.annotation.DrawableRes
import com.github.FernandoNakasone.ludoboardgames.R

data class GamePublisher(
    val name: String,
    @DrawableRes var imageRes: Int = R.drawable.ic_launcher_background
)