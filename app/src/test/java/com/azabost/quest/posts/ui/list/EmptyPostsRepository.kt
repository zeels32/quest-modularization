package com.azabost.quest.posts.ui.list

import com.azabost.quest.post_api.model.Post
import com.azabost.quest.post_api.remote.PostsRepository

class EmptyPostsRepository : PostsRepository {
    override suspend fun getPosts(): List<Post> = emptyList()
    override suspend fun getPost(id: Int): Post? = null
}