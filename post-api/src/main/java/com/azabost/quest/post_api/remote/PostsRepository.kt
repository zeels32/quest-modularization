package com.azabost.quest.post_api.remote

import com.azabost.quest.post_api.model.Post

interface PostsRepository {
    suspend fun getPosts(): List<Post>
    suspend fun getPost(id: Int): Post?
}