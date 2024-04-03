package hn.unah.lenguajes.practica.examen2.PracticaExamen2.Controllers;

import org.springframework.web.bind.annotation.RestController;

import hn.unah.lenguajes.practica.examen2.PracticaExamen2.Entities.Cliente;
import hn.unah.lenguajes.practica.examen2.PracticaExamen2.Services.Impl.ClienteServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@RestController
@RequestMapping("/api/cliente")
public class ClienteController {

    @Autowired
    private ClienteServiceImpl clienteServiceImpl;

    @PostMapping("/crearCliente")
    public Cliente crearCliente(@RequestBody Cliente cliente) {
        return this.clienteServiceImpl.crearCliente(cliente);
    }

    @GetMapping("/obtenerClientes")
    public List<Cliente> obtenerClientes() {
        return this.clienteServiceImpl.obtenerClientes();
    }

    @GetMapping("/obtenerClientePorId")
    public Cliente obtenerClientePorId(@RequestParam(name="idcliente") int id) {
        return this.clienteServiceImpl.obtenerClientePorId(id);
    }
    
}
