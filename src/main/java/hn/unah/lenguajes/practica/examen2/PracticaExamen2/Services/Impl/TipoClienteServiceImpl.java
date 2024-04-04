package hn.unah.lenguajes.practica.examen2.PracticaExamen2.Services.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hn.unah.lenguajes.practica.examen2.PracticaExamen2.Entities.TipoCliente;
import hn.unah.lenguajes.practica.examen2.PracticaExamen2.Repositories.TipoClienteRepository;
import hn.unah.lenguajes.practica.examen2.PracticaExamen2.Services.TipoClienteService;

@Service
public class TipoClienteServiceImpl implements TipoClienteService {

    @Autowired
    private TipoClienteRepository tipoClienteRepository;

    @Override
    public TipoCliente crearTipoCliente(String descripcion) {
        TipoCliente tipoCliente = new TipoCliente();
        tipoCliente.setDescripcion(descripcion);
        return this.tipoClienteRepository.save(tipoCliente);
    }
    


}
