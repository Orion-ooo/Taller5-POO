
package local;

/**
 *
 * @author Daniel
 */
public class Ej1_Empleado {
    public String nombre;
    private double salario;

    public Ej1_Empleado(String nombre, double salario) {
        this.nombre = nombre;
        this.salario = salario;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        if (salario > 0) {
            this.salario = salario;
        } else {
            System.out.println("monto incorrecto");
        }
    }
    
    
}
