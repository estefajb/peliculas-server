package es.estefajb.peliculas.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import es.estefajb.peliculas.entities.Pelicula;
import es.estefajb.peliculas.repositories.IPeliculas;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
public class RestPeliculasController {
	
@Autowired
IPeliculas peliculaService;



@GetMapping(path = "/peliculas", produces = { MediaType.APPLICATION_JSON_VALUE })
List<Pelicula> getPeliculas() {
	return peliculaService.findAll();
}

}
