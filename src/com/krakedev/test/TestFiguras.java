package com.krakedev.test;

import com.krakedev.figuras.Cuadrado;
import com.krakedev.figuras.Figura;
import com.krakedev.figuras.Triangulo;

public class TestFiguras {

	public static void main(String[] args) {
		Figura f1=new Figura();
		Cuadrado c=new Cuadrado();
		Triangulo t=new Triangulo();
		System.out.println(f1);
		System.out.println(c);
		System.out.println(t);
	}

}
