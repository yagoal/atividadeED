package main;

import estrutura.Fila;

public class Principal {
	
	public static void main (String [] args) {
		Fila fila = new Fila ();
		
		fila.inserir(1);
		fila.inserir(2);
		fila.inserir(3);
		fila.inserir(4);
		fila.mostrar();
		fila.inverter();
		fila.mostrar();
	}

}
