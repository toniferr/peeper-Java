package com.toniferr.peeperJava.jdk9.streams;

import java.util.stream.Stream;

public class DropWhile {

	public static void main(String[] args) {
		System.out.println("Stream.of(list).dropWhile(operador).forEach()");
		System.out.println("Desecha mientras la lista s.length() <= 1");
		Stream.of("a", "b", "c", "de", "f").dropWhile(s -> s.length() <= 1).forEach(System.out::print);	
	}
}
