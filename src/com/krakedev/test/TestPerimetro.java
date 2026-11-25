package com.krakedev.test;

import com.krakedev.figuras.Cuadrado;
import com.krakedev.figuras.Rectangulo;

public class TestPerimetro {

	public static void main(String[] args) {
		Cuadrado c=new Cuadrado(4);
		int perimetroC=c.calcularPerimetro();
		System.out.println("---CUADRADO---");
		System.out.println("Perimetro: "+perimetroC);
		
		Rectangulo r=new Rectangulo(6,3);
		int perimetroR=r.calcularPerimetro();
		System.out.println("---RECTANGULO---");
		System.out.println("Perimetro: "+perimetroR);
	}
}
