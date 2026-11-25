package com.krakedev.figuras;

public class Rectangulo extends Figura{
	//ATRIBUTOS
	private int base;
	private int altura;
	
	
	//CONSTRUCTOR----FIGURA
	public Rectangulo(String nombre,String color) {
		super(nombre,color);
	}
	//CONSTRUCTOR
	public Rectangulo(int base,int altura) {
		this.base=base;
		this.altura=altura;
	}
	///METODO
	public int calcularPerimetro() {
		return 2*base+2*altura;
	}
}
