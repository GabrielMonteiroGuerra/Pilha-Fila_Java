package controller;

import br.edu.fateczl.GabrielGuerra.filaInt.Fila;
import br.edu.fateczl.GabrielGuerra.pilhaInt.Pilha;

public class OpController {
	
	public OpController() {
		super();
	}
	
	public void op(int[] vetor) throws Exception {
		Fila f = new Fila();
		Pilha p = new Pilha();
		for (int i : vetor) {
			if (i > 5) { 
				f.insert(i);
				p.push(i);
			} else {
				if (i < 3) {
					if (!p.isEmpty()) {
					   int pop = p.pop();
					   System.out.println(pop);
					   f.insert(pop);
					   p.push(i);
				}
					
			} else {
				if (!f.isEmpty()) {
				int remove = f.remove();
				System.out.println(remove);
				p.push(remove);
				f.insert(i);
				
			}
		}
		
	}
		
}
		
	}
	
}
