import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Ingrese el nombre del producto: ");
            String nombre = scanner.nextLine();

            System.out.print("Ingrese el precio del producto: ");
            double precio = scanner.nextDouble();

            System.out.print("Ingrese la cantidad en inventario: ");
            int cantidad = scanner.nextInt();

            Producto producto = new Producto(nombre, precio, cantidad);
            producto.mostrarDetalles();

        } catch (Producto.ProductoInvalidoException | Producto.PrecioInvalidoException | Producto.CantidadInvalidaException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Error inesperado. Por favor, revise los datos ingresados.");
        }
    }
}
