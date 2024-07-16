public class Rettangolo implements Forma {
    int base;
    int height;

    public Rettangolo(int base, int height) {
        this.base = base;
        this.height = height;
    }

    @Override
    public float calcolaArea() {
        return base * height;
    }
}
