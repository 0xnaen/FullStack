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
public class Libro {
    String ISBN;
    String tituloLibro;
    String autor;
    int numPaginas;

    public Libro() {
    }

    public Libro(String ISBN, String tituloLibro, String autor, int numPaginas) {
        this.ISBN = ISBN;
        this.tituloLibro = tituloLibro;
        this.autor = autor;
        this.numPaginas = numPaginas;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public String getTituloLibro() {
        return tituloLibro;
    }

    public void setTituloLibro(String tituloLibro) {
        this.tituloLibro = tituloLibro;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getNumPaginas() {
        return numPaginas;
    }

    public void setNumPaginas(int numPaginas) {
        this.numPaginas = numPaginas;
    }

    @Override
    public String toString() {
        return "Libro{" + "ISBN=" + ISBN + ", tituloLibro=" + tituloLibro + ", autor=" + autor + ", numPaginas=" + numPaginas + '}';
    }
    
    
    
    
    
}
