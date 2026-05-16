public class Libro {
    private String titulo;
    private String autor;
    private int estado;    // 1: Disponible, 2: Prestado, 3: En Reparación
    private double precioBase;

    public Libro(String titulo, String autor, int estado, double precioBase) {
        this.setTitulo(titulo);
        this.setAutor(autor);
        this.setEstado(estado);
        this.setPrecioBase(precioBase);
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

    public double getPrecioBase() {
        return precioBase;
    }

    public void setPrecioBase(double precioBase) {
        this.precioBase = precioBase;
    }
}