package com.tarea3.Operaciones;

import java.util.List;

import com.tarea3.Modelos.Empresa;

public interface IOperacionEmpresa {
    void agregarEmpresa(Empresa e);
    List<Empresa> listarEmpresas();
    Empresa buscarEmpresa(String nit);
}
