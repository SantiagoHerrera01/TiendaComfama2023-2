package org.example.Clases;

public class Empleado {
   private Integer salario;
   private String Nombre;

    //constructor vacio

    public Empleado() {
    }

    //constructor lleno

    public Empleado(Integer salario, String nombre) {
        this.salario = salario;
        this.Nombre = nombre;
    }

    public Integer getSalario() {
        return salario;
    }

    public void setSalario(Integer salario) {
        if (salario<0){
            System.out.println("Tenga cuidado con el dato");
        }else {
            this.salario = salario;
        }

    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }
    //Metodos ordinarios
    //Los metodos ordinarios seran funciones que el desarrollador programa
    //para ejecutar la logica de negocio.

    public Double calcularSalario(Integer salarioBase, Integer deducciones){

        final Double descuentoSalud = 0.04;
        final Double descuentoPension = 0.04;

        double descuentoSeguridadSocial=(salarioBase*descuentoSalud*descuentoPension);
        double salario =salarioBase-deducciones-descuentoSeguridadSocial;
        return salario;
    }
}
//diferencia entre casteo y parseo
