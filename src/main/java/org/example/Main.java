package org.example;

import org.example.Clases.Cliente;
import org.example.Clases.Empleado;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);
        //crear objeto de la clase cliente
        Cliente cliente=new Cliente();

        System.out.println("Digite su nombre:");
        cliente.setNombre(read.next());
        System.out.println(cliente.getNombre());

        System.out.println("Digite su edad:");
        cliente.setEdad(read.nextInt());
        System.out.println(cliente.getEdad());


    }
}
