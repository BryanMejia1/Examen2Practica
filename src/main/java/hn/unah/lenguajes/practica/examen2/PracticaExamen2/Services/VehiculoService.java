package hn.unah.lenguajes.practica.examen2.PracticaExamen2.Services;

import hn.unah.lenguajes.practica.examen2.PracticaExamen2.Entities.Vehiculos;
import java.util.List;

public interface VehiculoService  {
    
    public Vehiculos crearVehiculo(Vehiculos vehiculo);

    public List<Vehiculos> obtenerVehiculos();

    public Vehiculos obtenerVehiculoPorId(int id);
}
