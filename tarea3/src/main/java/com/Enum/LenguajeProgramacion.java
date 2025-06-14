package com.Enum;

public enum LenguajeProgramacion {
    JAVA("Java"),
    PYTHON("Python"),
    JAVASCRIPT("Javascript"),
    CSHARP("C#"),
    KOTLIN("Kotlin"),
    RUBY("Ruby");

    private final String nombre;
    LenguajeProgramacion(String nombre){
        this.nombre = nombre;
    }
    public String getNombre(){
        return nombre;
    }
}
