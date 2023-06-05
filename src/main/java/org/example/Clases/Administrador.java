package org.example.Clases;

public class Administrador {

    private String nombres;
    private Double salario;
    private String correo;
    private boolean jornada;

    public Administrador() {
    }


    public Administrador(String nombres, Double salario, String correo, boolean jornada) {
        this.nombres = nombres;
        this.salario = salario;
        this.correo = correo;
        this.jornada = jornada;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {// MINIMO 25 LETRAS
        this.nombres = nombres;
    }

    public Double getSalario() {

        return salario;
    }

    public void setSalario(Double salario) {
        if (salario<0){
            System.out.println("Revise por favor");
        }else {
        this.salario = salario;
        }
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public boolean isJornada() {
        return jornada;
    }

    public void setJornada(boolean jornada) {
        this.jornada = jornada;
    }
}
