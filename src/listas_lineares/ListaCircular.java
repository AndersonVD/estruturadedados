package listas_lineares;


//Implemente os seguinte métodos:
//
//1. Contar nodos da lista - LC
//2. Inserir no final - LC
//3. Deletar ùltimo - LE
//4. Deletar Primeiro - LE
//5. Buscar um valor e caso encontre retornar a posição na lista - LE e LC

public class ListaCircular {
	private Nodo inicio;
	private Nodo fim;

	public ListaCircular() {
		inicio = null;
	}
	
	public Nodo getInicio() {
		return inicio;
	}

	public Nodo getFim() {
		return fim;
	}
	
	public void inserirInicio(int dado) {
		Nodo novoNodo = new Nodo(dado);
		if (inicio == null) {
			inicio = novoNodo;
			inicio.setProx(inicio);
			fim = inicio;
		}
		else {
			novoNodo.setProx(inicio);
			inicio = novoNodo;
			fim.setProx(inicio);
		}
	}
	
	public void inserirFim(int dado) {
		Nodo novoNodo = new Nodo(dado);
		if (inicio == null) {
			inserirInicio(dado);
			return;
		}
		else {
			novoNodo.setProx(fim);
			fim = novoNodo;
			fim.setProx(inicio);
			
		}
	}
//	aula 20/03 
//	public int buscaValorCircular(int valor) {
//		if (inicio == null) return -1;
//		
//		Nodo.aux = inicio;
//		int posicao = 0;
//		do {
//			posicao++;
//			if (aux.getDado() == valor) {
//				return posicao;
//			}
//			aux = aux.getProx();
//			
//		} while (aux != inicio);
//		return -1;
//		
//	}
	
	
	public void deleteComValor(int dado) {
		if (inicio == null) return;
		if (inicio.getDado() == dado) {
			if (inicio == fim) {
				inicio = null;
				return;
			}
//			se elemento deletado for o primeiro
//			da lista, mas lista contem mais elementos
			inicio = inicio.getProx();
			fim.setProx(inicio);
			return;
		}
		Nodo aux = inicio;
		do {
			if (aux.getProx().getDado() == dado) {
				aux.setProx(aux.getProx().getProx());
				return;
			}
			aux = aux.getProx();
		} while (aux!=inicio);
		
		
	}
	
	public String mostrarLista() {
		String lista = "";
		if (inicio == null) return lista;
		Nodo aux = inicio;
		do {
			lista += aux.getDado()+"\n";
			aux = aux.getProx();
		}
		while (aux!=inicio);
		return lista;
		
	}
	
	public int contarNodosLista() {
		int resultado = 0;
		if (inicio == null) return resultado;
		Nodo aux = inicio;
		do {
			resultado++;
			aux = aux.getProx();
		}while (aux!=inicio);
		return resultado;
	}
	
	
}
