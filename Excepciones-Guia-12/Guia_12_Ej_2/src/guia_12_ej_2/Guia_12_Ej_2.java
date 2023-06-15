/*
Definir una Clase que contenga algún tipo de dato de tipo array y agregue el código para 
generar y capturar una excepción ArrayIndexOutOfBoundsException (índice de arreglo fuera 
de rango).
 */
package guia_12_ej_2;

/**
 *
 * @author nager
 */
public class Guia_12_Ej_2 {

    public static void main(String[] args) {
      
        int[] arreglo = new int[5];
        
        
        try {
            arreglo[10]= 9;
        } catch (ArrayIndexOutOfBoundsException e) {
            
            System.out.println("La posicion que desea ubicar esta fuera de rango");
        }
        
        
        
    }
    
}
