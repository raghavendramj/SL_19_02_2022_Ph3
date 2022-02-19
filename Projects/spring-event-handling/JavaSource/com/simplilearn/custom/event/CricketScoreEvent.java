package com.simplilearn.custom.event;

import org.springframework.context.ApplicationEvent;

public class CricketScoreEvent extends ApplicationEvent {

	public CricketScoreEvent(Object source) {
		super(source);
	}

	@Override
	public String toString() {
		return "My Spring CustomEvent - A wicket just fell, The Score 120/2";
	}
}
