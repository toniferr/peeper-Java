package com.toniferr.peeperJava.jdk8.service;

import java.util.Optional;

import com.toniferr.peeperJava.jdk8.model.*;

public class GestorPeliculasService {

	public Pelicula buscar(Integer id){
		switch(id){
			case 1 : return new Pelicula(1,"Alien");
			case 2 : return new Pelicula(2,"Die Hard");
			case 3 : return new Pelicula(3,"Bracula");
			default: return null;		
		}
	}

	public Optional<Pelicula> buscarOptional(Integer id){
		System.out.println("Si creamos un opcional con un null, tenemos un NullPointerException");
		switch(id){
			case 1 : return Optional.of(new Pelicula(1,"Alien"));
			case 2 : return Optional.of(new Pelicula(2,"Die Hard"));
			case 3 : return Optional.of(new Pelicula(3,"Bracula"));
			default: return Optional.empty();		
		}
	}
}
