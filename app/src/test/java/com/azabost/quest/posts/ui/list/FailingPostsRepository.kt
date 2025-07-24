package com.azabost.quest.posts.ui.list

import com.azabost.quest.post_api.model.Post
import com.azabost.quest.post_api.remote.PostsRepository

class FailingPostsRepository : PostsRepository {
    override suspend fun getPosts(): List<Post> = throw RuntimeException("Network error")
    override suspend fun getPost(id: Int): Post? = throw RuntimeException("Network error")
}