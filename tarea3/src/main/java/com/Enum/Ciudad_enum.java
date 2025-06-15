package com.Enum;

public enum Ciudad_enum {
    BARRANQUILLA("Barranquilla"),
    CARTAGENA("Cartagena"),
    SOLEDAD("Soledad"),
    VILLAVICENCIO("Villavicencio");
    private final String nombreCiudad;

    Ciudad_enum(String nombreCiudad) {
        this.nombreCiudad = nombreCiudad;
    }

    public String getNombreCiudad() {
        return nombreCiudad;
    }

    @Override
    public String toString() {
        return nombreCiudad;
    }
}
