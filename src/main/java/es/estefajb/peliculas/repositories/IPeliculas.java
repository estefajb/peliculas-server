package es.estefajb.peliculas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import es.estefajb.peliculas.entities.Pelicula;



public interface IPeliculas extends JpaRepository<Pelicula, Integer>{

}
