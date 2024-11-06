
package Ejercicio3_Utilidades;

import java.util.Scanner;

/**
 *
 * @author Daniel
 */
public class NewMain {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Utilidades utilidades = new Utilidades();
        
        System.out.println("calculadora:");
        System.out.println("ingrese su primer valor a operar:");
        utilidades.setValor1(entrada.nextDouble());
        System.out.println("ingrese el segundo valor a operar:");
        utilidades.setValor2(entrada.nextDouble());
        
        System.out.println("escriba la operacion que desea realizar:");
        System.out.println("- suma");
        System.out.println("- resta");
        System.out.println("- multiplicacion");
        System.out.println("- division (el primer valor debe ser el mayor)");
        String opcion = entrada.next();
        
        if (opcion.equalsIgnoreCase("suma")) {
            utilidades.suma();
            System.out.println(utilidades.getRespuesta());
        } else if(opcion.equalsIgnoreCase("resta")){
            utilidades.resta();
            System.out.println(utilidades.getRespuesta());
        } else if(opcion.equalsIgnoreCase("multiplicacion")){
            utilidades.multiplicacion();
            System.out.println(utilidades.getRespuesta());
        } else if(opcion.equalsIgnoreCase("division")){
            utilidades.division();
            System.out.println(utilidades.getRespuesta());
        }else{
            System.out.println("opcion incorrecta");
        }
    }
    
}
