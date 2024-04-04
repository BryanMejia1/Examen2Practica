package hn.unah.lenguajes.practica.examen2.PracticaExamen2.Services.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hn.unah.lenguajes.practica.examen2.PracticaExamen2.Entities.Vehiculos;
import hn.unah.lenguajes.practica.examen2.PracticaExamen2.Repositories.VehiculoRepository;
import hn.unah.lenguajes.practica.examen2.PracticaExamen2.Services.VehiculoService;

@Service
public class VehiculoServiceImpl implements VehiculoService{

    @Autowired
    private VehiculoRepository vehiculoRepository;

    @Override
    public Vehiculos crearVehiculo(Vehiculos vehiculo) {
        return this.vehiculoRepository.save(vehiculo);
    }

    @Override
    public List<Vehiculos> obtenerVehiculos() {
        return (List<Vehiculos>) this.vehiculoRepository.findAll();
    }

    @Override
    public Vehiculos obtenerVehiculoPorId(int id) {
        return this.vehiculoRepository.findById(id).get();
    }
    
}
