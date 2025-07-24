package com.azabost.quest.config.impl

import com.azabost.quest.config.BuildConfig
import com.azabost.quest.config.Config
import javax.inject.Inject

class AndroidBuildConfig @Inject constructor() : Config {
    override val isDebug: Boolean = BuildConfig.DEBUG
}