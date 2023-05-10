/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package figurasgeometricas_;

public class Perimetros {
    
    public float perimetroCuadrado(float lado){
        float perimetro;
        perimetro = lado*4;
        return perimetro;
    }
    public float perimetroRectangulo(float largo, float ancho){
        float perimetro;
        perimetro = 2 * (largo + ancho);
        return perimetro;
    }
    
    public float perimetroCirculo(float radio){
        float perimetro;
        perimetro = (float) Math.PI * 2  * radio;
        return perimetro;
    }
    
}
