package com.tarea3.Operaciones;

import java.util.ArrayList;
import java.util.List;

import com.tarea3.Modelos.Empresa;

public class OperacionEmpresa implements IOperacionEmpresa {

    private List<Empresa> empresas = new ArrayList<>();

    @Override
    public void agregarEmpresa(Empresa e) {
        empresas.add(e);
    }

    @Override
    public List<Empresa> listarEmpresas() {
        return empresas;
    }

    @Override
    public Empresa buscarEmpresa(String nit) {
        for (Empresa e : empresas) {
            if (e.getNit().equals(nit)) {
                return e;
            }
        }
        return null;
    }

}
