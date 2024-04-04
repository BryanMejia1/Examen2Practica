package hn.unah.lenguajes.practica.examen2.PracticaExamen2.Repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import hn.unah.lenguajes.practica.examen2.PracticaExamen2.Entities.TipoCliente;

@Repository
public interface TipoClienteRepository extends CrudRepository<TipoCliente,Integer> {
    
}
