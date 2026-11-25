package com.krakedev.figuras;

public class Graficador extends Figura{

	//METODO
	public void graficar(Figura figura) {
		System.out.println("Graficando "+figura.getNombre()+" de color "+figura.getColor()+
				" con perimetro: "+figura.calcularPerimetro()+
				" con area: "+figura.calcularArea());
	}
}
