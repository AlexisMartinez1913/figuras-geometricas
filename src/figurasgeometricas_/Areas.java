
package figurasgeometricas_;


public class Areas {
    
   
    public float areaCuadrado(float l1){
        float area;
        area = l1*l1;
        return area;
    }
    
    public float areaRectangulo(float largo , float ancho){
        float areaRect;
        areaRect = largo * ancho;
        return areaRect;
    }
    
    public float circulo(float radio){
        float areaCirculo;
        areaCirculo =(float) Math.PI * radio * radio;
        return areaCirculo;
    }
    
}
