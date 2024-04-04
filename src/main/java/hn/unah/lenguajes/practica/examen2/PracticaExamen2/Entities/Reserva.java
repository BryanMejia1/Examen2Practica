package hn.unah.lenguajes.practica.examen2.PracticaExamen2.Entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

import java.time.LocalDate;

@Entity
@Table(name="reserva")
@Data
public class Reserva {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="idreserva")
    private int idReserva;

    @Column(name="idcliente")
    private int idCliente;

    @Column(name="idvehiculo")
    private int idVehiculo;

    private LocalDate fecha = LocalDate.now();

    private int dias;

    private double total;
}
