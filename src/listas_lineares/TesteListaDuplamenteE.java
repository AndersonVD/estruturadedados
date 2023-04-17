package listas_lineares;

public class TesteListaDuplamenteE {
	public static void main(String[] args) {
		ListaDuplamenteEncadeada l1 = new ListaDuplamenteEncadeada();
		l1.inserirFinal(1);
		l1.inserirFinal(2);
		l1.inserirFinal(3);
		l1.inserirInicio(0);
		
		System.out.println(l1.mostrarLista());
		
		l1.removeInicio();
		System.out.println(l1.mostrarLista());
		l1.removeComValor(2);
		System.out.println(l1.mostrarLista());
	
}
}
