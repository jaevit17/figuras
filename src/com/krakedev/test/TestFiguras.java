package com.krakedev.test;

import com.krakedev.figuras.Cuadrado;
import com.krakedev.figuras.Figura;
import com.krakedev.figuras.Graficador;
import com.krakedev.figuras.Hexagono;
import com.krakedev.figuras.Rectangulo;
import com.krakedev.figuras.Triangulo;
import com.krakedev.figuras.TrianguloRectangulo;

public class TestFiguras {

	public static void main(String[] args) {
		Graficador g=new Graficador();
		Figura c=new Cuadrado("cuadrado1","rojo",3);
		Figura r=new Rectangulo("rectangulo1","azul",3,2);
		Figura tr=new TrianguloRectangulo("trianguloRectangulo1","violeta",4,3);
		Figura hex=new Hexagono("hexagono1","naranja",6);
		Figura tEqui=new Triangulo("trianguloEquilatero","blanco",4);
		
		System.out.println("----TO STRING-----");
		System.out.println(c);
		System.out.println(r);
		System.out.println(tr);
		System.out.println(hex);
		System.out.println(tEqui);
		
		System.out.println("----GRAFICADOR-----");
		g.graficar(c);
		g.graficar(r);
		g.graficar(tr);
		g.graficar(hex);
		g.graficar(tEqui);
		
	}

}
