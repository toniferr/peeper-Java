package com.toniferr.peeperJava.jdk16.timeB;

import com.toniferr.peeperJava.jdk14.record.Person;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Pruebas {

	public static void main(String[] args) {

		LocalTime hora = LocalTime.parse("15:25:08.690791");
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("h B");

		System.out.println(hora.format(formatter)); //3 in the afternoon
	}

}
