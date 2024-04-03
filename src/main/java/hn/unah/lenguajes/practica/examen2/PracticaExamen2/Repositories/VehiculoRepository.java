package hn.unah.lenguajes.practica.examen2.PracticaExamen2.Repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import hn.unah.lenguajes.practica.examen2.PracticaExamen2.Entities.Vehiculos;

@Repository
public interface VehiculoRepository extends CrudRepository<Vehiculos, Integer> {
    
}
