package com.toniferr.peeperJava.jdk14.nullpointer;

public class Example1 {
	  public static void main(String[] args) {

	      Person person = new Person();
	      System.out.println(person.name.firstName);
		  System.out.println("NullPointerException: Cannot read field \"firstName\" " +
				  "because \"person.name\" is null");
	  }
	}