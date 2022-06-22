package com.example.appempleos.model;

import java.util.Date;

public class Vacante {
    private int id;
    private String vacante;
    private String empresa;
    private String descripcionVacante;
    private Date fechaVacante;
    private double salario;
    private Integer destacado;

    public Vacante(int id, String vacante, String empresa, String descripcionVacante, Date fechaVacante, double salario, Integer destacado) {
        this.id = id;
        this.vacante = vacante;
        this.empresa = empresa;
        this.descripcionVacante = descripcionVacante;
        this.fechaVacante = fechaVacante;
        this.salario = salario;
        this.destacado = destacado;
    }

    public Integer getDestacado() {
        return destacado;
    }

    public void setDestacado(Integer destacado) {
        this.destacado = destacado;
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

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
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
