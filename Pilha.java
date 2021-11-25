package estrutura;

import java.util.Stack;

public class Pilha {
	Stack <Integer> pilha = new Stack <>();
	
	
	public void empilhar (int a) {
		pilha.push (a);
	}
	
	public int desempilhar() {
		int a = pilha.pop();
		return a;
	}
	
	public int verificarTopo () {
		return pilha.firstElement();
	}
	
	public void mostrar () {
		System.out.println(pilha.toString());
	}
}
