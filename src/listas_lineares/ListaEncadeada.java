package listas_lineares;

public class ListaEncadeada {
	private Nodo inicio;
	
	public ListaEncadeada() {
		inicio = null;}

	public boolean vazia() {
		return inicio == null;
	}
	public Nodo getInicio() {
		return inicio;
	}
	
	public void inserirInicio(int dado) {
		Nodo novoNodo = new Nodo(dado);
		novoNodo.setProx(inicio);
		inicio = novoNodo;
		System.out.println(inicio);
		}
	
	
	public void mostraLista() {
		if (vazia()) {
			System.out.println("Lista vazia");
			return;
		}
		Nodo aux = inicio;
		while (aux != null) {
			System.out.println(aux.getDado() + "");
			aux = aux.getProx();
		}
		
		System.out.println("");
	}
	
//	aula 20/03 start 
	public void deletarPrimeiro() {
		if (inicio == null) return;
		inicio = inicio.getProx();
	}
	
	public void deletarUltimo() {
		if (inicio == null) return;
		
		Nodo aux = inicio;
		Nodo anterior = null;
		
		if (inicio.getProx() == null) {
			inicio = null;
			return;
		}
		while (aux.getProx() != null) {
			anterior = aux;
			aux = aux.getProx();
		}
		anterior.setProx(null);
	}
	
//	public int buscaValor(int valor) {
//		if (inicio == null) {return -1;}
//		
//	}
//	aula 20/03 end
	public void deleteComValor(int valor) {
		if (vazia()) return;
		if (inicio.getDado() == valor) {
			inicio = inicio.getProx();
			return;
		}
		Nodo aux = inicio;
		while (aux.getProx() != null) {
			if (aux.getProx().getDado() == valor) {
				aux.setProx(aux.getProx().getProx());
				return;
			}
			aux = aux.getProx();
		}}
		
	public void insertItem(int valor) {
		Nodo novoNodo = new Nodo(valor);
		Nodo aux = inicio;
		while (aux.getProx() != null) {
			aux = aux.getProx();
		}
		aux.setProx(novoNodo);
	

}}
