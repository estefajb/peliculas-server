package es.estefajb.peliculas.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import es.estefajb.peliculas.entities.Pelicula;
import es.estefajb.peliculas.repositories.IPeliculas;


@Service
public class PeliculaServicelmpl implements IPeliculasService{
	
	@Autowired
	IPeliculas peliculas;

	@Override
	public List<Pelicula> findAll() {
	List<Pelicula>	peliculas =  pelicula();
		return peliculas;
	}

	private List<Pelicula> pelicula() {
		// TODO Auto-generated method stub
		return null;
	}

}
