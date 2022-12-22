package com.ks.poo.collections;

public class Estado {

	private int id;
	private String nombre;
	private int dimension;
	
	
	public Estado(int id, String nombre, int dimension) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.dimension = dimension;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getDimension() {
		return dimension;
	}
	public void setDimension(int dimension) {
		this.dimension = dimension;
	}
	
	
}
