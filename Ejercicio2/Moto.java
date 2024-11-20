package Taller6.Ejercicio2;

public class Moto extends Vehiculo {
    private int cilindrada;

 
    public Moto(String tipo, String marca, int cilindrada) {
        super(tipo, marca);
        this.cilindrada = cilindrada;
    }

    
    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion(); 
        System.out.println("Cilindrada: " + cilindrada + " cc");
    }
}
