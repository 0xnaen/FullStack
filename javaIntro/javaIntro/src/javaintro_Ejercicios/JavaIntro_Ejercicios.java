/*
 * Crear un proyecto de Java y definir al menos 6 variables en tu IDE de distintos tipos de datos.
 */
package javaintro_Ejercicios;

import java.util.Scanner;

/**
 *
 * @author nager
 */
public class JavaIntro_Ejercicios {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // Ejer 1 !Declaraciones de Variables
        String name; 
        int old;
        char sex;
        double sueldo;
        boolean aux;
        long id;
        
        // Ejer 2 !Agsinacion de datos a las Variables
        
        name = "NaenDev";
        old = 40;
        sex = 'M';
        sueldo = 220.5;
        aux = true;
        id = 123456789;
        
        
    
    
    
    // Ejercicio 3 !Define variables donde puedas alojar los resultados y prueba usar dos operadores de cada tipo.
        
    int num1 = 4;
    int num2 = 5;
    
  
    int suma = num1 + num2;   // Suma
        
    int resta = num2 - num1; //Resta
    
    double division = num1 / num2; // Division
        
    boolean mayorQue = num2 > num1;  // Boolean
    
   
   // Ejercicio 4 ! Define una variable que aloje tu nombre y otra que guarde tu edad. Imprime ambas variables por pantalla
    
    System.out.println("Su nombre del developer es: "+ name + " y su edad es: "+ old);
    
    
    // Ejercicio 5  ! Define una variable de tipo ¿boolean?, double y char. Guarda información en ellas a través del Scanner.
    
    String name2, lastName2;
    int old2;
    
    Scanner input = new Scanner(System.in);
        System.out.println("Ingrese su Nombre:");
        name2 = input.nextLine();
        System.out.println("Ingrese Su apellido");
        lastName2 = input.nextLine();
        System.out.println("Ingrese su edad");
        old2 = input.nextInt();
        
        System.out.println("");
        
        mayorQue = old > old2;
        
        System.out.println("Es "+ name +" mayor que "+ name2 + " : " + mayorQue);
        
        // Ejerjercicio 6 ! Implementar un programa que le pida dos números enteros a usuario y determine si ambos o alguno de ellos es mayor a 25.
       
        
        int venticinco = 25;
        
        System.out.println("Ingrese un número");
        int number1 = input.nextInt();
        System.out.println("Ingrese otro número");
        int number2 = input.nextInt();
        
        if (number1 == venticinco && number2 == venticinco){
            System.out.println("Los 2  número ingresados es igual a : "+ venticinco);
        }else if (number1 < venticinco && number2 < venticinco){
                    System.out.println("Ambos número son menores a: "+venticinco);
                    
        }else if (number1 < venticinco && number2 > venticinco) {
            
            System.out.println("El 1er número es menor a: " + venticinco);
            
        }else {System.out.println("El 2do número es menor a: "+ venticinco);}
                    
                    }
        }
        
        
    
    
    }
    
}

