package com.toniferr.peeperJava.jdk15.sealed;

import java.util.Arrays;

public class Principal {

	public static void main(String[] args) {

		System.out.println("Está sellado?: " + Shape.class.isSealed());
		System.out.println("------------------");
		System.out.println("Sublases permitidas?: " + Arrays.toString(Shape.class.getPermittedSubclasses()));
		System.out.println("------------------");
		Class<?>[] lista= Shape.class.getPermittedSubclasses();
		for (int i = 0; i < lista.length; i++) {
			System.out.println(lista[i]);
		}
		System.out.println("------------------");
		System.out.println("Circle sellado?: " + Circle.class.isSealed());
		System.out.println("------------------");
		System.out.println("Circle oculto?: " + Circle.class.isHidden());
	}

}
