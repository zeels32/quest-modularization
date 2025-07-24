package com.azabost.quest.share_impl

import com.azabost.quest.analytics.api.AnalyticsEvent
import com.azabost.quest.analytics.impl.Analytics
import com.azabost.quest.logging.api.Logger
import com.azabost.quest.logging.api.create
import com.azabost.quest.post_api.model.Post
import com.azabost.quest.share_api.ShareResult
import com.azabost.quest.share_api.ShareSender
import javax.inject.Inject


class SharePostUseCase @Inject constructor(
    private val shareSender: ShareSender,
    private val analytics: Analytics,
    loggerFactory: Logger.Factory,
) {
    private val logger by lazy { loggerFactory.create(this::class) }

    fun execute(post: Post) {
        val text = "${post.title}\n\n${post.body}"
        val shareResult = shareSender.share(text)
        when (shareResult) {
            ShareResult.Success -> analytics.logEvent(AnalyticsEvent.POST_SHARED)
            is ShareResult.Failure -> logger.error("Failed to share post", shareResult.reason)
        }
    }
}
