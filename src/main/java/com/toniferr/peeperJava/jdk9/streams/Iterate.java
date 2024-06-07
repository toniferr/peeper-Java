package com.toniferr.peeperJava.jdk9.streams;

import java.util.stream.Stream;

public class Iterate {

	public static void main(String[] args) {
		System.out.println("Stream.iterate(semilla, predicado, operador).forEach()");
		Stream.iterate(1, i -> i <= 100, i -> 2 * i).forEach(System.out::println);
	}
}
