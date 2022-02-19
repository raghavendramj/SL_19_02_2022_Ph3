package com.simplilearn.publisher;

import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;

import com.simplilearn.custom.event.CricketScoreEvent;

public class CustomEventPublisher implements ApplicationEventPublisherAware {

	private ApplicationEventPublisher publisher;

	public void setApplicationEventPublisher(ApplicationEventPublisher publisher) {
		this.publisher = publisher;
	}

	public void informScoreToUser() {
		CricketScoreEvent myCustomEvent = new CricketScoreEvent(this);
		publisher.publishEvent(myCustomEvent);
	}

}
