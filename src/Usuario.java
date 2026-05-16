public class Usuario {
    public String n;
    public int id;
    public String tip; // "BASE" o "PREMIUM"
    public double deuda;
    public String dir;  // Dirección de envío
    public String cp;   // Código postal

    public Usuario(String n, int id, String tip, String dir, String cp) {
        this.n = n;
        this.id = id;
        this.tip = tip;
        this.deuda = 0.0;
        this.dir = dir;
        this.cp = cp;
    }
}