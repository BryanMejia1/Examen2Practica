package hn.unah.lenguajes.practica.examen2.PracticaExamen2.Controllers;

import org.springframework.web.bind.annotation.RestController;

import hn.unah.lenguajes.practica.examen2.PracticaExamen2.Entities.TipoCliente;
import hn.unah.lenguajes.practica.examen2.PracticaExamen2.Services.Impl.TipoClienteServiceImpl;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;

@RestController
@RequestMapping("/api/tipoCliente")
public class TipoClienteController {
    
    @Autowired
    private TipoClienteServiceImpl tipoClienteServiceImpl;

    @PostMapping("/crearTipoCliente")
    public TipoCliente crearTipoCliente(@RequestParam(name="descripcion") String descripcion) {
        return this.tipoClienteServiceImpl.crearTipoCliente(descripcion);
    }
    
}
