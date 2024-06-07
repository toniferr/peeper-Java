package com.toniferr.peeperJava.jdk10.inferencia;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import com.toniferr.peeperJava.jdk10.model.Usuario;

public class Inferencia1 {

	public static void main(String[] args) {

		var userChannels = new HashMap<Usuario, List<String>>();
		var list = new ArrayList<String>(); // infers ArrayList<String>
		var stream = list.stream(); // infers Stream<String>

		var channels = lookupUserChannels();
		channels.forEach(System.out::println);

		var myObject = createUser(true);
		System.out.println(myObject);
		System.out.println(myObject.getClass());

		var myObject2 = createUser(false);
		System.out.println(myObject2);
		System.out.println(myObject2.getClass());
	}

	public static List<Usuario> lookupUserChannels() {
		List<Usuario> users = new ArrayList<Usuario>();
		users.add(new Usuario("Fer", "ADMIN", LocalDate.now()));
		users.add(new Usuario("Tom", "USER", LocalDate.now()));
		return users;
	}

	public static Object createUser(boolean b) {
		if (b) {
			return "lalala";
		} else {
			return new Usuario("SILVIA","USER", LocalDate.now(ZoneId.of("Europe/Madrid")));
		}
	}

}
