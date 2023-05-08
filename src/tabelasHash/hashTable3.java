package tabelasHash;

public class hashTable3 {
    private int tamArray;
    private listaEncadeada[] array;

    public hashTable3(int tamArray) {
        this.tamArray = tamArray;
        array = new listaEncadeada[tamArray];
    }

    private int hash(String chave) {
        byte bytesChave[] = chave.getBytes();
        int hashCode = 0;
        for (int i : bytesChave) {
            hashCode += i;
        }
        return hashCode % tamArray;
    }

    public void inserir(String chave, String valor) {
        int indiceArray = hash(chave);
        if (array[indiceArray] == null) {
            array[indiceArray] = new listaEncadeada(chave, valor);
            return;
        }
        Nodo aux = array[indiceArray].getInicio();
        while (aux != null) {
            if (aux.getChave() == chave) {
                aux.setValor(valor);
                return;
            }
            aux = aux.getProx();
        }
        array[indiceArray].inserirFinal(chave, valor);
    }

    public String recuperar(String chave) {
        int indiceArray = hash(chave);
        if (array[indiceArray] == null) {
            return "Chave não está na tabela";
        }

        Nodo aux = array[indiceArray].getInicio();
        while (aux != null) {
            if (aux.getChave() == chave) {
                return aux.getValor();
            }
            aux = aux.getProx();
        }
        return "Chave não está na tabela";

    }

}
