package com.tarea3.Modelos;

import com.Enum.Ciudad_enum;

public class Empresa {
    private String nit;
    private String nombre;
    private String direccion;
    private Ciudad_enum ciudad;
    private String representanteLegal;
    private String registroCamaraComercio;

    public Empresa() {

    }

    public Empresa(String nit, String nombre, String direccion, Ciudad_enum ciudad, String representanteLegal,
            String registroCamaraComercio) {
        this.nit = nit;
        this.nombre = nombre;
        this.direccion = direccion;
        this.ciudad = ciudad;
        this.representanteLegal = representanteLegal;
        this.registroCamaraComercio = registroCamaraComercio;
    }

    public String getNit() {
        return nit;
    }

    public void setNit(String nit) {
        this.nit = nit;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Ciudad_enum getCiudad() {
        return ciudad;
    }

    public void setCiudad(Ciudad_enum ciudad) {
        this.ciudad = ciudad;
    }

    public String getRepresentanteLegal() {
        return representanteLegal;
    }

    public void setRepresentanteLegal(String representanteLegal) {
        this.representanteLegal = representanteLegal;
    }

    public String getRegistroCamaraComercio() {
        return registroCamaraComercio;
    }

    public void setRegistroCamaraComercio(String registroCamaraComercio) {
        this.registroCamaraComercio = registroCamaraComercio;
    }
    @Override
    public String toString() {
        return "Empresa: " + nombre + ", NIT: " + nit + ", Ciudad: " + ciudad + ", Representante Legal: " + representanteLegal + ", Registro de la Camara de comercio de " + ciudad + ": " + registroCamaraComercio;
    }
}
