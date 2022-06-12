package com.example.appempleos.serviceImpls;

import com.example.appempleos.model.Reclutador;
import com.example.appempleos.services.IReclutadorService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class ReclutadorServiceImpl implements IReclutadorService {
    private List<Reclutador> listaReclutador = null;
    @Override
    public List<Reclutador> listarReclutadores() {
        listaReclutador = new ArrayList<Reclutador>();
        listaReclutador.add(new Reclutador("Elisa","Cabana",'F',"Reclutador Dpto. Estadistica",true,"facebook"));
        listaReclutador.add(new Reclutador("Stephan","Mareek",'M',"Reclutador AWS",true,"amazon"));
        listaReclutador.add(new Reclutador("John","Thompson",'M',"Reclutador TI",true,"airbnb"));
        listaReclutador.add(new Reclutador("Mariana","Ortiz",'F',"Reclutador RH",false,"netflix"));
        listaReclutador.add(new Reclutador("Ivan","Tinajero",'M',"Reclutador TI",true,"google"));
        listaReclutador.add(new Reclutador("Chad","Darby",'M',"Reclutador Java",false,"java"));

        return listaReclutador;
    }
}
