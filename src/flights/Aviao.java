package flights;

public class Aviao {
    private int id;
    private int combustivel;

    public Aviao(int id, int combustivel) {
        this.id = id;
        this.combustivel = combustivel;
    }

    public int getId() {
        return id;
    }

    public int getCombustivel() {
        return combustivel;
    }

    public void setCombustivel(int combustivel) {
        this.combustivel = combustivel;
    }
}
