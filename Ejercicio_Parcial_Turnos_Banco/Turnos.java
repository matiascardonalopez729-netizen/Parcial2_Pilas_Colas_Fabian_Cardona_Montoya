import java.util.LinkedList;
import java.util.Queue;

public class Turnos {

    private Queue<ObjClienteBanco> cola;
    private Queue<ObjClienteBanco> atendidos;

    public Turnos() {
        cola = new LinkedList<>();
        atendidos = new LinkedList<>();
    }

    public boolean llegadaCliente(int id, String nombre, String tipo, String hora) {
        ObjClienteBanco nuevo = new ObjClienteBanco(id, nombre, tipo, hora, false);
        return cola.offer(nuevo);
    }

    public ObjClienteBanco atenderCliente() {
        if (!cola.isEmpty()) {
            ObjClienteBanco c = cola.poll();
            c.setClienteAtendido(true);
            atendidos.offer(c);
            return c;
        }
        return null;
    }

    public ObjClienteBanco siguienteCliente() {
        if (!cola.isEmpty()) {
            return cola.peek();
        }
        return null;
    }

    public void mostrarCola() {
        if (cola.isEmpty()) {
            System.out.println("Cola vacía");
        } else {
            for (ObjClienteBanco c : cola) {
                System.out.println("ID: " + c.getIdTurno());
                System.out.println("Nombre: " + c.getNombreCliente());
                System.out.println("Servicio: " + c.getTipoServicio());
                System.out.println("Hora: " + c.getHoraLlegada());
                System.out.println("--------------------");
            }
        }
    }

    public void mostrarTurnos() {

        System.out.println("=== CLIENTES ATENDIDOS ===");

        if (atendidos.isEmpty()) {
            System.out.println("Ninguno");
        } else {
            for (ObjClienteBanco c : atendidos) {
                System.out.println("ID: " + c.getIdTurno());
                System.out.println("Nombre: " + c.getNombreCliente());
                System.out.println("Hora: " + c.getHoraLlegada());
                System.out.println("--------------------");
            }
        }

        System.out.println("=== CLIENTES PENDIENTES ===");

        if (cola.isEmpty()) {
            System.out.println("Ninguno");
        } else {
            for (ObjClienteBanco c : cola) {
                System.out.println("ID: " + c.getIdTurno());
                System.out.println("Nombre: " + c.getNombreCliente());
                System.out.println("Hora: " + c.getHoraLlegada());
                System.out.println("--------------------");
            }
        }
    }
}