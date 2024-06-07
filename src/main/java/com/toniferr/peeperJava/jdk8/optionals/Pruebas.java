package com.toniferr.peeperJava.jdk8.optionals;

import java.util.Optional;

import com.toniferr.peeperJava.jdk8.model.Direccion;
import com.toniferr.peeperJava.jdk8.model.Director;
import com.toniferr.peeperJava.jdk8.model.Pelicula;
import com.toniferr.peeperJava.jdk8.service.GestorPeliculasService;

public class Pruebas {

	public static void main(String[] args) {
		
		GestorPeliculasService gp = new GestorPeliculasService();
		Pelicula p1 = gp.buscar(3);
		System.out.println(p1.getTitulo());
		Pelicula p2 = gp.buscar(20000);
		//System.out.println(p2.getTitulo()); //esto daría nullpointer
		
		System.out.println("Con optional mínimo avisamos al que invoca el método de que puede recibir un null");
		Optional<Pelicula> p3 = gp.buscarOptional(3);
		if(p3.isPresent()){
			System.out.println(p3.get().getTitulo());
		}
		Optional<Pelicula> p4 = gp.buscarOptional(3);
		if(p4.isPresent()){
			System.out.println(p4.get().getDirector().get().getNombre());
		}

		//Aun teniendo un optional podemos hacerlo fallar:
		//Pelicula p4bis = gp.buscarOptional(20000).get();
		//System.out.println(p4bis.getTitulo());

		System.out.println("isPresent(): devuelve true si contiene valor (no nulo)");
		Optional<Pelicula> pOp = gp.buscarOptional(1);
		if( pOp.isPresent() ){
			Optional<Director> dOp = pOp.get().getDirector();
			if( dOp.isPresent() ){
				Optional<Direccion> dirOp = dOp.get().getDireccion();
				if(dirOp.isPresent()){
					System.out.println(dirOp.get().getCiudad());
				}
			}
		}

		System.out.println("ifPresent(): devuelve optional y ejecuta codigo si hay valor");
		pOp.ifPresent( p -> System.out.println(p.getTitulo()) );

		System.out.println("flatmap y map");
		Optional<String> ciudadOp = pOp.
			flatMap( p -> p.getDirector() ).
				flatMap( d -> d.getDireccion() ).
					map( dir -> dir.getCiudad() );
		if( ciudadOp.isPresent() ){
			System.out.println(ciudadOp.get());
		}

		System.out.println("orElse()");
		String ciudad = pOp.
			flatMap( p -> p.getDirector() ).
				flatMap( d -> d.getDireccion() ).
					map( dir -> dir.getCiudad() ).
						orElse("No hay");
		System.out.println(ciudad);

		String ciudad2 = pOp.
			flatMap( p -> p.getDirector() ).
				flatMap( d -> d.getDireccion() ).
					map( dir -> dir.getCiudad() ).
						filter( c -> c.equals("Santa Pola" )).
							orElse("No es Santa Pola");
		System.out.println(ciudad2);
	}
}
