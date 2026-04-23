import java.util.Scanner;

public class AppBanco {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Turnos sistema = new Turnos();
        Validaciones util = new Validaciones();

        int opcion = 0;

        while (opcion != 6) {

            System.out.println("\nMENU TURNOS BANCO");
            System.out.println("1. Llegada de un nuevo cliente");
            System.out.println("2. Atender cliente");
            System.out.println("3. Ver siguiente cliente");
            System.out.println("4. Mostrar cola");
            System.out.println("5. Mostrar turnos");
            System.out.println("6. Salir del sistema");
            System.out.print("Seleccione una opción: ");

            opcion = util.validarEntero(sc);
            sc.nextLine();

            switch (opcion) {

                case 1:
                    System.out.print("ID del turno: ");
                    int id = util.validarEntero(sc);
                    sc.nextLine();

                    System.out.print("Nombre del cliente: ");
                    String nombre = sc.nextLine();

                    String tipo = util.seleccionarTipoServicio(sc);

                    System.out.print("Hora llegada del cliente: ");
                    String hora = sc.nextLine();

                    boolean agregado = sistema.llegadaCliente(id, nombre, tipo, hora);

                    if (agregado) {
                        System.out.println("Cliente agregado a la cola");
                    }
                    break;

                case 2:
                    ObjClienteBanco atendido = sistema.atenderCliente();

                    if (atendido != null) {
                        System.out.println("Cliente atendido:");
                        System.out.println("ID: " + atendido.getIdTurno());
                        System.out.println("Nombre: " + atendido.getNombreCliente());
                        System.out.println("Servicio: " + atendido.getTipoServicio());
                        System.out.println("Hora: " + atendido.getHoraLlegada());
                    } else {
                        System.out.println("No hay clientes en espera");
                    }
                    break;

                case 3:
                    ObjClienteBanco siguiente = sistema.siguienteCliente();

                    if (siguiente != null) {
                        System.out.println("Siguiente cliente:");
                        System.out.println("ID: " + siguiente.getIdTurno());
                        System.out.println("Nombre: " + siguiente.getNombreCliente());
                        System.out.println("Servicio: " + siguiente.getTipoServicio());
                        System.out.println("Hora: " + siguiente.getHoraLlegada());
                    } else {
                        System.out.println("No hay clientes en cola");
                    }
                    break;

                case 4:
                    sistema.mostrarCola();
                    break;

                case 5:
                    sistema.mostrarTurnos();
                    break;

                case 6:
                    System.out.println("Fin del programa");
                    break;

                default:
                    System.out.println("Opción inválida");
            }
        }

        sc.close();
    }
}