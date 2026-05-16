public class Usuario {
    public String n;
    public int id;
    public String tip;
    public double deuda;
    public Direccion direccion;

    public Usuario(String n, int id, String tip, Direccion direccion) {
        this.n = n;
        this.id = id;
        this.tip = tip;
        this.deuda = 0.0;
        this.direccion = direccion;
    }
}