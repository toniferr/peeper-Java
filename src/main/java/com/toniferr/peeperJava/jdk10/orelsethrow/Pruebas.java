package com.toniferr.peeperJava.jdk10.orelsethrow;

import java.util.Optional;

public class Pruebas {

	public static void main(String[] args) {

		final Optional<String> optional = Optional.ofNullable("Optional improvement in Java 10");
		final String string = optional.orElseThrow(); // Returns OK
		System.out.println(optional);
		System.out.println(string);


		final Optional<String> optional2 = Optional.ofNullable(null);
		//final String string2 = optional2.orElseThrow(); // Throws NoSuchElementException //SALTA EXCEPTION QUE HAY QUE CAPTURAR
		System.out.println(optional2);

	}

}
