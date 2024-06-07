package com.toniferr.peeperJava.jdk8.interfaces.lambdas;

/**Interfaces funcionales: solo tiene un motodo**/
interface InterfaceSinParametro {
	void metodo();
}
/**Interfaces funcionales: solo tiene un motodo**/
interface InterfaceDeUnParametro {
	void metodo(String param);
}
/**Interfaces funcionales: solo tiene un motodo**/
interface InterfaceDosParametros {
	void metodo(Integer p1, Integer p2);
}
/**Interfaces funcionales: solo tiene un motodo**/
interface InterfaceReturn {
	String metodo();
}

public class PruebasCustom {

	public static void main(String[] args) {

		System.out.println("==========Interfaces funcionales==========");

		System.out.println("Con clase interna anonima sin parametro sin lambda");
		InterfaceSinParametro idsp = new InterfaceSinParametro() {
			@Override
			public void metodo() {
				System.out.println("Interfaz sin parametro - clase interna anonima");
			}
		};
		idsp.metodo();

		System.out.println("Con clase interna anonima sin parametro con lambda");
		InterfaceSinParametro idsp2 = () -> System.out.println("Interfaz sin parametro - lambda");
		idsp2.metodo();

		/* ***************************************************************** */
		/* ***************************************************************** */
		/* ***************************************************************** */

		System.out.println("Con clase interna anonima un parametro sin lambda");
		InterfaceDeUnParametro idup = new InterfaceDeUnParametro() {
			@Override
			public void metodo(String param) {
				System.out.println(param);
			}
		};
		idup.metodo("Interfaz con un solo parametro - clase interna anonima");

		System.out.println("Con clase interna anonima un parametro con lambda");
		InterfaceDeUnParametro idup2 = param -> System.out.println(param);
		idup2.metodo("Interfaz con un solo parametro - lambda");

		/* ***************************************************************** */
		/* ***************************************************************** */
		/* ***************************************************************** */

		System.out.println("Con clase interna anonima dos parametros sin lambda");
		InterfaceDosParametros idp = new InterfaceDosParametros() {
			@Override
			public void metodo(Integer p1, Integer p2) {
				System.out.println(p1 * p2);
			}
		};
		idp.metodo(10, 20);

		System.out.println("Con clase interna anonima dos parametro con lambda");
		InterfaceDosParametros idp2 = (p1, p2) -> System.out.println(p1 + p2);
		idp2.metodo(10, 20);

		/* ***************************************************************** */
		/* ***************************************************************** */
		/* ***************************************************************** */

		System.out.println("Con clase interna anonima return sin lambda");
		InterfaceReturn ir = new InterfaceReturn() {
			@Override
			public String metodo() {
				return "Interfaz con return - clase interna anonima";
			}
		};
		System.out.println(ir.metodo());

		System.out.println("Con clase interna anonima return con lambda");
		InterfaceReturn ir2 = () -> "Interfaz con return - lambda";
		System.out.println(ir2.metodo());
	}
}