package com.krakedev.figuras;

public class Figura {
	//ATRIBUTOS
	private String nombre;
	private String color;
	
	//CONSTRUCTOR
	public Figura() {
		
	}
	public Figura(String nombre,String color) {
		this.nombre=nombre;
		this.color=color;
	}
	
	//GETTERS-SETTERS
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
	//to String
	@Override
	public String toString() {
		return "Nombre: "+nombre+" Color: "+color;
	}
	
	//METODOS
	public int calcularPerimetro() {
		return 0;
	}
}
