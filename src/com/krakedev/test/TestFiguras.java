package com.krakedev.test;

import com.krakedev.figuras.Cuadrado;
import com.krakedev.figuras.Figura;
import com.krakedev.figuras.Graficador;
import com.krakedev.figuras.Rectangulo;

public class TestFiguras {

	public static void main(String[] args) {
		Graficador g=new Graficador();
		Figura f1=new Figura("GEOMETRICA","multi");
		Cuadrado c=new Cuadrado("cuadrado1","rojo",3);
		Rectangulo r=new Rectangulo("rectangulo1","azul",3,2);
		System.out.println("----TO STRING-----");
		System.out.println(f1);
		System.out.println(c);
		System.out.println(r);
		System.out.println("----GRAFICADOR-----");
		g.graficar(f1);
		g.graficar(c);
		g.graficar(r);
		
	}

}
