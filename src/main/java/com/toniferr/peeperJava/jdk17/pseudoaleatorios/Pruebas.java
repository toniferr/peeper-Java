package com.toniferr.peeperJava.jdk17.pseudoaleatorios;

import java.util.random.RandomGenerator;
import java.util.random.RandomGeneratorFactory;

public class Pruebas {

	public static void main(String[] args) {

		System.out.println("Las clases aleatorias heredadas, como " +
						"java.util.Random, SplittableRandom y SecureRandom " +
						"ahora amplían la nueva interfaz RandomGenerator.");

		// Create a RandomGenerator instance using the PCG32 algorithm
		RandomGenerator rng = RandomGeneratorFactory.of("L32X64MixRandom").create();
		
		// Generate 10 random integers between 0 and 100 (inclusive)
		for (int i = 0; i < 10; i++) {
			int randomInt = rng.nextInt(101); // 0 to 100 inclusive
			System.out.println(randomInt);
		}
	}
}
