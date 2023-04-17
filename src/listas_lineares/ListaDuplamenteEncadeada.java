package listas_lineares;

public class ListaDuplamenteEncadeada {
	private Nodo inicio;
	private Nodo fim;
	
	public void inserirInicio(int dado) {
		Nodo novo = new Nodo (dado);
		if (inicio != null) {
			inicio.setAnt(novo);
			novo.setProx(inicio);
			
		}
		inicio = novo;
		if (fim == null) {
			fim = novo;
		}
	}
	
	public void inserirFinal(int dado) {
		Nodo novo = new Nodo(dado);
		if (fim != null) {
			fim.setProx(novo);
			novo.setAnt(fim);
		}
		fim = novo;
		if (inicio == null) {
			inicio = novo;
		}
	}
	
	
	public void removeInicio() {
		Nodo nodoRemovido = inicio;
		if (inicio == null) return;
		
		inicio = inicio.getProx();
		if (inicio != null) {
			inicio.setAnt(null);
		}
		if (nodoRemovido == fim) {
			removeFinal();
		}
		
	}
	
	
	public void removeFinal() {
		Nodo nodoRemovido = fim;
		if (fim == null) return;
		fim = fim.getAnt();
		if(fim != null) {
			fim.setProx(null);
		}
		if (nodoRemovido == inicio) {
			removeInicio();
		}
	}
	
	public void removeComValor(int dado) {
		Nodo nodoRemovido = null;
		Nodo aux = inicio;
		
		while (aux != null) {
			if (aux.getDado() ==dado) {
				nodoRemovido = aux;
				break;
			}
			aux = aux.getProx();
		}
		if (nodoRemovido == null) return;
		
		if (nodoRemovido == inicio) {
			removeInicio();
		} else if (nodoRemovido == fim) {
			removeFinal();
		} else {
			nodoRemovido.getAnt().setProx(nodoRemovido.getProx());
			nodoRemovido.getProx().setAnt(nodoRemovido.getAnt());
		}
		
		
	}
	
	public String mostrarLista() {
		String lista = "";
		if (inicio == null) return lista;
		Nodo aux = inicio;
		while (aux != null) {
			lista+=aux.getDado()+"\n";
			aux = aux.getProx();
		}
		return lista;
	}
	
	
}
