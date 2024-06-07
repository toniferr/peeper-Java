package com.toniferr.peeperJava.jdk10.collectors;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Pruebas {

	public static void main(String[] args) {


		System.out.println("Colecciones que no se pueden modificar");

		System.out.println("Stream.of(list).collect(Collectors.toUnmodifiableSet()");
		Set<Integer> setx = Stream.of(1, 2, 3).collect(Collectors.toUnmodifiableSet());
		System.out.println(setx);

		System.out.println("Stream.of(list).collect(Collectors.toUnmodifiableList()");
		List<Integer> listx = Stream.of(1, 2, 3).collect(Collectors.toUnmodifiableList());
		System.out.println(listx);

		System.out.println("Stream.of(list).collect(Collectors.toUnmodifiableMap(Function.identity(), Function.identity())");
		Map<Integer, Integer> mapx = Stream.of(1, 2, 3)
				.collect(Collectors.toUnmodifiableMap(Function.identity(), Function.identity()));
		System.out.println(mapx);

		//listx.add(4); //UnsupportedOperationException


		System.out.println("lista.copyOf(list) da un unmodificable list");
		var list = new ArrayList<String>();
		list.add("kilo");
		var copy = List.copyOf(list);
		System.out.println(copy);
		System.out.println(list == copy); // false
		//copy.add("litro");  // java.lang.UnsupportedOperationException

		list.add("34");
		System.out.println(list);
		System.out.println(copy);
	}
}
