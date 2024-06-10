package com.toniferr.peeperJava.jdk14.nullpointer;

public class Example4 {
	  public static void main(String[] args) {

	      Person person = new Person();
	      person.name.firstName =  "Jenny";
		  System.out.println("NullPointerException: Cannot assign field \"firstName\" " +
				  "because \"person.name\" is null");
	  }
	}