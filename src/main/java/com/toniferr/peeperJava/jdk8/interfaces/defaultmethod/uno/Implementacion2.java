package com.toniferr.peeperJava.jdk8.interfaces.defaultmethod.uno;

public class Implementacion2 implements Interfaz {

	/**
	 * Metodo abstract sin implem. en interfaz. Obligado override
	 **/
	@Override
	public void metodo() {
		System.out.println("Implementacion2:metodo");
	}

	/**
	 * Metodo default
	 **/
	public void saludar(){
		//Para invocar con super el codigo de un metodo default que
		//estamos sobreescribiendo debemos utilizar el nombre de la interfaz.
		Interfaz.super.saludar();
		System.out.println("Instrucción en metodo default sobreescrito");
	}
}

