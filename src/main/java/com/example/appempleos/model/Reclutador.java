package com.example.appempleos.model;

public class Reclutador {
    private String nombre;
    private String apellido;
    private char genero;
    private String especialidad;
    private boolean reclutando;

    public Reclutador(String nombre, String apellido, char genero, String especialidad, boolean reclutando) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.genero = genero;
        this.especialidad = especialidad;
        this.reclutando = reclutando;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public char getGenero() {
        return genero;
    }

    public void setGenero(char genero) {
        this.genero = genero;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public boolean isReclutando() {
        return reclutando;
    }

    public void setReclutando(boolean reclutando) {
        this.reclutando = reclutando;
    }

    @Override
    public String toString() {
        return "Reclutador{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", genero=" + genero +
                ", especialidad='" + especialidad + '\'' +
                ", reclutando=" + reclutando +
                '}';
    }
}
