package hn.unah.lenguajes.practica.examen2.PracticaExamen2.Controllers;

import org.springframework.web.bind.annotation.RestController;

import hn.unah.lenguajes.practica.examen2.PracticaExamen2.Services.Impl.ReservaServiceImpl;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;

@RestController
@RequestMapping("/api/reserva")
public class ReservaController {
    
    @Autowired
    private ReservaServiceImpl reservaServiceImpl;

    @PostMapping("/crearReserva")
    public String postMethodName(@RequestParam(name="idcliente") int idCliente,
                                 @RequestParam(name="idvehiculo") int idVehiculo,
                                 @RequestParam(name="cantidaddias") int cantidadDias) {
        return this.reservaServiceImpl.crearReserva(idCliente, idVehiculo, cantidadDias);
    }
    
}
