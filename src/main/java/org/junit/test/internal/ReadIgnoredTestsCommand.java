package org.junit.test.internal;

import java.util.List;

import org.junit.runner.Description;
import org.junit.test.EventCollector;

public class ReadIgnoredTestsCommand implements ReadEventsCommand<Description> {
	public String getName() {
		return "ignored test";
	}

	public List<Description> getEventsFromEventCollector(
			EventCollector eventCollector) {
		return eventCollector.getIgnoredTests();
	}
}
