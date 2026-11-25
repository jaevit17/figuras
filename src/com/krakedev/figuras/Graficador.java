package com.krakedev.figuras;

public class Graficador extends Figura{
	public Graficador(String nombre, String color) {
		super(nombre, color);
		
	}

	//METODO
	public void graficar(Figura figura) {
		System.out.println("Graficando "+figura.getNombre()+" de color "+figura.getColor());
	}
}
