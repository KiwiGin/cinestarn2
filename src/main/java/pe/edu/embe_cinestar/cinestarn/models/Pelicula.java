package pe.edu.embe_cinestar.cinestarn.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Pelicula {
    @Id
    private int id;
    private String Titulo;
    private String FechaEstrenoss;
    private String Director;
    private String Geneross;
    private int idClasificacion;
    private int idEstado;
    private int Duracion;
    private String Reparto;
    private String Sinopsis;
    private String Link;
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getTitulo() {
        return Titulo;
    }
    public void setTitulo(String titulo) {
        Titulo = titulo;
    }
    public String getSinopsis() {
        return Sinopsis;
    }
    public void setSinopsis(String sinopsis) {
        Sinopsis = sinopsis;
    }
    public String getLink() {
        return Link;
    }
    public void setLink(String link) {
        Link = link;
    }
    public String getFechaEstrenoss() {
        return FechaEstrenoss;
    }
    public void setFechaEstrenoss(String fechaEstrenoss) {
        FechaEstrenoss = fechaEstrenoss;
    }
    public String getDirector() {
        return Director;
    }
    public void setDirector(String director) {
        Director = director;
    }
    public String getGeneross() {
        return Geneross;
    }
    public void setGeneross(String geneross) {
        Geneross = geneross;
    }
    public int getIdClasificacion() {
        return idClasificacion;
    }
    public void setIdClasificacion(int idClasificacion) {
        this.idClasificacion = idClasificacion;
    }
    public int getIdEstado() {
        return idEstado;
    }
    public void setIdEstado(int idEstado) {
        this.idEstado = idEstado;
    }
    public int getDuracion() {
        return Duracion;
    }
    public void setDuracion(int duracion) {
        Duracion = duracion;
    }
    public String getReparto() {
        return Reparto;
    }
    public void setReparto(String reparto) {
        Reparto = reparto;
    }
    
    
}
