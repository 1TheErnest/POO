//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        coche coche1=new coche("Toyota","supra",2014);
        coche coche2=new coche("Ford","Mustang",2015);
        coche coche3=new coche("chevrolet","camaro",2000);
        coche1.mostrarInformacion();
        coche2.mostrarInformacion();
        coche3.mostrarInformacion();

        int añoActual=2024;
        System.out.println("Edad del coche 1: "+ coche1.calcularEdadCoche
                (añoActual)+ "años");
        System.out.println("Edad del coche 2: "+coche2.calcularEdadCoche
                (añoActual)+ " años");
        System.out.println("Edad del coche 3: "+ coche3.calcularEdadCoche
                (añoActual)+"años");

    }
}