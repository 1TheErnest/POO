import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            Habitacion individual = new Habitacion("Individual", 50.0);
            Habitacion doble = new Habitacion("Doble", 75.0);
            Habitacion suite = new Habitacion("Suite", 150.0);
            
            Habitacion[] habitaciones = {individual, doble, suite};
            
            boolean salir = false;
            
            while (!salir) {
                System.out.println("--- Sistema de Reservas de Habitaciones ---");
                System.out.println("1. Mostrar detalles de las habitaciones");
                System.out.println("2. Realizar una reserva");
                System.out.println("3. Liberar una habitacion");
                System.out.println("4. Salir");
                System.out.print("Seleccione una opcion: ");
                
                int opcion = scanner.nextInt();
                
                switch (opcion) {
                    case 1 -> {
                        for (Habitacion habitacion : habitaciones) {
                            habitacion.mostrarDetalles();
                        }
                    }
                    case 2 -> {
                        System.out.print("Ingrese el numero de habitacion (1: Individual, 2: Doble, 3: Suite): ");
                        int numeroHabitacion = scanner.nextInt();
                        System.out.print("Ingrese el numero de noches a reservar: ");
                        int noches = scanner.nextInt();
                        
                        if (numeroHabitacion < 1 || numeroHabitacion > 3) {
                            System.out.println("Numero de habitacion invalido.");
                            break;
                        }
                        
                        Habitacion habitacion = habitaciones[numeroHabitacion - 1];
                        try {
                            habitacion.reservar(noches);
                        } catch (HabitacionNoDisponibleException | NumeroDeNochesInvalidoException e) {
                            System.out.println("Error: " + e.getMessage());
                        }
                    }
                    case 3 -> {
                        System.out.print("Ingrese el numero de habitacion para liberar (1: Individual, 2: Doble, 3: Suite): ");
                        int numeroHabitacion = scanner.nextInt();
                        if (numeroHabitacion < 1 || numeroHabitacion > 3) {
                            System.out.println("Numero de habitacion invalido.");
                            break;
                        }
                        habitaciones[numeroHabitacion - 1].liberar();
                    }
                    case 4 -> {
                        salir = true;
                        System.out.println("Gracias por usar el sistema de reservas.");
                    }
                    default -> System.out.println("Opcion inválida. Intente de nuevo.");
                }
            }
        }
    }
}