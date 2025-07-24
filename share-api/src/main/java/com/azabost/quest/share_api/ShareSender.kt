package com.azabost.quest.share_api

interface ShareSender {
    fun share(text: String): ShareResult
}