package com.krakedev.figuras;

public class Hexagono extends Figura{
	//ATRIBUTOS
	private double lado;
	
	//CONSTRUCTOR
	public Hexagono(String nombre,String color,double lado) {
		this.lado=lado;
		super(nombre,color);
	}
	
	//METODOS
	public double calcularArea() {
		return (3*Math.sqrt(3)*lado*lado)/2;
	}
	public double calcularPerimetro() {	
		return 6*lado;
	}

}
