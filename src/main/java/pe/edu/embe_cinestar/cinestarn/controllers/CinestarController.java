package pe.edu.embe_cinestar.cinestarn.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.web.servlet.WebMvcAutoConfiguration;
import org.springframework.context.annotation.Configuration;
// import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.config.annotation.CorsRegistry;

import pe.edu.embe_cinestar.cinestarn.models.Cine;
import pe.edu.embe_cinestar.cinestarn.models.CinePeliculas;
import pe.edu.embe_cinestar.cinestarn.models.CineTarifas;
import pe.edu.embe_cinestar.cinestarn.models.Pelicula;
import pe.edu.embe_cinestar.cinestarn.models.PeliculaList;
import pe.edu.embe_cinestar.cinestarn.repository.ICine;
import pe.edu.embe_cinestar.cinestarn.repository.ICinePelicula;
import pe.edu.embe_cinestar.cinestarn.repository.ICineTarifa;
import pe.edu.embe_cinestar.cinestarn.repository.IPeli;
import pe.edu.embe_cinestar.cinestarn.repository.IPelicula;
// import pe.edu.embe_cinestar.cinestarn.service.CinestarService;
// import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
@CrossOrigin
@Configuration
public class CinestarController extends WebMvcAutoConfiguration{
    // @Autowired
    // CinestarService cinestarService;
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**");
    }

    @Autowired
    ICineTarifa iCineTarifa;

    @Autowired
    ICinePelicula iCinePelicula;

    @Autowired
    IPelicula iPelicula;

    @Autowired
    IPeli iPeli;

    @Autowired
    ICine iCine;
    
    

    @GetMapping("/")
    public String index() {
        return "index";
    }
    


    @GetMapping("/cines")
	public List<Cine> getCines() {
		return (List<Cine>) iCine.getCines();
	}

    @GetMapping("/cines/{id}")
	public List<Cine> getCine(@PathVariable("id") int idCine) {
		return (List<Cine>) iCine.getCine(idCine);
	}

    @GetMapping("/cines/{id}/tarifas")
	public List<CineTarifas> getCineTarifas(@PathVariable("id") int idCine) {
		return (List<CineTarifas>) iCineTarifa.getCineTarifas(idCine);
	}

    @GetMapping("/cines/{id}/peliculas")
	public List<CinePeliculas> getCinePeliculas(@PathVariable("id") int idCine) {
		return (List<CinePeliculas>) iCinePelicula.getCinePeliculas(idCine);
	}

    @GetMapping("/peliculas/{id}")
    public List<PeliculaList> getPelis (@PathVariable("id") String peliId){
        int tipo=0;
        if("cartelera".equals(peliId)) tipo=1;
        if("estrenos".equals(peliId)) tipo=2;
        return (List<PeliculaList>) iPelicula.getPelis(tipo);
    }

    @GetMapping("/pelicula/{idd}")
    public List<Pelicula> getPeli (@PathVariable("idd") int peliId){
        return (List<Pelicula>) iPeli.getPeli(peliId);
    }
    
}
