package pe.edu.embe_cinestar.cinestarn.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class CinePeliculas {
    @Id
    private String Titulo;
    private String Horarios;
    public String getTitulo() {
        return Titulo;
    }
    public void setTitulo(String titulo) {
        Titulo = titulo;
    }
    public String getHorarios() {
        return Horarios;
    }
    public void setHorarios(String horarios) {
        Horarios = horarios;
    }
    
}
