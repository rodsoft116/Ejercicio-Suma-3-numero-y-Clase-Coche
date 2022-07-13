// Creacion de la clase coche.
public class Coche {
  private int puerta;
// Variablew puerta que almacenara el número de puertas que tiene.
  public Coche (int puerta){
    this.puerta = puerta;
  }
// Función para incremente el número de puertas del coche.
  public void addPuerta (int puerta){
    this.puerta += puerta;    
  }

  public void printInfo (){
    System.out.println("El numero de puertas del Coche son:  " + puerta);
  }
// Creacion del objeto miCoche en el main.
  public static void main(String [] args){
    Coche coch = new Coche(4);
    coch.addPuerta(1);
    coch.printInfo();
  }
 
}
