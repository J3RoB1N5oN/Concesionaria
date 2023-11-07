package com.mycompany.concesionariadeautos;

import com.mycompany.concesionariadeautos.persistencia.ControladoraPersistencia;

public class Controladora {

    ControladoraPersistencia controlPersis = new ControladoraPersistencia();
    
    public void agregarVehiculo(String marca, String modelo, String patente, String anioFabricacion, double precio) {
        
        Vehiculo vehi = new Vehiculo();
        vehi.setMarca(marca);
        vehi.setModelo(modelo);
        vehi.setPatente(patente);
        vehi.setAnioFabricacion(anioFabricacion);
        vehi.setPrecio(precio);
        
        controlPersis.agregarVehiculo(vehi);
    }
    
}
