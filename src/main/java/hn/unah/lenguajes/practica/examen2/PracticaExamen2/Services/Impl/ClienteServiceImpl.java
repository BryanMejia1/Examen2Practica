package hn.unah.lenguajes.practica.examen2.PracticaExamen2.Services.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hn.unah.lenguajes.practica.examen2.PracticaExamen2.Entities.Cliente;
import hn.unah.lenguajes.practica.examen2.PracticaExamen2.Repositories.ClienteRepository;
import hn.unah.lenguajes.practica.examen2.PracticaExamen2.Services.ClienteService;

@Service
public class ClienteServiceImpl implements ClienteService {

    @Autowired
    private ClienteRepository clienteRepository;

    @Override
    public Cliente crearCliente(Cliente cliente) {
        return this.clienteRepository.save(cliente);
    }

    @Override
    public List<Cliente> obtenerClientes() {
        return (List<Cliente>)this.clienteRepository.findAll();
    }

    @Override
    public Cliente obtenerClientePorId(int id) {
        return this.clienteRepository.findById(id).get();
    }
    
}
