
package local;

/**
 *
 * @author Daniel
 */
public class Ej2_CuentaBancaria {
    private int numCuenta;
    private double saldo;
    public String tipoCuenta;

    public Ej2_CuentaBancaria(int numCuenta, double saldo, String tipoCuenta) {
        this.numCuenta = numCuenta;
        this.saldo = saldo;
        this.tipoCuenta = tipoCuenta;
    }
    
    public void mostrarInformacion(){
        System.out.println("numero de cuenta: " + numCuenta);
        System.out.println("saldo en la cuenta: " + saldo);
        System.out.println("tipo de cuenta: " + tipoCuenta);
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
}
