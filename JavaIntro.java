//Ejercicio19 en Github.
package BasicoJava;
import java.util.Scanner;

public class JavaIntro {

    public static void main(String[] args) {
        //Inicializar Scanner
        Scanner sn = new Scanner(System.in);

        //Inicizar factorial
        long factorial = 1;
        
        //Pedir número al usuario
        System.out.println("Introduce un número para calcular su factorial: ");
        int num = sn.nextInt();


        //Lanzar mensaje si el número introducido es negativo o si es 0.
        if (num == 0) {
            System.out.println("El factorial de 0 es " + factorial + ".");
        } else if(num < 0) {
            System.out.println("No se puede calcular el factorial de un número negativo.");
        } else { //Calcular factorial
            for (int i = num; i > 1; i--){
                factorial *= i; // Multiplicar número actual por el factorial acumulado
            }
        }
    
        //Mostrar resultado
            System.out.println("El factorial de " + num + " es: " + factorial + ".");

        //Cerrar Scanner.
        sn.close();

    }
}

    

    /*Pide un número por teclado y saca su factorial.
    
    (El factorial se obtiene al multiplicar todos los numeros desde X a 1.
    Desde el número 1 hasta el número del que se quiera calcular el factorial).
    
    Ejemplo de calcular el factorial de 4:  4*3*2*1 = 24 ).

    (Ojo, si el número es negativo, no se puede calcular el factorial, y el factorial del número 0 es 1).
    */


	//Este es un ejercicio realizado pensando en un entorno ideal, por lo que la idea es calcular el factorial de un número no mayor que 20, ya que produciría un desbordamiento y el resultado sería erróneo.