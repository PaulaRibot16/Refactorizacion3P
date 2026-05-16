import java.util.ArrayList;
import java.util.List;

public class GestionBiblioteca {
    public List<Libro> listaLibros = new ArrayList<>();
    public List<Usuario> listaUsuarios = new ArrayList<>();
    public List<Prestamo> listaPrestamos = new ArrayList<>();

    public void meterLibro(String t, String a, int e, double p) {
        listaLibros.add(new Libro(t, a, e, p));
    }

    public void meterUsuario(String n, int id, String tip, String dir, String cp) {
        listaUsuarios.add(new Usuario(n, id, tip, dir, cp));
    }

    // METODO GIGANTE A REFACTORIZAR
    public void tramitarPrestamo(int idU, String titL, int d, boolean urg) {
        for (Usuario u : listaUsuarios) {
            if (u.id == idU) {
                if (u.deuda > 10.0) {
                    System.out.println("Bloqueado por deuda");
                    return;
                }
                for (Libro l : listaLibros) {
                    if (l.t.equals(titL) && l.e == 1) {

                        // Cálculo de precio final con tasas
                        double total = l.p * 1.21;
                        if (urg) {
                            total += 5.0;
                        }
                        if (u.tip.equals("PREMIUM")) {
                            total -= 2.0;
                        }

                        // Cálculo de penalización por días excesivos
                        if (d > 15) {
                            total += (d - 15) * 0.5;
                        }

                        l.e = 2; // Cambiar a prestado
                        listaPrestamos.add(new Prestamo(l, u, d));
                        System.out.println("Factura: " + total + " euros para " + u.n);
                        return;
                    }
                }
            }
        }
        System.out.println("Error en el proceso");
    }
}