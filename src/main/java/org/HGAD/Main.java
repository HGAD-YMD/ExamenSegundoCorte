package org.HGAD;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        int totalEstudiantes = 0;
        int totalAprobados = 0;
        int totalReprobados = 0;
        double sumaPromediosGlobal = 0;

        do {
            System.out.println("=====================================");
            System.out.println(" CONTROL DE CALIFICACIONES");
            System.out.println("=====================================");
            System.out.println("1. Registrar calificaciones");
            System.out.println("2. Mostrar estadísticas");
            System.out.println("3. Salir");
            System.out.print("Seleccione una opción: ");

            opcion = scanner.nextInt();
            scanner.nextLine();

            if (opcion == 1) {
                System.out.println("=====================================");
                System.out.println(" REGISTRAR ESTUDIANTE");
                System.out.println("=====================================");
                System.out.print("¿Cuántos estudiantes registrará?: ");
                int n = scanner.nextInt();
                scanner.nextLine();

                int i = 1;

                while (i <= n) {
                    System.out.println("-------------------------------------");
                    System.out.println("Estudiante " + i);
                    System.out.println("-------------------------------------");
                    System.out.print("Nombre: ");
                    String nombre = scanner.nextLine();

                    System.out.print("Evaluación 1: ");
                    double e1 = scanner.nextDouble();
                    System.out.print("Evaluación 2: ");
                    double e2 = scanner.nextDouble();
                    System.out.print("Evaluación 3: ");
                    double e3 = scanner.nextDouble();
                    scanner.nextLine();

                    double promedio = (e1 + e2 + e3) / 3.0;
                    String resultado;

                    if (promedio >= 6.0) {
                        resultado = "APROBADO";
                        totalAprobados++;
                    } else {
                        resultado = "REPROBADO";
                        totalReprobados++;
                    }

                    totalEstudiantes++;
                    sumaPromediosGlobal += promedio;

                    System.out.println("Promedio: " + promedio);
                    System.out.println("Resultado: " + resultado);

                    i++;
                }
                System.out.println("-------------------------------------");

            } else if (opcion == 2) {
                System.out.println("=====================================");
                System.out.println(" ESTADÍSTICAS DEL GRUPO");
                System.out.println("=====================================");

                if (totalEstudiantes == 0) {
                    System.out.println("No hay estudiantes registrados todavía.");
                } else {
                    double promedioGeneral = sumaPromediosGlobal / totalEstudiantes;

                    System.out.println("Estudiantes registrados: " + totalEstudiantes);
                    System.out.println("Estudiantes aprobados: " + totalAprobados);
                    System.out.println("Estudiantes reprobados: " + totalReprobados);
                    System.out.println("Promedio general: " + promedioGeneral);
                }
                System.out.println("=====================================");

            } else if (opcion == 3) {
                System.out.println("Saliendo del programa...");

            } else {
                System.out.println("Opción no válida. Intente de nuevo.");
            }

            System.out.println();
        } while (opcion != 3);

        scanner.close();
    }
}