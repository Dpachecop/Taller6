package Taller6.Ejercicio2;

public class PruebaVehiculo {
    public static void main(String[] args) {
        // Crear una instancia de Vehículo
        Vehiculo vehiculo = new Vehiculo("Automóvil", "Toyota");
        System.out.println("Información del vehículo:");
        vehiculo.mostrarInformacion();

        System.out.println();

       
        Moto moto = new Moto("Motocicleta", "Honda", 500);
        System.out.println("Información de la moto:");
        moto.mostrarInformacion();

        System.out.println();

        // Intentar acceder directamente a las propiedades protected desde una clase no relacionada
        // Esto generará un error de compilación:
        // System.out.println("Tipo de vehículo: " + vehiculo.tipo); 
        // System.out.println("Marca de la moto: " + moto.marca);    
    }
}
