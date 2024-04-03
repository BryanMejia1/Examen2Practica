package hn.unah.lenguajes.practica.examen2.PracticaExamen2.Entities;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name="vehiculo")
@Data
public class Vehiculos {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="idvehiculo")
    private int idVehiculo;

    private String marca;

    private int anio;

    private boolean disponible;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="idtipovehiculo", referencedColumnName = "idtipovehiculo")
    private TipoVehiculo tipovehiculo;
}
