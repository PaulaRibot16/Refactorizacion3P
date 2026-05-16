import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class BibliotecaTest {
    @Test
    void testProcesoCompleto() {
        GestionBiblioteca sistema = new GestionBiblioteca();
        sistema.meterLibro("El Quijote", "Cervantes", 1, 20.0);
        sistema.meterUsuario("Paula", 101, "PREMIUM", "Calle Real 10", "23001");

        sistema.tramitarPrestamo(101, "El Quijote", 20, true);

        assertEquals(2, sistema.listaLibros.get(0).estado);
        assertEquals(1, sistema.listaPrestamos.size());
    }
}