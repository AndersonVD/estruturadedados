package tabelasHash;

public class listaEncadeada {

    private Nodo head;

    public listaEncadeada(String chave, String valor) {
        setHead(new Nodo(chave, valor));
    }

    public void inserirFinal(String chave, String valor) {
        Nodo newNodo = new Nodo(chave, valor);
        Nodo aux = getInicio();
        while (aux.getProx() != null) {
            aux = aux.getProx();
        }
        aux.setProx(newNodo);
    }

    public Nodo getInicio() {
        return head;
    }

    public void setHead(Nodo head) {
        this.head = head;
    }
}
