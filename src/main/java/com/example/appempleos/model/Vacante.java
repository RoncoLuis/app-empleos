package com.example.appempleos.model;

import java.util.Date;

public class Vacante {
    private int idVacante;
    private String nombreVacante; //titulo o nombre del puesto vacante
    private String descripcion;
    private String categoria;
    private String estatus;
    private Date fechaPublicacion;
    private Integer vacanteDestacada;
    private double salario;
    //TODO: AGREGAR atributo imagen
    //private String imagen
    private String detallesVacante;

    public Vacante() {
    }

    public Vacante(String nombreVacante, String descripcion, String categoria, String estatus, Date fechaPublicacion, Integer vacanteDestacada, double salario, String detallesVacante) {
        this.nombreVacante = nombreVacante;
        this.descripcion = descripcion;
        this.categoria = categoria;
        this.estatus = estatus;
        this.fechaPublicacion = fechaPublicacion;
        this.vacanteDestacada = vacanteDestacada;
        this.salario = salario;
        this.detallesVacante = detallesVacante;
    }

    public int getIdVacante() {
        return idVacante;
    }

    public void setIdVacante(int idVacante) {
        this.idVacante = idVacante;
    }

    public String getNombreVacante() {
        return nombreVacante;
    }

    public void setNombreVacante(String nombreVacante) {
        this.nombreVacante = nombreVacante;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getEstatus() {
        return estatus;
    }

    public void setEstatus(String estatus) {
        this.estatus = estatus;
    }

    public Date getFechaPublicacion() {
        return fechaPublicacion;
    }

    public void setFechaPublicacion(Date fechaPublicacion) {
        this.fechaPublicacion = fechaPublicacion;
    }

    public Integer getVacanteDestacada() {
        return vacanteDestacada;
    }

    public void setVacanteDestacada(Integer vacanteDestacada) {
        this.vacanteDestacada = vacanteDestacada;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getDetallesVacante() {
        return detallesVacante;
    }

    public void setDetallesVacante(String detallesVacante) {
        this.detallesVacante = detallesVacante;
    }
}
