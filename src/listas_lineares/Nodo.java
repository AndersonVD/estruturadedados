package listas_lineares;

public class Nodo {
	private int dado;
	private Nodo prox;
	private Nodo ant;
	
	public Nodo(int dado) {
		setDado(dado);
	}
	
	public int getDado() {
		return dado;
	}
	public void setDado(int dado) {
		this.dado = dado;
	}
	public Nodo getProx() {
		return prox;
	}
	public void setProx(Nodo prox) {
		this.prox = prox;
	}
	public void setAnt(Nodo ant) {
		this.ant = ant;
	}
	public Nodo getAnt() {
		return ant;
	}
	
	
}
