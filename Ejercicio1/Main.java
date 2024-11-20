package Taller6.Ejercicio1;

public class Main {
    public static void main(String[] args) {
       
        Empleado empleado = new Empleado("Carlos", 3000);
        System.out.println("Información del empleado:");
        empleado.mostrarInformacion();

        System.out.println();

       
        Gerente gerente = new Gerente("Ana", 5000, "Ventas");
        System.out.println("Información del gerente:");
        gerente.mostrarInformacion();
    }
}
