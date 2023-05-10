/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package figurasgeometricas_;
import java.util.Scanner;

/**
 *
 * @author jhony
 */
public class FigurasGeometricas_ {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner objread = new Scanner(System.in);
         float ladoCuadrado;
         float largo, ancho;
         float radio;
         float area1, area2, area3;
         float perimetro1, perimetro2, perimetro3;
         System.out.println("Ingrese el lado del cuadrado: ");
         ladoCuadrado = objread.nextFloat();
         System.out.println("Ingrese el largo del Rectangulo: ");
         largo = objread.nextFloat();
         System.out.println("Ingrese el ancho del Rectangulo: ");
         ancho = objread.nextFloat();
         System.out.println("Ingrese el radio del circulo: ");
         radio = objread.nextFloat();
         
         //objetos de las clases
         Areas  a1 = new Areas();
         Perimetros p1 = new Perimetros();
         area1 = a1.areaCuadrado(ladoCuadrado);
         area2 = a1.areaRectangulo(largo, ancho);
         area3 = a1.circulo(radio);
         perimetro1 = p1.perimetroCuadrado(ladoCuadrado);
         perimetro2 = p1.perimetroRectangulo(largo, ancho);
         perimetro3 = p1.perimetroCirculo(radio);
         
         //imprimir
         
         System.out.println("El area del cuadrado es: "+ area1);
         System.out.println("El area del rectangulo es: "+ area2);
         System.out.println("El area del circulo es: "+ area3);
         System.out.println("**********************");
         System.out.println("El perimetro del cuadrado es: "+ perimetro1);
         System.out.println("El perimetro del rectangulo es: "+ perimetro2);
         System.out.println("El perimetro del circulo es: "+ perimetro3);
         
    }
    
}
