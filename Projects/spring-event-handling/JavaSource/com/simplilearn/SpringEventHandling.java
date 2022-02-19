package com.simplilearn;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.simplilearn.bean.WelcomeMessage;
import com.simplilearn.config.ApplicationConfig;
import com.simplilearn.publisher.CustomEventPublisher;

public class SpringEventHandling {

	public void builtInSpringEvents() {
		// ConfigurableApplicationContext applicationContext = new
		// AnnotationConfigApplicationContext(ApplicationConfig.class);
		// AnnotationConfigApplicationContext applicationContext = new
		// AnnotationConfigApplicationContext();
		// applicationContext.register(ApplicationConfig.class, SecondConfig.class);

		ConfigurableApplicationContext applicationContext = new AnnotationConfigApplicationContext(
				ApplicationConfig.class);

		// We can raise the start event
		applicationContext.start();

		WelcomeMessage message = applicationContext.getBean(WelcomeMessage.class);
		System.out.println("Message : " + message.getMessage());

		// We can raise the stop event
		applicationContext.stop();

		applicationContext.close();
	}

	public static void main(String[] args) {
		ConfigurableApplicationContext applicationContext = new AnnotationConfigApplicationContext(
				ApplicationConfig.class);
		
		CustomEventPublisher customEventPublisher =applicationContext.getBean(CustomEventPublisher.class);
		customEventPublisher.informScoreToUser();
		
		applicationContext.close();
	}
}
