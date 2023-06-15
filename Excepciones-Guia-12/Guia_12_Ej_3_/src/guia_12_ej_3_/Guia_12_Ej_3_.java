/*
 Defina una clase llamada DivisionNumero. En el método main utilice un Scanner para leer dos 
números en forma de cadena. A continuación, utilice el método parseInt() de la clase Integer, 
para convertir las cadenas al tipo int y guardarlas en dos variables de tipo int. Por ultimo realizar 
una división con los dos numeros y mostrar el resultado.
 */
package guia_12_ej_3_;

import java.util.Scanner;

/**
 *
 * @author nager
 */
public class Guia_12_Ej_3_ {

  
    public static void main(String[] args) {
       
        Scanner input = new Scanner(System.in);
        
        
        DivisionNumero divi = new DivisionNumero();
        
        try {
            
             System.out.println("Ingrese el primer numero");
             String n1 = input.nextLine();
             divi.setNum1(Integer.parseInt(n1));
             
               System.out.println("Ingrese el primer numero");
             String n2 = input.nextLine();
             divi.setNum2(Integer.parseInt(n2));
            
            
        } catch (NumberFormatException e) {
            System.out.println("Ingrese solo numeros");
            
            
        }
        
       
        divi.division();
        
        
    }
    
}
