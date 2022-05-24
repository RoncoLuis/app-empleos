package com.example.appempleos.model;

import java.util.Date;

public class Vacante {
    private int id;
    private String vacante;
    private String descripcionVacante;
    private Date fechaVacante;
    private double salario;

    public Vacante(int id, String vacante, String descripcionVacante, Date fechaVacante, double salario) {
        this.id = id;
        this.vacante = vacante;
        this.descripcionVacante = descripcionVacante;
        this.fechaVacante = fechaVacante;
        this.salario = salario;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getVacante() {
        return vacante;
    }

    public void setVacante(String vacante) {
        this.vacante = vacante;
    }

    public String getDescripcionVacante() {
        return descripcionVacante;
    }

    public void setDescripcionVacante(String descripcionVacante) {
        this.descripcionVacante = descripcionVacante;
    }

    public Date getFechaVacante() {
        return fechaVacante;
    }

    public void setFechaVacante(Date fechaVacante) {
        this.fechaVacante = fechaVacante;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Vacante{" +
                "id=" + id +
                ", vacante='" + vacante + '\'' +
                ", descripcionVacante='" + descripcionVacante + '\'' +
                ", fechaVacante=" + fechaVacante +
                ", salario=" + salario +
                '}';
    }
}
