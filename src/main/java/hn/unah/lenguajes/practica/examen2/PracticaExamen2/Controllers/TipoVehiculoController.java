package hn.unah.lenguajes.practica.examen2.PracticaExamen2.Controllers;

import org.springframework.web.bind.annotation.RestController;

import hn.unah.lenguajes.practica.examen2.PracticaExamen2.Entities.TipoVehiculo;
import hn.unah.lenguajes.practica.examen2.PracticaExamen2.Services.Impl.TipoVehiculoImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;



@RestController
@RequestMapping("/api/tipoVehiculo")
public class TipoVehiculoController {
    
    @Autowired
    private TipoVehiculoImpl tipoVehiculoImpl;

    @PostMapping("/crearTipoVehiculo")
    public TipoVehiculo crearTipoVehiculo(@RequestBody TipoVehiculo tipoVehiculo) {
        return this.tipoVehiculoImpl.crearTipoVehiculo(tipoVehiculo);
    }

    @DeleteMapping("/eliminarTipoVehiculo")
    public String eliminarTipoVehiculo(@RequestParam int id) {
        return this.tipoVehiculoImpl.eliminarTipoVehiculo(id);
    }
    
}
