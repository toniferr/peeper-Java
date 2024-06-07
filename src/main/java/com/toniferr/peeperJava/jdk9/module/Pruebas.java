package com.toniferr.peeperJava.jdk9.module;

public class Pruebas {

    // el cliente http está en forma experimental en jdk9 pero en jdk11 ya es estable
//	public static void main(String[] args) throws URISyntaxException, IOException, InterruptedException {
//		jdk.incubator.http.HttpRequest request = jdk.incubator.http.HttpRequest.newBuilder()
//				.uri(new URI("http://www.google.com")).GET().build();
//
//		jdk.incubator.http.HttpResponse<String> response = jdk.incubator.http.HttpClient.newHttpClient().send(request,
//				jdk.incubator.http.HttpResponse.BodyHandler.asString());
//
//		System.out.println(response.body());
//	}
}

//module-info.java
//-----------------
//module Ejemplo {
//		requires jdk.incubator.httpclient;
//}

