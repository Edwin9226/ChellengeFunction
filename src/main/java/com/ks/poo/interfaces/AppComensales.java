package com.ks.poo.interfaces;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class AppComensales {

    public static void main(String[] args) {
        List<Comensal> listaComensales= Arrays.asList(new Comensal("jaime",15,2),
                new Comensal("ja",15,2),
                new Comensal("juan",15,2),
                new Comensal("Daniel",15,2)
                );

        //obtener e,l nombre de un dato de la lista

        List<Object> nombreComensales= getDataComensales(listaComensales, x->x.getNombre());

        //recorrido
        System.out.println("lista de comensales");
        for (Object n:nombreComensales
             ) {
            System.out.println("nombre"+ n);
        }
    }

    //interfaz funcional

    public static List<Object> getDataComensales
            (List<Comensal>listCom, Function<Comensal, Object> func){
        //generar uan lista para guardar datos personalizados de los comensales

        List<Object> listaDatos= new ArrayList<>();
        // iterar a traves de la lista de comensales que recibimos
        for (Comensal comensal: listCom
             ) {
            listaDatos.add(func.apply(comensal));
        }
        return  listaDatos;
    }
}
