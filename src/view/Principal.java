package view;

import controller.OpController;

public class Principal {

	public static void main(String[] args) throws Exception {
		int[] vetor = {8,4,3,0,8,1,1,1,0};
		OpController opCont = new OpController();
			opCont.op(vetor);

	}
	
}
