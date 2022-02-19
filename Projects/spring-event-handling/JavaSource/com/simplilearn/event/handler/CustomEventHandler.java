package com.simplilearn.event.handler;

import org.springframework.context.ApplicationListener;

import com.simplilearn.custom.event.CricketScoreEvent;

public class CustomEventHandler implements ApplicationListener<CricketScoreEvent> {

	public void onApplicationEvent(CricketScoreEvent event) {
		System.out.println("Received the message from the publisher...");
		System.out.println("And the message is :  " + event);
	}
}
