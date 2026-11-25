package com.krakedev.test;

import com.krakedev.figuras.Cuadrado;
import com.krakedev.figuras.Rectangulo;

public class TestPerimetro {

	public static void main(String[] args) {
		Cuadrado c=new Cuadrado("cuadrado1","rojo",3);
		int perimetroC=c.calcularPerimetro();
		System.out.println("---CUADRADO---");
		System.out.println("Perimetro: "+perimetroC);
		
		Rectangulo r=new Rectangulo("rectangulo1","azul",3,2);
		int perimetroR=r.calcularPerimetro();
		System.out.println("---RECTANGULO---");
		System.out.println("Perimetro: "+perimetroR);
	}
}
