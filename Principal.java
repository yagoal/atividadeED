package main;

import estrutura.Pilha;

public class Principal {
	
	public static void main (String [] args) {
		Pilha pilha = new Pilha ();
		
		pilha.empilhar (1);
		pilha.empilhar (2);
		pilha.empilhar (3);
		pilha.empilhar (4);
		pilha.mostrar();
		
		pilha.desempilhar();
		pilha.mostrar();
	}

}
