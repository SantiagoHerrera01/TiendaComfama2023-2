package org.example.Clases;

import java.lang.reflect.Constructor;

public class Cliente {

    //Atributos(Variables que almacenan datos de la clase)
    private String nombre ;
    private int edad;
    private String numTelefono;
    private String direccion;
    private Integer comprasAlMes;
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


    //3. Metodos de encapsulados get set

    public String getNombre() {  // validar que el nombre que llega tenga minimo 4 caracteres
        return nombre;
    }

    public void setNombre(String nombre) {

        this.nombre = nombre;
    }

    public int getEdad() {

        return edad;
    }

    public void setEdad(int edad) {
if (edad>120){
    System.out.println("Un usuario no puede tener esa edad");
}else {
    this.edad = edad;
}

        this.edad = edad;
    }

    public String getNumTelefono() { //validar que tenga maximo 10 caracteres
        return numTelefono;
    }

    public void setNumTelefono(String numTelefono) {
        this.numTelefono = numTelefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Integer getComprasAlMes() {  //validar que no existan compras negativas
        return comprasAlMes;
    }

    public void setComprasAlMes(Integer comprasAlMes) { //validar que el valor de compra no sea negativo

        if (comprasAlMes<0){
            System.out.println("No se puede tener compras negativas");


        }else {
            this.comprasAlMes = comprasAlMes;
        }
    }

    //Metodos Ordinarios
}
