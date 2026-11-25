package com.krakedev.figuras;

public class Rectangulo extends Figura{
	//ATRIBUTOS
	private int base;
	private int altura;
	
	
	//CONSTRUCTOR----FIGURA
	public Rectangulo(String nombre,String color,int base,int altura) {
		super(nombre,color);
		this.base=base;
		this.altura=altura;
	}
	///METODO
	public int calcularPerimetro() {
		return 2*base+2*altura;
	}
	public double calcularArea() {
		return base*altura;
	}
}
