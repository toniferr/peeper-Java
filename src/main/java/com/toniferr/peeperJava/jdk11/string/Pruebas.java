package com.toniferr.peeperJava.jdk11.string;

public class Pruebas {

	public static void main(String[] args) {
		
		System.out.println(" ".isBlank());                // true
		System.out.println(" Foo Bar ".strip());          // "Foo Bar" blancos aL inicio y final
		System.out.println(" Foo Bar ".stripTrailing());  // " Foo Bar" blancos al final
		System.out.println(" Foo Bar ".stripLeading());   // "Foo Bar " blancos al inicio
		System.out.println("Toc ".repeat(3));      // repite misma cadena 3 veces
		System.out.println("A\nB\nC".lines().count());    // recuenta lineas = 3
	}
}
