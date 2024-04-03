package hn.unah.lenguajes.practica.examen2.PracticaExamen2.Services;

import hn.unah.lenguajes.practica.examen2.PracticaExamen2.Entities.Cliente;

import java.util.List;

public interface ClienteService {
    
    public Cliente crearCliente(Cliente cliente);

    public List<Cliente> obtenerClientes();

    public Cliente obtenerClientePorId(int id); 
    
}
