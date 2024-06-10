package com.toniferr.peeperJava.jdk17.pseudoaleatorios;

import java.util.Arrays;
import java.util.List;
import java.util.random.RandomGeneratorFactory;
import java.util.stream.IntStream;

public class Pruebas {

	public static void main(String[] args) {

		IntStream randomInts = RandomGeneratorFactory.of("SHA1PRNG")
				.create()
				.ints(10, 0, 100);

		System.out.println(randomInts); //[1, 2, 3]
	}
}
