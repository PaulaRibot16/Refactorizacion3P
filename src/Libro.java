public class Libro {
    private String titulo;
    private String autor;
    private EstadoLibro estado;    // 1: Disponible, 2: Prestado, 3: En Reparación
    private double precioBase;

    public Libro(String titulo, String autor, EstadoLibro estado, double precioBase) {
        this.titulo = titulo;
        this.autor = autor;
        this.estado = estado;
        this.precioBase = precioBase;
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

    public EstadoLibro getEstado() {
        return estado;
    }

    public void setEstado(EstadoLibro estado) {
        this.estado = estado;
    }

    public double getPrecioBase() {
        return precioBase;
    }

    public void setPrecioBase(double precioBase) {
        this.precioBase = precioBase;
    }
}