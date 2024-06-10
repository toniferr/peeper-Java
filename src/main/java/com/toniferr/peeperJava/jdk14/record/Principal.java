package com.toniferr.peeperJava.jdk14.record;

public class Principal {

	public static void main(String[] args) {

		Person p1 = new Person(null, 1); // CORRECTO
		System.out.println(p1);

		System.out.println("Validacion hecha en el record");
		Person p2 = new Person(null, -1);
		//IllegalArgumentException: Age cannot be negative
	}

}
