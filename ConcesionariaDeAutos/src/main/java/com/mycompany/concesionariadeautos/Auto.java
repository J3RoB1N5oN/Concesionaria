package com.mycompany.concesionariadeautos;

public class Auto extends Vehiculo{
    private int cantidadPuertas;
    private int cantidadAsientos;
    private String motor;
    private int kilometraje;
    private String rodadoNeumatico;
    

    public Auto() {
    }

    public Auto(int cantidadPuertas, int cantidadAsientos, String potenciaMotor, int idVehiculo, String marca, String modelo, String patente, String anioFabricacion, double precio, String motor, int kilometraje, String rodadoNeumatico) {
        super(idVehiculo, marca, modelo, patente, anioFabricacion, precio);
        this.cantidadPuertas = cantidadPuertas;
        this.cantidadAsientos = cantidadAsientos;
        this.motor = motor;
        this.kilometraje = kilometraje;
        this.rodadoNeumatico = rodadoNeumatico;
    }

    public int getCantidadPuertas() {
        return cantidadPuertas;
    }

    public void setCantidadPuertas(int cantidadPuertas) {
        this.cantidadPuertas = cantidadPuertas;
    }

    public int getCantidadAsientos() {
        return cantidadAsientos;
    }

    public void setCantidadAsientos(int cantidadAsientos) {
        this.cantidadAsientos = cantidadAsientos;
    }

    public String getMotor() {
        return motor;
    }

    public void setMotor(String motor) {
        this.motor = motor;
    }

    public int getKilometraje() {
        return kilometraje;
    }

    public void setKilometraje(int kilometraje) {
        this.kilometraje = kilometraje;
    }

    public String getRodadoNeumatico() {
        return rodadoNeumatico;
    }

    public void setRodadoNeumatico(String rodadoNeumatico) {
        this.rodadoNeumatico = rodadoNeumatico;
    }
    
}
