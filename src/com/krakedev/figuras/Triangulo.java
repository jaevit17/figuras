package com.krakedev.figuras;

public class Triangulo extends Figura{
	//ATRIBUTOS
	private double lado;
	//CONSTRUCTOR----FIGURA
	public Triangulo(String nombre,String color,double lado) {
		super(nombre,color);
		this.lado=lado;
	}

	//METODOS
	public double calcularArea() {
		return (Math.sqrt(3) * lado * lado) / 4;
	}
	public double calcularPerimetro() {
		return lado*3;
	}
}
