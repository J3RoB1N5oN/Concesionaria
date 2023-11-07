package com.mycompany.concesionariadeautos.persistencia;

import com.mycompany.concesionariadeautos.Vehiculo;

public class ControladoraPersistencia {

    VehiculoJpaController vehiJpa = new VehiculoJpaController();
    
    public void agregarVehiculo(Vehiculo vehi) {
        vehiJpa.create(vehi);
    }
    
}
