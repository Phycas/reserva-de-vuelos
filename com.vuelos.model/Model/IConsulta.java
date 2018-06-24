package Model;

import java.util.*;

public interface IConsulta {


    public Vuelo porHorarios(String origen, String destino);

    public Vuelo porTarifa(void origen, void destino);

    public String getInfo(void Vuelo);

}