package com.kaduu.model;

public class Gasto implements HasID {

	private int id;
	private String descripcion;
	private double valor;

	public Gasto(){}
	
	public Gasto(int id, String descripcion, double valor){
		this.id = id;
		this.descripcion = descripcion;
		this.valor = valor;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}
	
	@Override
	public String toString() {
		return "Costo: Descripcion: " + this.descripcion + " Valor: " + valor;
	}

	public int getID() {
		// TODO Auto-generated method stub
		return 0;
	}

	public void setID(int id) {
		// TODO Auto-generated method stub
		
	}

}
