package com.krakedev.figuras;

public class Cuadrado extends Figura{
	//ATRIBUTOS
	private int lado;
	//CONSTRUCTOR----FIGURA
	public Cuadrado(String nombre,String color) {
		super(nombre,color);
	}
	//CONSTRUCTOR
	public Cuadrado(int lado) {
		this.lado=lado;
	}
	//METODO
	public int calcularPerimetro() {
		return 4*lado;
	}
}
