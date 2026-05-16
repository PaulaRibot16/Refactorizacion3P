public class Usuario {
    public String n;
    public int id;
    public String tip;
    public double deuda;
    public Direccion direccion;

    private Usuario(String n, int id, String tip, Direccion direccion) {
        this.n = n;
        this.id = id;
        this.tip = tip;
        this.deuda = 0.0;
        this.direccion = direccion;
    }

    public static Usuario createUsuario(String n, int id, String tip, Direccion direccion) {
        return new Usuario(n, id, tip, direccion);
    }
}