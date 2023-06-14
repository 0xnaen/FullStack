/*
Declarar una clase llamada Circunferencia que tenga como atributo privado el radio de 
tipo real. A continuación, se deben crear los siguientes métodos: 
a) Método constructor que inicialice el radio pasado como parámetro. 
b) Métodos get y set para el atributo radio de la clase Circunferencia. 
c) Método para crearCircunferencia(): que le pide el radio y lo guarda en el atributo del 
objeto. 
d) Método area(): para calcular el área de la circunferencia (𝐀𝐫𝐞𝐚 = 𝛑 ∗ 𝐫𝐚𝐝𝐢𝐨𝟐).
e) Método perimetro(): para calcular el perímetro (𝐏𝐞𝐫𝐢𝐦𝐞𝐭𝐫𝐨 = 𝟐 ∗ 𝛑 ∗ 𝐫𝐚𝐝𝐢𝐨).
 */
package guia_8_ej_2;

import java.util.Scanner;

/**
 *
 * @author nager
 */
public class Circunferencia {
    
    Scanner input = new Scanner(System.in);
    private double radio;

    public Circunferencia() {
    }

    public Circunferencia(double radio) {
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    @Override
    public String toString() {
        return "Circunferencia{" + "radio=" + radio + '}';
    }
    
    
    
    public void crearCircunferencia(double r){
        
        System.out.println("Ingre el radio de la Circunferencia");
        
      
     
    }
}
