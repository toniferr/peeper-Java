package com.toniferr.peeperJava.jdk8.interfaces.defaultmethod.uno;

public class Implementacion1 implements Interfaz {

	/**
	 * Metodo abstract sin implem. en interfaz. Obligado override
	 **/
	@Override
	public void metodo() {
		System.out.println("Implementacion1:metodo");
	}
}
