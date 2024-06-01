package pe.edu.embe_cinestar.cinestarn.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import pe.edu.embe_cinestar.cinestarn.models.Pelicula;


@Repository
public interface IPeli extends JpaRepository<Pelicula,Integer>{

    @Query(value = "{call sp_getPelicula(:idd)}", nativeQuery = true )
	List<Pelicula> getPeli(@Param("idd") int idd);
}