package com.azabost.quest.logging_impl

import com.azabost.quest.logging.api.Logger
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent


@Module
@InstallIn(SingletonComponent::class)
interface LoggingModule {
    @Binds
    fun factory(compositeLoggerFactory: CompositeLogger.Factory): Logger.Factory
}