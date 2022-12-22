package com.ks.poo.collections;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class AppCollections {

  public static void main(String[] args) {

	  Collections collections= new Collections();
	  collections.printArrays();
	  
	  //buscar
	  int ubicacion= collections.buscar(3);
	  System.out.println("dato encontrado:"+ ubicacion);
	  
	  // lectura de arrays con diferentes metodos 
	  Estado estado1;
	  ArrayList<Estado> estados= new ArrayList<>();
	  // agregar datos a objetos estado y a la lista 
	  estado1= new Estado(1, "España", 12345);
	  estados.add(estado1);
	  estado1= new Estado(2, "Ecuador", 12345);
	  estados.add(estado1);
	  estado1= new Estado(3, "Colombia", 12345);
	  estados.add(estado1);
	  estado1= new Estado(4, "Brasil", 12345);
	  estados.add(estado1);
	  estado1= new Estado(5, "Argentina", 12345);
	  estados.add(estado1);
	  
	  // recorrido
	  
	  //for
	  //foreach
	  System.out.println("-----------------------recorrido foreach");
	  for(Estado estado3: estados) {
		  System.out.println("id"+estado3.getId());
		  System.out.println("nombres"+estado3.getNombre());
		  System.out.println("habitantes"+estado3.getDimension());
	  }
	  
	  //iterator
	  System.out.println("-----------------------recorrido iterator");
	  Estado estado4;
	  Iterator<Estado> iteratorEstado= estados.iterator();
	  while(iteratorEstado.hasNext()) {
		  estado4= iteratorEstado.next();
		  System.out.println("id"+estado4.getId());
		  System.out.println("nombres"+estado4.getNombre());
		  System.out.println("habitantes"+estado4.getDimension());
	  }
	//enumerator
	  System.out.println("-----------------------recorrido enumerator");
	  Estado estado5;
	  Enumeration<Estado> enumerationEstado= java.util.Collections.enumeration(estados);
	  while(enumerationEstado.hasMoreElements()) {
		  estado5= enumerationEstado.nextElement();
		  System.out.println("id"+estado5.getId());
		  System.out.println("nombres"+estado5.getNombre());
		  System.out.println("habitantes"+estado5.getDimension());
	  }
	//objeto
	  System.out.println("-----------------------recorrido objeto");
	 Object[] arrayEstado= estados.toArray();
	 for (int i = 0; i < arrayEstado.length; i++) {
		 System.out.println("id");
		  System.out.println("nombres");
		  System.out.println("habitantes");
	}
	  
	 
	 //lamdaList
	 lambdaList();
	 
}
  
  public static void lambdaList() {
	  var stringList = List.of("uno","dos","tres");
	  stringList.forEach(System.out::println);
  }
  
  
  public static void lambdaMap() {
	  Map<String, Integer> stringMap= Map.of("one", 1, "dos",2,"tres",3);
	  stringMap.forEach((k,v)-> System.out.println(k+"  "+v));
  }
}


