package listas_lineares;

public class TesteLista {
	public static void main(String[] args) {
		ListaEncadeada listaE = new ListaEncadeada();
		Exercicio features = new Exercicio();
		// ListaCircular listaC = new ListaCircular();
		// Fila f = new Fila();
		// Pilha p = new Pilha();
		// listaC.inserirInicio(8);
		// listaC.inserirInicio(6);
		// listaC.inserirInicio(5);
		// listaC.inserirFim(4);
		// listaC.inserirFim(10);

		listaE.inserirInicio(8);
		listaE.inserirInicio(6);
		listaE.inserirInicio(5);
		listaE.insertItem(4);
		listaE.inserirInicio(8);
		listaE.mostraLista();
		System.out.println(features.ex1CountValues(listaE.getInicio(), 1));

		// System.out.println(listaC.mostrarLista());
		// System.out.println(listaC.contarNodosLista());
		// System.out.println(listaC.inserirFinal());

		// F.separarNumeros(F, F_Pares, F_Impares);
		// System.out.println("Valores IMpares");
		// while(!F_Impares.estaVazio()) {
		// System.out.println(F_Impares.remover());
		// }
		//
		// System.out.println("Valores Pares");
		// while (!F_Pares.estaVazio()) {
		// System.out.println(F_Pares.remover());
		// }

		// lista1.deleteComValor(4);
		// lista1.mostraLista();
	}

}
