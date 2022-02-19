package com.simplilearn.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.simplilearn.bean.WelcomeMessage;
import com.simplilearn.event.handler.CustomEventHandler;
import com.simplilearn.event.handler.MessageStartEventHandler;
import com.simplilearn.event.handler.MessageStopEventHandler;
import com.simplilearn.publisher.CustomEventPublisher;

@Configuration
public class ApplicationConfig {

	@Bean
	public WelcomeMessage createMessage() {
		return new WelcomeMessage("Welcome to the world of Spring framework Events");
	}

	@Bean
	public MessageStartEventHandler startEvent() {
		return new MessageStartEventHandler();
	}

	@Bean
	public MessageStopEventHandler stopEvent() {
		return new MessageStopEventHandler();
	}

	@Bean
	public CustomEventHandler customEventHandler() {
		return new CustomEventHandler();
	}

	@Bean
	public CustomEventPublisher customEventPublisher() {
		return new CustomEventPublisher();

	}
}
