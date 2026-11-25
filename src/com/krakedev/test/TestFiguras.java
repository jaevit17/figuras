package com.krakedev.test;

import com.krakedev.figuras.Cuadrado;
import com.krakedev.figuras.Figura;
import com.krakedev.figuras.Graficador;
import com.krakedev.figuras.Triangulo;

public class TestFiguras {

	public static void main(String[] args) {
		Figura f1=new Figura("GEOMETRICA","multi");
		Cuadrado c=new Cuadrado("cuadrado1","rojo");
		Triangulo t=new Triangulo("triangulo1","azul");
		Graficador g=new Graficador("Graficador","negro");
		System.out.println(f1);
		System.out.println(c);
		System.out.println(t);
		g.graficar(t);
	}

}
