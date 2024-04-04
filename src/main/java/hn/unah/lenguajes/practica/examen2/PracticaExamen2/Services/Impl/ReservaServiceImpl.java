package hn.unah.lenguajes.practica.examen2.PracticaExamen2.Services.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hn.unah.lenguajes.practica.examen2.PracticaExamen2.Entities.Reserva;
import hn.unah.lenguajes.practica.examen2.PracticaExamen2.Entities.Vehiculos;
import hn.unah.lenguajes.practica.examen2.PracticaExamen2.Repositories.ClienteRepository;
import hn.unah.lenguajes.practica.examen2.PracticaExamen2.Repositories.ReservaRepository;
import hn.unah.lenguajes.practica.examen2.PracticaExamen2.Repositories.VehiculoRepository;
import hn.unah.lenguajes.practica.examen2.PracticaExamen2.Services.ReservaService;

@Service
public class ReservaServiceImpl implements ReservaService{

    @Autowired
    private ReservaRepository reservaRepository;

    @Autowired
    private VehiculoRepository vehiculoRepository; 

    @Autowired
    private ClienteRepository clienteRepository;

    @Override
    public String crearReserva(int idCliente, int idVehiculo, int cantidadDias) {
        if(this.clienteRepository.existsById(idCliente)){
            if (this.vehiculoRepository.existsById(idVehiculo)) {
                
                Vehiculos vehiculo = this.vehiculoRepository.findById(idVehiculo).get();
                if (vehiculo.isDisponible() == true) {
                    Reserva nvaReserva = new Reserva();

                    nvaReserva.setIdCliente(idCliente);
                    nvaReserva.setIdVehiculo(idVehiculo);
                    nvaReserva.setDias(cantidadDias);

                    double precioHora = vehiculo.getTipovehiculo().getPrecioXHora();
                    double precioDia = (precioHora*24);
                    double total = (precioDia*cantidadDias);

                    nvaReserva.setTotal(total);
                    this.reservaRepository.save(nvaReserva);

                    vehiculo.setDisponible(false);
                    this.vehiculoRepository.save(vehiculo);
                    return "Reserva creada con exito";

                } else {
                    return "El vehiculo ya se encuentra rentado";
                }

            }
            return "El vehiculo no existe";
        }
        return "El cliente no existe";
    }
    
}
