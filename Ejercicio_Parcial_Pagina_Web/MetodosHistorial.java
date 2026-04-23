import java.util.Stack;

public class MetodosHistorial {

    private Stack<ObjPaginaWeb> pila;

    public MetodosHistorial() {
        pila = new Stack<>();
    }

    public boolean registrar(ObjPaginaWeb pagina) {
        pila.push(pagina);
        return true;
    }

    public ObjPaginaWeb retroceder() {
        if (!pila.isEmpty()) {
            return pila.pop();
        }
        return null;
    }

    public ObjPaginaWeb verActual() {
        if (!pila.isEmpty()) {
            return pila.peek();
        }
        return null;
    }

    public void mostrarHistorial() {

        if (pila.isEmpty()) {
            System.out.println("Historial vacío.");
        } else {
            for (int i = pila.size() - 1; i >= 0; i--) {
                ObjPaginaWeb p = pila.get(i);
                System.out.println("URL: " + p.getUrlPagina());
                System.out.println("Título: " + p.getTituloPagina());
                System.out.println("Fecha: " + p.getFechaAcceso());
                System.out.println("----------------------");
            }
        }
    }
}