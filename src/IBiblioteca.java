public interface IBiblioteca {
    void registrarLibro(String titulo, String autor, EstadoLibro estado, double precioBase);

    void meterUsuario(String n, int id, String tip, String dir, String cp);

    // METODO GIGANTE A REFACTORIZAR
    void tramitarPrestamo(int idU, String titL, int d, boolean urg);
}
