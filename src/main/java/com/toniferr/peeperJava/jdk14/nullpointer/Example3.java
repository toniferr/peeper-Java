package com.toniferr.peeperJava.jdk14.nullpointer;

public class Example3 {
	  public static void main(String[] args) {

	      Person person = new Person();
	      System.out.println(person.getName().getFirstName());
		  System.out.println("NullPointerException: Cannot invoke \"com.toniferr.peeperJava.jdk14.nullpointer.Name.getFirstName()\" " +
				  "because the return value of \"com.toniferr.peeperJava.jdk14.nullpointer.Person.getName()\" is null");
	  }
	}