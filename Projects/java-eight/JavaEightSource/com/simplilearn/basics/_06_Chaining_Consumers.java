package com.simplilearn.basics;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class _06_Chaining_Consumers {

	public static void main(String[] args) {
		List<String> names = Arrays.asList("virat", "rishabh", "jadeja");

		// 1. Convert 1st Character to Uppercase / Capitilze
		Consumer<String> capitalize = name -> {
			String capitalizedString = name.substring(0, 1).toUpperCase() + name.substring(1);
			System.out.println(capitalizedString);
		};

		// 2. Print names as it is.
		Consumer<String> printName = System.out::println;
		
		// 3. Append -> Crickter : to all the strings
		Consumer<String> appendCrickter = (name) -> System.out.println("Cricketer :- "+ name);

		//Chaining the consumers
		//consumer1.andThen(consumer2).andThen(consumer3)
		names.forEach(capitalize.andThen(printName).andThen(appendCrickter));
	}

}
