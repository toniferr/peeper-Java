package com.toniferr.peeperJava.jdk9.streams;

import java.util.stream.Stream;

public class TakeWhile {

	public static void main(String[] args) {
		System.out.println("Stream.of(list).takeWhile(operador).forEach()");
		System.out.println("Ejecuta mientras la lista !s.isEmpty()");
		Stream.of("a", "b", "c", "", "e").takeWhile(s -> !s.isEmpty()).forEach(System.out::print);
	}
}
