package com.simplilearn.basics;

class Message {
	public Message(String message) {
		System.out.println("Invoked the Message Constructor!");
		System.out.println(message);
	}
}

@FunctionalInterface
interface IMessage {
	Message getMessage(String message);
}

public class _04_MethodReferenceConstructor {

	public static void main(String[] args) {
		IMessage welcome = Message::new;
		welcome.getMessage("Hello, how are you?");
	}

}
