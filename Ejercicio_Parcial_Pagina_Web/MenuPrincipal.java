import java.util.Scanner;

public class MenuPrincipal {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        MetodosHistorial gestor = new MetodosHistorial();
        Validaciones util = new Validaciones();

        int opcion = 1;

        while (opcion != 4) {

            System.out.println("\n=== MENU NAVEGADOR WEB ===");
            System.out.println("1) Ingresar nueva página");
            System.out.println("2) Retroceder");
            System.out.println("3) Ver historial");
            System.out.println("4) Salir");
            System.out.print("Seleccione una opción: ");

            opcion = util.validarEntero(sc);
            sc.nextLine();

            switch (opcion) {

                case 1:
                    System.out.print("Ingrese la URL: ");
                    String url = sc.nextLine();

                    System.out.print("Ingrese el título: ");
                    String titulo = sc.nextLine();

                    System.out.print("Ingrese la fecha de acceso: ");
                    String fecha = sc.nextLine();

                    ObjPaginaWeb pagina = new ObjPaginaWeb(url, titulo, fecha);

                    gestor.registrar(pagina);
                    System.out.println("Página guardada.");
                    break;

                case 2:
                    ObjPaginaWeb eliminada = gestor.retroceder();

                    if (eliminada != null) {

                        // Mostrar eliminada
                        System.out.println("Página eliminada:");
                        System.out.println("URL: " + eliminada.getUrlPagina());
                        System.out.println("Título: " + eliminada.getTituloPagina());
                        System.out.println("Fecha: " + eliminada.getFechaAcceso());

                        // Mostrar actual
                        ObjPaginaWeb actual = gestor.verActual();

                        if (actual != null) {
                            System.out.println("\nPágina actual:");
                            System.out.println("URL: " + actual.getUrlPagina());
                            System.out.println("Título: " + actual.getTituloPagina());
                            System.out.println("Fecha: " + actual.getFechaAcceso());
                        } else {
                            System.out.println("\nHistorial vacío.");
                        }

                    } else {
                        System.out.println("No hay páginas para retroceder.");
                    }
                    break;

                case 3:
                    gestor.mostrarHistorial();
                    break;

                case 4:
                    System.out.println("Fin del programa.");
                    break;

                default:
                    System.out.println("Opción inválida.");
            }
        }

        sc.close();
    }
}