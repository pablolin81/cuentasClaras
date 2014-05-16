package kaduu.model;

import java.util.ArrayList;
import java.util.List;

public class Proyecto implements HasID{

	private int id;
	private String descripcion;
	private List<Gasto> gastos;
	private List<Persona> personas;
	
	
	public Proyecto(int id, String descripcion, List<Gasto> gastos,
			List<Persona> personas) {
		this.id = id;
		this.descripcion = descripcion;
		this.gastos = gastos;
		this.personas = personas;
	}

	public int getID() {
		return this.id;
	}
	
	public void setID(int id) {
		this.id = id;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public List<Gasto> getGastos() {
		return gastos;
	}

	public void setGastos(List<Gasto> gastos) {
		this.gastos = gastos;
	}

	public List<Persona> getPersonas() {
		return personas;
	}

	public void setPersonas(List<Persona> personas) {
		this.personas = personas;
	}
	
	
}
