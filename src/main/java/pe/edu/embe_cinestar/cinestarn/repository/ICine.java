package pe.edu.embe_cinestar.cinestarn.repository;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import pe.edu.embe_cinestar.cinestarn.models.Cine;

@Repository
public interface ICine extends JpaRepository<Cine,Integer> {
  
    @Query(value = "{call sp_getCines()}", nativeQuery = true )
	List<Cine> getCines();

    @Query(value = "{call sp_getCine(:id)}", nativeQuery = true )
	List<Cine> getCine(@Param("id") int idCine);
}
