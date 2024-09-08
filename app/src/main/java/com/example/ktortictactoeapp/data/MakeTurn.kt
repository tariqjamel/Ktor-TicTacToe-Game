package com.example.ktortictactoeapp.data

import kotlinx.serialization.Serializable

@Serializable
data class MakeTurn(
    val x: Int,
    val y: Int,
)
