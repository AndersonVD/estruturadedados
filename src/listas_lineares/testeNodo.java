package listas_lineares;

public class testeNodo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Nodo nodo1 = new Nodo(5);
		Nodo nodo2 = new Nodo(6);
		Nodo nodo3 = new Nodo(8);
		
		nodo1.setProx(nodo2);
		nodo2.setProx(nodo3);
		
		int valorNodo2 = nodo1.getProx().getDado();
		
		System.out.println(valorNodo2);
		
	}

}
