package com.example.appempleos.services;

import com.example.appempleos.model.Categoria;

import java.util.List;

public interface ICategoriaService {
    void guardarCategoria(Categoria categoria);
    List<Categoria> buscarTodas();
    Categoria buscarPorId(int idCategoria); //TODO: cambiar por Integer si int no funciona
}
