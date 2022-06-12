package com.example.appempleos.serviceImpls;

import com.example.appempleos.services.IEmpleosService;
import org.springframework.stereotype.Service;

import java.util.LinkedList;
import java.util.List;

@Service
public class EmpleoServiceImpl implements IEmpleosService {
    private List<String> listaEmpleos = null;
    @Override
    public List<String> listaEmpleos() {
        listaEmpleos = new LinkedList<String>();
        listaEmpleos.add("Ingeniero en sistemas");
        listaEmpleos.add("Veterinaria");
        listaEmpleos.add("Ingeniero industrial");
        listaEmpleos.add("Fisioterapeuta");

        return listaEmpleos;
    }
}
