public class Producto {
    private String nombre;
    private double precio;
    private int cantidad;

    public Producto(String nombre, double precio, int cantidad) throws ProductoInvalidoException, PrecioInvalidoException, CantidadInvalidaException {
        if (nombre == null || nombre.trim().isEmpty()) {
            throw new ProductoInvalidoException("El nombre del producto no puede estar vacío o ser nulo.");
        }
        if (precio <= 0) {
            throw new PrecioInvalidoException("El precio del producto debe ser mayor que cero.");
        }
        if (cantidad < 0) {
            throw new CantidadInvalidaException("La cantidad del producto no puede ser negativa.");
        }

        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
    }

    public double calcularValorTotal() {
        return precio * cantidad;
    }

    public void mostrarDetalles() {
        System.out.println("Producto: " + nombre);
        System.out.println("Precio: $" + precio);
        System.out.println("Cantidad: " + cantidad);
        System.out.println("Valor total: $" + calcularValorTotal());
    }

    class ProductoInvalidoException extends Exception {
        public ProductoInvalidoException(String mensaje) {
            super(mensaje);
        }
    }

    class PrecioInvalidoException extends Exception {
        public PrecioInvalidoException(String mensaje) {
            super(mensaje);
        }
    }

    class CantidadInvalidaException extends Exception {
        public CantidadInvalidaException(String mensaje) {
            super(mensaje);
        }
    }
}
