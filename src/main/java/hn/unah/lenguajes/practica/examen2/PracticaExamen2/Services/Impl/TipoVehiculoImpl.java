package hn.unah.lenguajes.practica.examen2.PracticaExamen2.Services.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hn.unah.lenguajes.practica.examen2.PracticaExamen2.Entities.TipoVehiculo;
import hn.unah.lenguajes.practica.examen2.PracticaExamen2.Repositories.TipoVehiculoRepository;
import hn.unah.lenguajes.practica.examen2.PracticaExamen2.Services.TipoVehiculoService;

@Service
public class TipoVehiculoImpl implements TipoVehiculoService {

    @Autowired
    private TipoVehiculoRepository tipoVehiculoRepository;

    @Override
    public TipoVehiculo crearTipoVehiculo(TipoVehiculo tipoVehiculo) {
        return this.tipoVehiculoRepository.save(tipoVehiculo);
    }

    @Override
    public String eliminarTipoVehiculo(int id) {
        if(this.tipoVehiculoRepository.existsById(id)){
            TipoVehiculo tipoVehiculo = this.tipoVehiculoRepository.findById(id).get();
            this.tipoVehiculoRepository.delete(tipoVehiculo);
            return "Tipo de vehiculo eliminado";
        }
        return "No existe ese tipo de vehiculo";
    }
    
}
