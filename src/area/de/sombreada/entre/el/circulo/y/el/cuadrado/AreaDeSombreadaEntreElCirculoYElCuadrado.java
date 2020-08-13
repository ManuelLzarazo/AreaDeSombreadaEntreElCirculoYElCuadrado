
package area.de.sombreada.entre.el.circulo.y.el.cuadrado;

import java.util.Scanner;

public class AreaDeSombreadaEntreElCirculoYElCuadrado {


    public static void main(String[] args) {
        
      Scanner teclado =new Scanner(System.in);
      double radio;
      double area =Math.PI;
      System.out.println("ingrese el radio");
      radio=teclado.nextDouble();
      area=area*radio*radio;
      System.out.println("el area del Circulo es"+area);
      
      double areasombreada;
      areasombreada =area-(2*(radio*radio));
      System.out.println("el área sombreada es"+areasombreada);
      
          
       
    }
    
}
