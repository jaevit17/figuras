package com.krakedev.figuras;

public class TrianguloRectangulo extends Figura{
	//ATRIBUTOS
	private double catetoA;
	private double catetoB;
	private double hipotenusa;
	//CONSTRUCTOR----FIGURA
	public TrianguloRectangulo(String nombre,String color,double catetoA,double catetoB) {
		super(nombre,color);
		this.catetoA=catetoA;
		this.catetoB=catetoB;
		this.hipotenusa=Math.hypot(catetoA, catetoB);
		
		}
	//METODOS
	public double calcularPerimetro() {
		return catetoA+catetoB+hipotenusa;
	}
	public double calcularArea() {
		return (catetoA*catetoB)/2;
	}
}
