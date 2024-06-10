package com.toniferr.peeperJava.jdk16.toList;

import java.util.Arrays;
import java.util.List;

public class Pruebas {

	public static void main(String[] args) {

		List<String> numerosComoCadenas = Arrays.asList("1", "2", "3");
		List<Integer> enteros = numerosComoCadenas.stream()
				.map(Integer::parseInt)
				.toList();

		System.out.println(enteros); //[1, 2, 3]
	}

}
