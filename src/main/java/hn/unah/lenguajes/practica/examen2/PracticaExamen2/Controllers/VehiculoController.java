package hn.unah.lenguajes.practica.examen2.PracticaExamen2.Controllers;

import org.springframework.web.bind.annotation.RestController;

import hn.unah.lenguajes.practica.examen2.PracticaExamen2.Entities.Vehiculos;
import hn.unah.lenguajes.practica.examen2.PracticaExamen2.Services.Impl.VehiculoServiceImpl;

import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


@RestController
@RequestMapping("/api/vehiculos")
public class VehiculoController {

    @Autowired
    private VehiculoServiceImpl vehiculoServiceImpl;
    
    @PostMapping("/crearVehiculo")
    public Vehiculos crearVehiculo(@RequestBody Vehiculos vehiculo) {
        return this.vehiculoServiceImpl.crearVehiculo(vehiculo);
    }
    
    @GetMapping("/obtenerVehiculos")
    public List<Vehiculos> obtenerVehiculos() {
        return this.vehiculoServiceImpl.obtenerVehiculos();
    }

    @GetMapping("/obtenerVehiculoPorId/{id}")
    public Vehiculos obtenerVehiculoPorId(@PathVariable int id) {
        return this.vehiculoServiceImpl.obtenerVehiculoPorId(id);
    }
    
    
}
