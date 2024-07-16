public class Triangolo implements Forma {
    int base;
    int height;

    public Triangolo(int base, int height) {
        this.base = base;
        this.height = height;
    }

    @Override
    public float calcolaArea() {
        return base * height / 2;
    }
}
