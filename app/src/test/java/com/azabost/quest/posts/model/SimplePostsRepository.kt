package com.azabost.quest.posts.model

import com.azabost.quest.post_api.model.Post
import com.azabost.quest.post_api.remote.PostsRepository

class SimplePostsRepository(var posts: List<Post>) : PostsRepository {
    override suspend fun getPosts(): List<Post> = posts
    override suspend fun getPost(id: Int): Post? = posts.find { it.id == id }
}