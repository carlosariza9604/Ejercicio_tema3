
//1. Crear una clase coche.
public class Coche {
    //2.Dentro de la clase coche, una variable numérica que almacene el número de puertas que tiene.
    int numeroP=0;
    Coche(){
  System.out.println("Constructor coche");
    }
   //3.Una función que incremente el número de puertas que tiene el coche.
    public void agregarP(){
        numeroP++;
        System.out.println("Se agrego una puerta");
    }
    //5.Mostrar el número de puertas que tiene el objeto.
    public void mostrarP(){
    System.out.println("La cantidad de puertas es: "+ numeroP);
    }
}

