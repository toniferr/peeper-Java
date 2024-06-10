package com.toniferr.peeperJava.jdk13.textBlocks;

public class Pruebas {

	public static void main(String[] args) {

		System.out.println("Antes de jdk13");
		String html = "<html>\n" +
			    "   <body>\n" +
			    "      <p class=\"text\">Hello, Escapes</p>\n" +
			    "   </body>\n" +
			    "</html>\n";
		System.out.println(html);

		System.out.println("----------------------------------");

		System.out.println("Con jdk13 (preview)");
		String html2 = """
			<html>
			   <body>
			      <p class="text">Hello, Text Blocks</p>
			   </body>
			</html>""";
		System.out.println(html2);
	}
}
