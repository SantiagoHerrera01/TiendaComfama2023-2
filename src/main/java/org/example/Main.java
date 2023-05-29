package org.example;

import org.example.Clases.Cliente;
import org.example.Clases.Empleado;

public class Main {
    public static void main(String[] args){
        //Variable Ordinaria
        int edad=5;
        System.out.println(edad);

        //Creando nuestro Primer objeto contructor vacio
        Cliente objeto=new Cliente();
        objeto.edad=18;
        System.out.println(objeto.edad);
        objeto.nombre="Santiago";
        System.out.println(objeto.nombre);

        //Creando un objeto utilizando constructor lleno
        Cliente objetoDos =new Cliente("sara", 30, "3101718980","Calle 66a #43-56",10);
        System.out.println(objetoDos.edad);
        System.out.println(objetoDos.nombre);
        System.out.println(objetoDos.direccion);

        //creando obj Empleado
        Empleado objetoTres= new Empleado();
        System.out.println(objetoTres.Nombre);
        System.out.println(objetoTres.salario);
    }
    }