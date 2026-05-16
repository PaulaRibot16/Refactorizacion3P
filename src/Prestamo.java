public class Prestamo {
    public Libro libro;
    public Usuario usuario;
    public int dias;

    public Prestamo(Libro libro, Usuario usuario, int dias) {
        this.libro = libro;
        this.usuario = usuario;
        this.dias = dias;
    }
}