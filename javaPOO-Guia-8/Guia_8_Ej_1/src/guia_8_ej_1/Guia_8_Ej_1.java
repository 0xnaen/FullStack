/*
Crear una clase llamada Libro que contenga los siguientes atributos: ISBN, Título, Autor, 
Número de páginas, y un constructor con todos los atributos pasados por parámetro y un 
constructor vacío. Crear un método para cargar un libro pidiendo los datos al usuario y 
luego informar mediante otro método el número de ISBN, el título, el autor del libro y el 
numero de páginas.
 */
package guia_8_ej_1;

/**
 *
 * @author nager
 */
public class Guia_8_Ej_1 {


    public static void main(String[] args) {
       
        LibroServicios libroN = new LibroServicios();
        
        Libro l1 = libroN.datosLibro();
        
        libroN.mostarInfoBook(l1);
        
        
        
    }
    
}
