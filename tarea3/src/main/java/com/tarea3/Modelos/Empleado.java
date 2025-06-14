package com.tarea3.Modelos;

import com.Enum.TipoDocumento;

public abstract class Empleado {
    private TipoDocumento tipoDocumento;
    private String documento;
    private String nombre;
    private double valorHora;
    private int numeroHorasTrabajadas;
    // Establecer relación con la empresa



    public Empleado(){

    }
    
    public Empleado(TipoDocumento tipoDocumento, String documento, String nombre, float valorHora, int numeroHorasTrabajadas){
        this.tipoDocumento = tipoDocumento;
        this.documento = documento;
        this.nombre = nombre;
        this.valorHora = valorHora;
        this.numeroHorasTrabajadas = numeroHorasTrabajadas;
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
    
    public abstract double salarioBruto();
    public abstract double bonificacionLabor();


    
}
