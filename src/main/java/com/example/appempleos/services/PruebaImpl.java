package com.example.appempleos.services;

import com.example.appempleos.model.Reclutador;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PruebaImpl implements IPrueba {

    @Override
    public List<Reclutador> listReclutador() {
        List<Reclutador> listaReclutador = new ArrayList<Reclutador>();
        listaReclutador.add(new Reclutador("Elisa","Cabana",'F',"Reclutador Dpto. Estadistica",true,"facebook"));
        listaReclutador.add(new Reclutador("Stephan","Mareek",'M',"Reclutador AWS",true,"amazon"));
        listaReclutador.add(new Reclutador("John","Thompson",'M',"Reclutador TI",true,"airbnb"));
        listaReclutador.add(new Reclutador("Mariana","Ortiz",'F',"Reclutador RH",false,"netflix"));
        listaReclutador.add(new Reclutador("Ivan","Tinajero",'M',"Reclutador TI",true,"google"));
        listaReclutador.add(new Reclutador("Chad","Darby",'M',"Reclutador Java",false,"java"));
        return listaReclutador;
    }
}
