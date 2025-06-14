package com.tarea3.Modelos;

import com.Enum.Area_enum;
import com.Enum.TipoDocumento;

public class GestorProyectos extends Empleado {
    private Area_enum area;

    public GestorProyectos() {

    }

    public GestorProyectos(TipoDocumento tipoDocumento, String documento, String nombre, float valorHora,
            int numeroHorasTrabajadas, Area_enum area) {
        super(tipoDocumento, documento, nombre, valorHora, numeroHorasTrabajadas);
        this.area = area;
    }

    public Area_enum getArea() {
        return area;
    }

    public void setArea(Area_enum area) {
        this.area = area;
    }

    @Override
    public double salarioBruto() {
        return getValorHora() * getNumeroHorasTrabajadas();
    }

    @Override
    public double bonificacionLabor() {
        return salarioBruto() * 0.15;
    }

}
