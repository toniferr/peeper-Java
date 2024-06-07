package com.toniferr.peeperJava.jdk8.base64;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.util.Base64;

public class Pruebas {

	public static void main(String[] args) {

		// Codificando de forma decimal: cada byte son tres digitos
		// Codificando de forma hexadecimal: cada byte son dos caracteres
		// Base64: Cada tres bytes son cuatro caracteres. 1,33

		System.out.println("============Encode============");
		System.out.println("Base64.getEncoder().encodeToString(byte[])");
		String txtB64 = null;
		try {
			txtB64 = Base64.getEncoder().encodeToString("La tumba sin nombre junto a la de Stanton".getBytes("utf-8"));
			System.out.println(txtB64);
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}

		System.out.println("============Decode============");
		System.out.println("Base64.getDecoder().decode(string)");
		try {
			byte[] bytes = Base64.getDecoder().decode(txtB64);
			System.out.println(new String(bytes, "utf-8"));
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}

		System.out.println("============Encode para URL============");
		try {
			System.out.println("Base64.getEncoder().encodeToString(stringUrl.getBytes(\"utf-8\"))");
			String basicEncoded = Base64.getEncoder().encodeToString("clientes?abcd".getBytes("utf-8"));
			System.out.println("Alfabeto basico  : " + basicEncoded);


			System.out.println("Base64.getUrlEncoder().encodeToString(stringUrl.getBytes(\"utf-8\"))");
			String urlEncoded = Base64.getUrlEncoder().encodeToString("clientes?abcd".getBytes("utf-8"));
			System.out.println("Alfabeto para url: " + urlEncoded);
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}


		System.out.println("============Encode/Decode para MIME============");
		try {
			String texto = "La tumba sin nombre junto a la de Stanton";
			byte[] toEncode = texto.getBytes("utf-8");
			System.out.println("Base64.getMimeEncoder().encodeToString(byte[])");
			String mimeEncoded = Base64.getMimeEncoder().encodeToString(toEncode);
			System.out.println(mimeEncoded);

			System.out.println("Base64.getMimeDecoder().decode(byte[])");
			String texto2 = new String(Base64.getMimeDecoder().decode(mimeEncoded.getBytes()), "utf-8");
			System.out.println(texto2);
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}

		System.out.println("============Wrapping de streams============");
		String txt = "El hacendado Trelawney, el doctor Livesey y los demás caballeros me pidieron que escribiera todos los pormenores que yo conociera de la Isla del Tesoro y que lo hiciera de cabo a rabo, sin omitir otra cosa que la localización de la isla, y eso porque en ella todavía hay una parte del tesoro sin desenterrar. Así pues, cojo la pluma en este año de gracia de 1700 y pico y me remonto con la memoria al tiempo en que mi padre regentaba la posada del 'Almirante Benbow', cuando el viejo marino de piel atezada, con la cicatriz de un sable en el rostro, tomó por primera vez asiento en nuestra casa, bajo nuestro propio techo.";
		// Escribiendo
		System.out.println("Base64.getEncoder().wrap(new FileOutputStream(\"datos-base64.txt\"))");
		try (OutputStream os = Base64.getEncoder().wrap(new FileOutputStream("datos-base64.txt"))) {
			os.write(txt.getBytes("utf-8"));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		// Leyendo
		System.out.println(" Base64.getDecoder().wrap(new FileInputStream(\"datos-base64.txt\"))");
		try (InputStream is = Base64.getDecoder().wrap(new FileInputStream("datos-base64.txt"))) {
			int len;
			byte[] bytes = new byte[100];
			while ((len = is.read(bytes)) != -1) {
				System.out.print(new String(bytes, 0, len, "utf-8"));
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
