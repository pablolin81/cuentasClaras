package com.kaduu.cuentasclaras.model;


public class Persona implements HasID {
	
	private int id;
	private String nombre;

	public Persona(){}
	
	public Persona(int id, String nombre){
		this.id = id;
		this.nombre = nombre;
	}
	
	@Override
	public int getID() {
		return id;
	}

	@Override
	public void setID(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return "Persona: Nombre: " + this.nombre ;
	}
}
