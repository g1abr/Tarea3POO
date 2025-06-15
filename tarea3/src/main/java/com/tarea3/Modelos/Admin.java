package com.tarea3.Modelos;

import com.Enum.TipoDocumento;

public class Admin extends Empleado {
    private int documentosGestionados;
    private int llamadasAtendidas;

    public Admin() {
        
    }

    public Admin(TipoDocumento tipoDocumento, String documento, String nombre,
            float valorHora, int numeroHorasTrabajadas, Empresa empresa,
            int documentosGestionados, int llamadasAtendidas) {
        super(tipoDocumento, documento, nombre, valorHora, numeroHorasTrabajadas, empresa);
        this.documentosGestionados = documentosGestionados;
        this.llamadasAtendidas = llamadasAtendidas;
    }

    public int getDocumentosGestionados() {
        return documentosGestionados;
    }

    public void setDocumentosGestionados(int documentosGestionados) {
        this.documentosGestionados = documentosGestionados;
    }

    public int getLlamadasAtendidas() {
        return llamadasAtendidas;
    }

    public void setLlamadasAtendidas(int llamadasAtendidas) {
        this.llamadasAtendidas = llamadasAtendidas;
    }

    public double calcularProductividad() {
        return (documentosGestionados * 2) + llamadasAtendidas;
    }

    @Override
    public double salarioBruto() {
        return getValorHora() * getNumeroHorasTrabajadas();
    }

    @Override
    public double bonificacionLabor() {
        return calcularProductividad() > 100 ? 300000 : 150000;
    }

}
