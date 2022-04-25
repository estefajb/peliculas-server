package es.estefajb.peliculas.services;

import java.util.List;

import es.estefajb.peliculas.entities.Pelicula;


public interface IPeliculasService {
	public List<Pelicula> findAll();
}
