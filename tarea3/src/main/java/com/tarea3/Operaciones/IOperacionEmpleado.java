package com.tarea3.Operaciones;

import java.util.List;
import com.tarea3.Modelos.Empleado;

public interface IOperacionEmpleado {
    void agregarEmpleado(Empleado e);
    List<Empleado> listarEmpleados();
    Empleado buscarPorDocumento(String documento);
    double calcularSueldo(String documento, int horas);
    List<Empleado> listarPorEmpresa(String nit);
    int contarPorEmpresa(String nit);
    
}