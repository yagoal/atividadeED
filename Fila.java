package estrutura;

import java.util.*;

public class Fila {
		Queue <Integer> fila = new LinkedList <>();
		Queue <Integer> filaAux = new LinkedList <>();
		Stack <Integer> pilha = new Stack <>();
	public void inserir (int a) {
		fila.add(a);
	}
	
	public int remover () {
		int a = fila.remove();
		return a;
	}
	
	public boolean  verificar() {
		return fila.isEmpty();
	}
	
	public void mostrar(){
		System.out.println(fila.toString());
	}
	
	public void inverter () {
		int cont = fila.size();
		for (int i = 0; i < cont; i ++) {
			pilha.push(fila.remove());
		}	
		for (int i = 0; i < cont; i ++) {
			filaAux.add((pilha.pop()));
		}
		fila = filaAux;
	}
}
	

	

