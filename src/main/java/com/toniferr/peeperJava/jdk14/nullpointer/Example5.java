package com.toniferr.peeperJava.jdk14.nullpointer;

public class Example5 {
	  public static void main(String[] args) {
	      String[][][] data = new String[1][1][];
	      data[0][0][0] = "jenny";
		  System.out.println("NullPointerException: Cannot store to object array " +
				  "because \"data[0][0]\" is null");
	  }
	}