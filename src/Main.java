public class Main {
    public static void main(String[] args) {
        Triangolo triangolo = new Triangolo(6, 9);
        Rettangolo rettangolo = new Rettangolo(3, 6);
        triangolo.calcolaArea();
        rettangolo.calcolaArea();
        System.out.println(triangolo.calcolaArea());
        System.out.println(rettangolo.calcolaArea());
    }
}