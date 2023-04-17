package flights;

public class Main {
    static int tempo = 20;
    static int combustivel = 20;
    static int decolagem = 10;
    static int aterrisasagem = 10;

    public static void main(String[] args) {
        System.out.println("Sucesso!");
        System.out.println(tempo);
        Main.addTempo(tempo);
        System.out.println(tempo);
    }

    public static void addTempo(int tempo) {
        tempo++;
        System.out.println(tempo);
    }
}
