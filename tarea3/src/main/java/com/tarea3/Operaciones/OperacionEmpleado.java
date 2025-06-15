package com.tarea3.Operaciones;

import java.util.ArrayList;
import java.util.List;

import com.tarea3.Modelos.Empleado;

public class OperacionEmpleado implements IOperacionEmpleado {

    private List<Empleado> empleados = new ArrayList<>();

    @Override
    public void agregarEmpleado(Empleado e) {
        empleados.add(e);
    }

    @Override
    public List<Empleado> listarEmpleados() {
        return empleados;
    }

    @Override
    public Empleado buscarPorDocumento(String documento) {
        for (Empleado e : empleados) {
            if (e.getDocumento().equals(documento)) {
                return e;
            }
        }
        return null;
    }

    @Override
    public double calcularSueldo(String documento) {
        Empleado e = buscarPorDocumento(documento);
        if (e != null) {
            return e.getValorHora() * e.getNumeroHorasTrabajadas();
        }
        return 0;
    }

    @Override
    public List<Empleado> listarPorEmpresa(String nit) {
        List<Empleado> resultado = new ArrayList<>();
        for (Empleado e : empleados) {
            if (e.getEmpresa() != null && e.getEmpresa().getNit().equals(nit)) {
                resultado.add(e);
            }
        }
        return resultado;
    }

    @Override
    public int contarPorEmpresa(String nit) {
        return listarPorEmpresa(nit).size();
    }
}
