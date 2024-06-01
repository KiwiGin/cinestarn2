package pe.edu.embe_cinestar.cinestarn.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import pe.edu.embe_cinestar.cinestarn.models.CinePeliculas;

@Repository
public interface ICinePelicula extends JpaRepository<CinePeliculas,String>{
    @Query(value = "{call sp_getCinePeliculas(:id)}", nativeQuery = true )
	List<CinePeliculas> getCinePeliculas(@Param("id") int idCine);
}
