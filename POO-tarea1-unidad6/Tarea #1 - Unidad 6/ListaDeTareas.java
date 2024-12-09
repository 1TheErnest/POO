import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ListaDeTareas {

    private static final String ARCHIVO_TAREAS = "tareas.txt";

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            boolean continuar = true;
            
            while (continuar) {
                System.out.println("\nMenú:");
                System.out.println("1. Escribir tarea");
                System.out.println("2. Leer tareas");
                System.out.println("3. Terminar");
                System.out.print("Elija una opción: ");
                int opcion = scanner.nextInt();
                scanner.nextLine();
                
                switch (opcion) {
                    case 1 -> {
                        System.out.print("Ingrese la tarea: ");
                        String tarea = scanner.nextLine();
                        escribirTarea(tarea);
                        System.out.println("Tarea guardada.");
                    }
                    case 2 -> {
                        System.out.println("Tareas guardadas:");
                        leerTareas();
                    }
                    case 3 -> {
                        System.out.println("Programa terminado.");
                        continuar = false;
                    }
                    default -> System.out.println("Opción no válida. Intente de nuevo.");
                }
            }
        }
    }

    public static void escribirTarea(String tarea) {
        try (FileWriter escritor = new FileWriter(ARCHIVO_TAREAS, true)) {
            escritor.write(tarea + "\n");
        } catch (IOException e) {
            System.out.println("Error al escribir la tarea: " + e.getMessage());
        }
    }

    public static void leerTareas() {
        try (BufferedReader lector = new BufferedReader(new FileReader(ARCHIVO_TAREAS))) {
            String linea;
            while ((linea = lector.readLine()) != null) {
                System.out.println(linea);
            }
        } catch (IOException e) {
            System.out.println("Error al leer las tareas: " + e.getMessage());
        }
    }
}
