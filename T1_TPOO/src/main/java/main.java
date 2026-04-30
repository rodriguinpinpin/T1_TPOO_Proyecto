import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        controlador control = new controlador();

        int opcion;

        do {
            System.out.println("1. Agregar trabajador");
            System.out.println("2. Mostrar trabajadores");
            System.out.println("0. Salir");
            opcion = sc.nextInt();
            sc.nextLine();

            try {
                if (opcion == 1) {
                    System.out.print("Nombre: ");
                    String nombre = sc.nextLine();

                    System.out.print("Tipo Documento (DNI/CE): ");
                    String tipo = sc.nextLine();

                    System.out.print("Numero Documento: ");
                    String num = sc.nextLine();

                    System.out.print("Regimen (728/Locacion): ");
                    String reg = sc.nextLine();

                    System.out.print("Pension (AFP Integra/AFP Prima/AFP Habitat/ONP): ");
                    String pen = sc.nextLine();

                    System.out.print("Sueldo: ");
                    double sueldo = sc.nextDouble();

                    Trabajador t = new Trabajador(nombre, tipo, num, reg, pen, sueldo);
                    control.agregar(t);

                } else if (opcion == 2) {
                    control.listar();
                }

            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }

        } while (opcion != 0);
    }
}