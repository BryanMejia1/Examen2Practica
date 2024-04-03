package hn.unah.lenguajes.practica.examen2.PracticaExamen2.Entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="tipocliente")
@Data
public class TipoCliente {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="idtipocliente")
    private int idTipoCliente;

    private String descripcion;

    @JsonIgnore
    @OneToMany(mappedBy = "tipocliente")
    private List<Cliente> cliente;
}
