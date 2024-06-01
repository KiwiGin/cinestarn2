package pe.edu.embe_cinestar.cinestarn.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import pe.edu.embe_cinestar.cinestarn.models.CineTarifas;

@Repository
public interface ICineTarifa extends JpaRepository<CineTarifas, String> {
    @Query(value = "{call sp_getCineTarifas(:id)}", nativeQuery = true )
	List<CineTarifas> getCineTarifas(@Param("id") int idCine);
}
