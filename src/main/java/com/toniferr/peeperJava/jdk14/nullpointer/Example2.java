package com.toniferr.peeperJava.jdk14.nullpointer;

public class Example2 {
	  public static void main(String[] args) {

	      Person person = null;
	      System.out.println(person.name.firstName);
		  System.out.println("NullPointerException: Cannot read field \"firstName\" " +
				  "because \"person\" is null");
	  }
	}