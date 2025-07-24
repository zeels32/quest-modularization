import com.azabost.quest.time.NowProvider
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class DefaultNowProvider @Inject constructor() : NowProvider {
    override fun now(): Long = System.currentTimeMillis()
}