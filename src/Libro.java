public class Libro {
    public String titulo;
    public String autor;
    public int estado;    // 1: Disponible, 2: Prestado, 3: En Reparación
    public double precioBase;

    public Libro(String titulo, String autor, int estado, double precioBase) {
        this.titulo = titulo;
        this.autor = autor;
        this.estado = estado;
        this.precioBase = precioBase;
    }
}