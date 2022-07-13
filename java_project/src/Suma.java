import java.util.Scanner;

public class Suma {

 public static void main(String[] args) {

  int num1, num2, num3, resultado;
  Scanner sc = new Scanner(System.in); //Se crea el lector
  
  System.out.println("introduzca el primer numero");
  num1 = sc.nextInt(); // permite transcrivir los numero en pantalla
  
  System.out.println("introduzca el segundo numero");
  num2 = sc.nextInt(); // permite transcrivir los numero en pantalla

  System.out.println("introduzca el tercer numero");
  num3 = sc.nextInt(); // permite transcrivir los numero en pantalla
  
  resultado=num1+num2+num3; // SE almacena los numero trascrito en las respectivas variable
  
  System.out.println("La suma de de los Tres numeros es : "+resultado); //  Imprime el resultado en pantalla
  
 }

}