import java.util.Scanner;

public class Validaciones {

    // VALIDAR ENTERO
    public int validarEntero(Scanner sc) {
        while (!sc.hasNextInt()) {
            System.out.println("Por favor digite un numero");
            sc.nextLine();
        }
        return sc.nextInt();
    }

    public String seleccionarTipoServicio(Scanner sc) {

        int opcion = 0;

        while (opcion < 1 || opcion > 5) {

            System.out.println("Seleccione tipo de servicio:");
            System.out.println("1. Pago");
            System.out.println("2. Asesoría");
            System.out.println("3. Retiro");
            System.out.println("4. Queja");
            System.out.println("5. Otros");
            System.out.print("Opción: ");

            opcion = validarEntero(sc);
            sc.nextLine();
        }

        switch (opcion) {
            case 1:
                return "Pago";
            case 2:
                return "Asesoría";
            case 3:
                return "Retiro";
            case 4:
                return "Queja";
            default:
                return "Otros";
        }
    }
}