package pe.edu.embe_cinestar.cinestarn.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class CineTarifas {
    @Id
    private String DiasSemana;
    private String Precio;
    public String getDiasSemana() {
        return DiasSemana;
    }
    public void setDiasSemana(String diasSemana) {
        DiasSemana = diasSemana;
    }
    public String getPrecio() {
        return Precio;
    }
    public void setPrecio(String precio) {
        Precio = precio;
    }
    
}
