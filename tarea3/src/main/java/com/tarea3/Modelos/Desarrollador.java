package com.tarea3.Modelos;

import com.Enum.Experiencia;
import com.Enum.LenguajeProgramacion;
import com.Enum.TipoDocumento;

public class Desarrollador extends Empleado {
    private LenguajeProgramacion lenguajesProgramacion; 
    private Experiencia nivelExperiencia; 
    private int proyectosEntregados;
    
    public Desarrollador(){

    }
    
    public Desarrollador(TipoDocumento tipoDocumento, String documento, String nombre,
            float valorHora, int numeroHorasTrabajadas, Empresa empresa,
           LenguajeProgramacion lenguajesProgramacion, Experiencia nivelExperiencia,
            int proyectosEntregados) {
        super(tipoDocumento, documento, nombre, valorHora, numeroHorasTrabajadas, empresa); 
        this.lenguajesProgramacion = lenguajesProgramacion;
        this.nivelExperiencia = nivelExperiencia;
        this.proyectosEntregados = proyectosEntregados;
    }

    public LenguajeProgramacion getLenguajesProgramacion() {
        return lenguajesProgramacion;
    }

    public Experiencia getNivelExperiencia() {
        return nivelExperiencia;
    }

    public void setNivelExperiencia(Experiencia nivelExperiencia) {
        this.nivelExperiencia = nivelExperiencia;
    }

    public int getProyectosEntregados() {
        return proyectosEntregados;
    }

    public void setProyectosEntregados(int proyectosEntregados) {
        this.proyectosEntregados = proyectosEntregados;
    }

    @Override
    public double salarioBruto() {
        return getValorHora() * getNumeroHorasTrabajadas(); 
    }

    @Override
    public double bonificacionLabor() {
        double bonoBase = salarioBruto() * 0.08; 
        double bonoProyectos = proyectosEntregados * 100000; 
        return bonoBase + bonoProyectos;
    }
    
}
