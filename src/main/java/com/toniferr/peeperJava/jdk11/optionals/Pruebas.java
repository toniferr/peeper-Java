package com.toniferr.peeperJava.jdk11.optionals;

import java.util.Optional;

public class Pruebas {

	public static void main(String[] args) {
		
		System.out.println(Optional.of("foo").orElseThrow()); // foo
		
		System.out.println(Optional.of("foo").stream().count()); // 1
		
		System.out.println(Optional.ofNullable(null).or(() -> Optional.of("fallback")).get()); // fallback
	}

}
