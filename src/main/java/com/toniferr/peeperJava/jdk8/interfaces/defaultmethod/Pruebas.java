package com.toniferr.peeperJava.jdk8.interfaces.defaultmethod;

import com.toniferr.peeperJava.jdk8.interfaces.defaultmethod.uno.Clase1;
import com.toniferr.peeperJava.jdk8.interfaces.defaultmethod.uno.Implementacion2;
import com.toniferr.peeperJava.jdk8.interfaces.defaultmethod.uno.Interfaz;

public class Pruebas {

	public static void main(String[] args) {
		System.out.println("Metodos estaticos de clase. Puedes usar instancia o clase.");
		Clase1 c1 = new Clase1();
		c1.metodoEstatico(); //si es estatico no necesito instanciar
		Clase1.metodoEstatico(); //sin instancia

		Implementacion2 i1 = new Implementacion2();
		System.out.println("Metodos 'normales' y default: i1.metodo() i1.saludar()");
		i1.metodo();
		i1.saludar();

		System.out.println("Para las interfaces no funciona la instancia");
		// No podemos acceder a los metodos estaticos de la interfaz utilizando una
		// variable del tipo que la implementa
		//Implementacion1 i2 = new Implementacion1();
		//i1.metodoEstatico();

		System.out.println("Tenemos que utilizar la clase Interfaz para ello");
		Interfaz.metodoEstatico();

		Interfaz interfaz = null;
		// interfaz.metodoEstatico(); //No compila
		// interfaz.metodo();
		// interfaz.saludar();
	}
}
