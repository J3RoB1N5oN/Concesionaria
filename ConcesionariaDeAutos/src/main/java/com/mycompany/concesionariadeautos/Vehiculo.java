package com.mycompany.concesionariadeautos;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Vehiculo implements Serializable {
    
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private int id;
    private String marca;
    private String modelo;
    private String patente;
    private String anioFabricacion;
    private double precio;


    public Vehiculo() {
    }

    public Vehiculo(int id, String marca, String modelo, String patente, String anioFabricacion, double precio) {
        this.id = id;
        this.marca = marca;
        this.modelo = modelo;
        this.patente = patente;
        this.anioFabricacion = anioFabricacion;
        this.precio = precio;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    public String getAnioFabricacion() {
        return anioFabricacion;
    }

    public void setAnioFabricacion(String anioFabricacion) {
        this.anioFabricacion = anioFabricacion;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    /*@Override
    public String toString() {
        return "Vehiculo{" + "id=" + id + ", marca=" + marca + ", modelo=" + modelo + ", patente=" + patente + ", anioFabricacion=" + anioFabricacion + ", precio=" + precio + '}';
    }*/
    
}
