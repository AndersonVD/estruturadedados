package tabelasHash;

public class testeHash {
    public static void main(String[] args) {
        hashTable tabelaHash = new hashTable(10);

        tabelaHash.inserir("34242", "Joao");
        tabelaHash.inserir("3424112", "Carlinhos"); // Esse aqui acaba sobrescrevendo
        tabelaHash.inserir("9239123", "Betinho");

        String var = tabelaHash.recuperar("9239123");
        String var1 = tabelaHash.recuperar("34242");

        // System.out.println(var);
        System.out.println(var1);

    }
}
