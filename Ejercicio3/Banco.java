package Taller6.Ejercicio3;



// SE TIENE PRIMERO QUE TODO LA CLASE BANCO CON LA PROPIEDAD SALDO COMO PROTECTED

/* 
public class Banco {
    protected double saldo;

    // Constructor
    public Banco(double saldoInicial) {
        this.saldo = saldoInicial;
    }

    // Método para mostrar el saldo
    public void mostrarSaldo() {
        System.out.println("Saldo: " + saldo);
    }
}*/

/*Utilizar el modificador protected para la propiedad saldo en una clase bancaria es super 
 inseguro por que cualquier subclase o clase del mismo paquete puede acceder directamente 
al atributo saldo y modificarlo. Esto significa que se puede cambiar el saldo sin
 restricciones o validaciones */


 /*
 //Por ejemplo, en esta clase se podria acceder al valor del saldo e incluso cambiarlo
 
 public class CuentaCorriente extends Banco {
    public CuentaCorriente(double saldoInicial) {
        super(saldoInicial);
    }

    public void modificarSaldo(double nuevoSaldo) {
        // Acceso directo al saldo, lo cual no es seguro
        this.saldo = nuevoSaldo;
    }
}
 */
/*TODO: UNA SOLUCION SERIA LA SIGUIENTE, LOS DATOS ESTAN MUCHO MAS PROTEGIDOS  */
 public class Banco {
    private double saldo;

    
    public Banco(double saldoInicial) {
        if (saldoInicial >= 0) {
            this.saldo = saldoInicial;
        } else {
            this.saldo = 0;
            System.out.println("Saldo inicial inválido. Se ha establecido a 0.");
        }
    }

    
    public double getSaldo() {
        return saldo;
    }

    
    public void depositar(double cantidad) {
        if (cantidad > 0) {
            saldo += cantidad;
            System.out.println("Depósito realizado. Saldo actual: " + saldo);
        } else {
            System.out.println("La cantidad a depositar debe ser positiva.");
        }
    }

    
    public void retirar(double cantidad) {
        if (cantidad > 0 && cantidad <= saldo) {
            saldo -= cantidad;
            System.out.println("Retiro realizado. Saldo actual: " + saldo);
        } else if (cantidad > saldo) {
            System.out.println("Saldo insuficiente.");
        } else {
            System.out.println("La cantidad a retirar debe ser positiva.");
        }
    }

    
    public void mostrarSaldo() {
        System.out.println("Saldo: " + saldo);
    }
}