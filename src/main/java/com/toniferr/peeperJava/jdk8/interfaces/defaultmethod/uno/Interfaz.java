package com.toniferr.peeperJava.jdk8.interfaces.defaultmethod.uno;

public interface Interfaz {

	public static final int DATO = 20;
	
	public abstract void metodo();
	
	/**
	 * Metodo default
	**/
	default void saludar(){
		System.out.println("Método default");
	}
	
	/**
	 * Metodos estaticos
	 * Siempre con su implementacion
	**/
	public static void metodoEstatico(){
		System.out.println("Método estático");
	}
}