package flights;

public class Aeronave {
    private int id;
    private int combustivel;

    public Aeronave(int id, int combustivel) {
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
