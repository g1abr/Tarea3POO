package com.tarea3.Modelos;

import com.Enum.TipoDocumento;

public abstract class Empleado {
    private TipoDocumento tipoDocumento;
    private String documento;
    private String nombre;
    private double valorHora;
    private int numeroHorasTrabajadas;
    // Establecer relación con la empresa
    private Empresa empresa;

    public Empleado() {

    }

    public Empleado(TipoDocumento tipoDocumento, String documento, String nombre, float valorHora,
            int numeroHorasTrabajadas, Empresa empresa) {
        this.tipoDocumento = tipoDocumento;
        this.documento = documento;
        this.nombre = nombre;
        this.valorHora = valorHora;
        this.numeroHorasTrabajadas = numeroHorasTrabajadas;
        this.empresa = empresa;
    }

    public TipoDocumento getTipoDocumento() {
        return tipoDocumento;
    }

    public void setTipoDocumento(TipoDocumento tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getValorHora() {
        return valorHora;
    }

    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }

    public int getNumeroHorasTrabajadas() {
        return numeroHorasTrabajadas;
    }

    public void setNumeroHorasTrabajadas(int numeroHorasTrabajadas) {
        this.numeroHorasTrabajadas = numeroHorasTrabajadas;
    }

    public Empresa getEmpresa() {
        return empresa;
    }

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }

    @Override
    public String toString() {
        return "Empleado: " + nombre + ", Documento: " + documento + 
                ", Empresa: " +(empresa != null ? 
               empresa.getNombre() + " (NIT: " + empresa.getNit() + ")" : 
               "Sin asignar");
    }

    public abstract double salarioBruto();

    public abstract double bonificacionLabor();
}
