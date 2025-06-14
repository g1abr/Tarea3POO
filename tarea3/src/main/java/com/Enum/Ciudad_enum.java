package com.Enum;

public enum Ciudad_enum {
     BOGOTA("Bogotá D.C."),
    MEDELLIN("Medellín"),
    CALI("Cali"),
    BARRANQUILLA("Barranquilla"),
    CARTAGENA("Cartagena"),
    CUCUTA("Cúcuta"),
    SOLEDAD("Soledad"),
    IBAGUE("Ibagué"),
    BUCARAMANGA("Bucaramanga"),
    SOACHA("Soacha"),
    VILLAVICENCIO("Villavicencio"),
    BELLO("Bello"),
    VALLEDUPAR("Valledupar"),
    MONTERIA("Montería"),
    PEREIRA("Pereira"),
    MANIZALES("Manizales"),
    PASTO("Pasto"),
    NEIVA("Neiva"),
    PALMIRA("Palmira"),
    ARMENIA("Armenia"),
    POPAYAN("Popayán"),
    FLORIDABLANCA("Floridablanca"),
    SINCELEJO("Sincelejo"),
    ITAGUI("Itagüí"),
    TUMACO("Tumaco"),
    ENVIGADO("Envigado"),
    DOSQUEBRADAS("Dosquebradas"),
    TULUA("Tuluá"),
    BARRANCABERMEJA("Barrancabermeja"),
    RIOHACHA("Riohacha"),
    QUIBDO("Quibdó"),
    GIRARDOT("Girardot"),
    FUSAGASUGA("Fusagasugá"),
    TUNJA("Tunja"),
    GIRON("Girón"),
    MALAMBO("Malambo"),
    MAGANGUE("Magangué"),
    MAICAO("Maicao"),
    APARTADO("Apartadó");

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
