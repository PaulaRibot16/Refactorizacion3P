public class Libro {
    public String t;
    public String a;
    public int e;    // 1: Disponible, 2: Prestado, 3: En Reparación
    public double p;

    public Libro(String t, String a, int e, double p) {
        this.t = t;
        this.a = a;
        this.e = e;
        this.p = p;
    }
}