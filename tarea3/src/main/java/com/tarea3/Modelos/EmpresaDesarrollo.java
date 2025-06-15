package com.tarea3.Modelos;

import com.Enum.Ciudad_enum;

public class EmpresaDesarrollo extends Empresa {

    public EmpresaDesarrollo() {
        super();
    }
     public EmpresaDesarrollo(String nit, String nombre, String direccion, Ciudad_enum ciudad, String representanteLegal,
            String registroCamaraComercio) {
        super(nit, nombre, direccion, ciudad, representanteLegal, registroCamaraComercio);
    }
     
}
