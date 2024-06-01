package pe.edu.embe_cinestar.cinestarn.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import pe.edu.embe_cinestar.cinestarn.models.PeliculaList;

@Repository
public interface IPelicula extends JpaRepository<PeliculaList,Integer>{
    

    @Query(value = "{call sp_getPeliculas(:id)}", nativeQuery = true )
	List<PeliculaList> getPelis(@Param("id") int id);
}
