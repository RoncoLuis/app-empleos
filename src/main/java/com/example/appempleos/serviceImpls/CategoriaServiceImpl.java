package com.example.appempleos.serviceImpls;

import com.example.appempleos.model.Categoria;
import com.example.appempleos.services.ICategoriaService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CategoriaServiceImpl implements ICategoriaService {

    private List<Categoria> listaCategorias = new ArrayList<>();
    @Override
    public void guardarCategoria(Categoria categoria) {
        listaCategorias.add(categoria);
        System.out.println("Nueva categoria guardada");
    }

    @Override
    public List<Categoria> buscarTodas() {

        return listaCategorias;
    }

    @Override
    public Categoria buscarPorId(int idCategoria) {
        for(int i=0; i < listaCategorias.size(); i++){
            if(listaCategorias.get(i).getIdCategoria() == idCategoria){
                return listaCategorias.get(i);
            }else{
                System.out.println("No se encontro tu categoria");
            }
        }
        return null;
    }
}
