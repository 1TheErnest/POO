public class coche {

    private String marca;
    private String modelo;
    private int año;


    coche(String marca, String modelo, int año) {
        this.marca = marca;
        this.modelo = modelo;
        this.año = año;
    }


    public void mostrarInformacion() {
        System.out.println("Marca: " + marca + ", Modelo: " + modelo + ", Año: " + año);
    }


    public int calcularEdadCoche(int añoActual) {
        return añoActual - año;
}

}
