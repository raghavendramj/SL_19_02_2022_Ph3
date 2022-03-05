package com.simplilearn.streams;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class _02_CreatingStreams {
	public static void main(String[] args) {
		int numbers[] = { 1, 2, 3, 4, 5 };
		IntStream intStream = Arrays.stream(numbers);
		
		Stream<Double> doubleStream = Stream.generate(() -> Math.random());
		doubleStream.limit(10).forEach(number -> System.out.println(number));
		
		System.out.println("\n For Each doubleStream");
		//Using method refernce -> Consumer -> accept -> print
		doubleStream = Stream.generate(() -> Math.random());
		doubleStream.limit(10).forEach(System.out::print);
		
		System.out.println("\n For Each Intstream");
		Stream<Integer> intStream1 = Stream.iterate(1,  n -> n+1).limit(10);
		intStream1.forEach(System.out::print);
	}

}
