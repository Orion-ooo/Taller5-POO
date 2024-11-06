
package Ejercicio3_Utilidades;

/**
 *
 * @author Daniel
 */
public class Utilidades {
    private double valor1;
    private double valor2;
    private double respuesta;

    public Utilidades() {
    }

    public Utilidades(double valor1, double valor2, double respuesta) {
        this.valor1 = valor1;
        this.valor2 = valor2;
        this.respuesta = respuesta;
    }
    
    //metodos
    
    public void suma(){
        respuesta = valor1 + valor2;
    }
    
    public void resta(){
        respuesta = valor1 - valor2;
    }
    
    public void multiplicacion(){
        respuesta = valor1 * valor2;
    }
    
    public void division(){
        respuesta = valor1 / valor2;
    }
    
    //getters y setters

    public double getValor1() {
        return valor1;
    }

    public void setValor1(double valor1) {
        this.valor1 = valor1;
    }

    public double getValor2() {
        return valor2;
    }

    public void setValor2(double valor2) {
        this.valor2 = valor2;
    }

    public double getRespuesta() {
        return respuesta;
    }
}
