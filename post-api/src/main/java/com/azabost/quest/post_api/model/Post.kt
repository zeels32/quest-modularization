package com.azabost.quest.post_api.model

data class Post(
    val id: Int,
    val userName: String,
    val title: String,
    val body: String
)