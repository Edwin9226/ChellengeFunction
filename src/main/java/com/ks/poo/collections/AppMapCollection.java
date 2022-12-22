package com.ks.poo.collections;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;

public class AppMapCollection {
	  public static void main(String[] args) {
			Estado estado1;
			
			//map
			LinkedHashMap<Integer, Estado> estados = new LinkedHashMap<>();
			//hashset
			LinkedHashSet<Estado> listaEstadosHashSet= new LinkedHashSet<>();
			estado1 = new Estado(1, "Espania", 343434343);
			listaEstadosHashSet.add(estado1);
			estado1 = new Estado(2, "Portugal", 453333333);
			listaEstadosHashSet.add(estado1);
			estado1 = new Estado(3, "Francia", 543333333);
			listaEstadosHashSet.add(estado1);
			estado1 = new Estado(4, "Italia", 99944343);
			listaEstadosHashSet.add(estado1);
			estado1 = new Estado(5, "Alemania", 88434343);
			listaEstadosHashSet.add(estado1);
			estado1 = new Estado(6, "Holanda", 6664343);
			listaEstadosHashSet.add(estado1);
			
			//for
			System.out.println("-------------------recorrido for: ");
			Estado estado2;
			for (int i=0;i<estados.size();i++) {
				estado2 =estados.get(i);
				System.out.println("id: " + estado2.getId());
				System.out.println("nombre: " + estado2.getNombre());
				System.out.println("habitantes: " + estado2.getDimension());
			}
				
			
			//foreach
			 for (Estado element : listaEstadosHashSet) {
				 
		            // Print the elements of LinkedHashSet created above
		            System.out.println("Element is Nombre " + element.getNombre());
		            System.out.println("Element is Habitantes" + element.getDimension());
		            System.out.println("Element is ID " + element.getId());
		    }
			//iterator
				System.out.println("-------------------recorrido iterator: ");
				Estado estado4;
				Iterator<Estado> iteratorEstado = listaEstadosHashSet.iterator();
				while(iteratorEstado.hasNext()) {
					estado4=iteratorEstado.next();
					System.out.println("id: " + estado4.getId());
					System.out.println("nombre: " + estado4.getNombre());
					System.out.println("habitantes: " + estado4.getDimension());
				}
				
				//enumerator
				System.out.println("-------------------recorrido enumeration: ");
				Estado estado5;
				Enumeration<Estado> enumeratorEstado = java.util.Collections.enumeration(listaEstadosHashSet);
				while(enumeratorEstado.hasMoreElements()) {
					estado5=enumeratorEstado.nextElement();
					System.out.println("id: " + estado5.getId());
					System.out.println("nombre: " + estado5.getNombre());
					System.out.println("habitantes: " + estado5.getDimension());
				}
		  
				//object
				System.out.println("-------------------recorrido OBJECT array: ");
				//convertir estados en array y agregarlos al objeto array
				Object[] arrayEstado = listaEstadosHashSet.toArray();
				for(int i=0; i <arrayEstado.length; i++) {
					System.out.println("id: " + ((Estado)arrayEstado[i]).getId());
					System.out.println("nombre: " + ((Estado)arrayEstado[i]).getNombre());
					System.out.println("habitantes: " + ((Estado)arrayEstado[i]).getDimension());
				}
				


	  }

}
