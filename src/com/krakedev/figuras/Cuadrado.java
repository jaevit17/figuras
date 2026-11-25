package com.krakedev.figuras;

public class Cuadrado extends Figura{
	//ATRIBUTOS
	private int lado;
	//CONSTRUCTOR----FIGURA
	public Cuadrado(String nombre,String color,int lado) {
		super(nombre,color);
		this.lado=lado;
	}
	//METODO
	public double calcularPerimetro() {
		return 4*lado;
	}
	public double calcularArea() {
		return lado*lado;
	}
}
