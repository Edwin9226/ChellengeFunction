package com.ks.poo.collections;

import java.util.Arrays;

public class Collections {
//definir 3 arrays
	
	private int intArray[]= {1,2,3,4,5};
	private double doubleArray[]= {8.9,2.3,3.4,3.6,2.1};
	
	private int llenadoArray[];
	private int copiadoArray[];
	
	public Collections() {
		// crear objetos con dies elementos

		llenadoArray= new int[10];
		copiadoArray= new int [intArray.length];
		
		Arrays.fill(llenadoArray, 7);
	//ordenar de manera ascendente 
		Arrays.sort(doubleArray);
		System.arraycopy(intArray, 0, copiadoArray, 0, intArray.length);
	
	}
	
	// métodos para imprimir todos los arrays que acabamos de construir
	
	public void printArrays() {
		System.out.println("double array");
		for(double d: doubleArray)
			System.out.println(d);
		System.out.println();
	}
	
	//método para buscar en una array
	public int buscar(int index) {
		return Arrays.binarySearch(intArray, index);
	}
}
