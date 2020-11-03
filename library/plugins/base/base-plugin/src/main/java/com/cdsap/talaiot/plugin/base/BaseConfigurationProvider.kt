package com.cdsap.talaiot.plugin.base

import com.cdsap.talaiot.extensions.getTalaiotExtension
import com.cdsap.talaiot.logger.LogTrackerImpl
import com.cdsap.talaiot.provider.PublisherConfigurationProvider
import com.cdsap.talaiot.publisher.JsonPublisher
import com.cdsap.talaiot.publisher.OutputPublisher
import com.cdsap.talaiot.publisher.Publisher
import com.cdsap.talaiot.publisher.timeline.TimelinePublisher
import org.gradle.api.Project

class BaseConfigurationProvider(
    val project: Project
) : PublisherConfigurationProvider {
    override fun get(): List<Publisher> {
        val publishers = mutableListOf<Publisher>()
        val talaiotExtension = project.getTalaiotExtension<BaseExtension>()
        talaiotExtension.publishers?.apply {
            outputPublisher?.apply {
                publishers.add(OutputPublisher(this, LogTrackerImpl(talaiotExtension.logger)))
            }
            if (jsonPublisher) {
                publishers.add(JsonPublisher(project.gradle))
            }

            if (timelinePublisher) {
                publishers.add(TimelinePublisher(project.gradle))
            }
            publishers.addAll(customPublishers)
        }
        return publishers

    }
}
