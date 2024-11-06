
package local;

/**
 *
 * @author Daniel
 */
public class NewMain {

    public static void main(String[] args) {
        
        //Ejercicio 1
        Ej1_Empleado empleado = new Ej1_Empleado("nombre", 0);
        
        empleado.nombre = "nuevoNombre";
        empleado.setSalario(123);
        
        //Ejercicio 2
        Ej2_CuentaBancaria cuentaBancaria = new Ej2_CuentaBancaria(0, 0, "tipoCuenta");
        
        //cuentaBancaria.numCuenta = 123;
        //error de compilacion
        cuentaBancaria.mostrarInformacion();
    }
    
}
