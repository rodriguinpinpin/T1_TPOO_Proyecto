import java.util.ArrayList;

public class controlador {
    private ArrayList<Trabajador> lista;

    public controlador() {
        this.lista = new ArrayList<>();
    }

    public void agregar(Trabajador t) {
        lista.add(t);
    }

    public void listar() {
        for (Trabajador t : lista) {
            System.out.println(t);
        }
    }
}