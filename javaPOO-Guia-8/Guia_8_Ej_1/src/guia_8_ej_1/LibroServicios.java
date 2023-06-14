/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia_8_ej_1;

import java.util.Scanner;

/**
 *
 * @author nager
 */
public class LibroServicios {
    Scanner input = new Scanner(System.in);
    
    public Libro datosLibro (){
        
        
        Libro l1 = new Libro(); //Intanciar un nuevo Obejeto en este caso un Libro
        
        System.out.println("Ingrese los datos ISBN del Libro");
        l1.setISBN(input.nextLine());
        System.out.println("Ingrese el titulo del Libro");
        l1.setTituloLibro(input.nextLine());
        System.out.println("Ingrese el Nombre del Autor del Libro");
        l1.setAutor(input.nextLine());
        System.out.println("Ingrese la cantidad de paginas quer tiene el Libro ");
        l1.setNumPaginas(input.nextInt());
        
        
        return l1;
        
    }
        
        public void mostarInfoBook(Libro l1){
            
            System.out.println("El ISBN del Libro es: " + l1.getISBN()+"\n");
            System.out.println("El titulo del Libro es: " + l1.getTituloLibro()+"\n");
            System.out.println("El Autor del Libro es: " + l1.getAutor()+"\n");
            System.out.println("La cantidad de paginas del Libro es:" + l1.getNumPaginas());
            
            
            
            
        }
        
        
        
        
    
}
