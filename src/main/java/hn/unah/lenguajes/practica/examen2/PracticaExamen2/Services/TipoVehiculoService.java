package hn.unah.lenguajes.practica.examen2.PracticaExamen2.Services;

import hn.unah.lenguajes.practica.examen2.PracticaExamen2.Entities.TipoVehiculo;

public interface TipoVehiculoService {

    public TipoVehiculo crearTipoVehiculo(TipoVehiculo tipoVehiculo);

    public String eliminarTipoVehiculo(int id);
}
