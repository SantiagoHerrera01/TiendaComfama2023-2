package org.example.Clases;

public class Empleado {
   public Integer salario;
   public String Nombre;

    //constructor vacio

    public Empleado() {
    }

    //constructor lleno

    public Empleado(Integer salario, String nombre) {
        this.salario = salario;
        this.Nombre = nombre;
    }
}
