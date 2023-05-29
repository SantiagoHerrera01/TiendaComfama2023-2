package org.example.Clases;

import java.lang.reflect.Constructor;

public class Cliente {

    //Atributos(Variables que almacenan datos de la clase)
    public String nombre;
    public int edad;
    public String numTelefono;
    public String direccion;
    public Integer comprasAlMes;
    //Metodos Especiales

    public Cliente() {

    }

    public Cliente(String nombre, int edad, String numTelefono, String direccion, Integer comprasAlMes) {
        this.nombre = nombre;
        this.edad = edad;
        this.numTelefono = numTelefono;
        this.direccion = direccion;
        this.comprasAlMes = comprasAlMes;
    }

    //Metodos Ordinarios
}
