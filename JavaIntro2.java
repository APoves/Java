package BasicoJava;
import java.util.Scanner;

public class JavaIntro2 {

	public static void main(String[] args) {
		//Iniciar Scanner.
		Scanner sn = new  Scanner (System.in);
		
		//Pedir número (del cual se calculará el factorial).
		System.out.println("Introduce un número: ");
		long number = sn.nextLong();
		
		//Llamar a la función factorial.
		long factorial = factorial (number);
		
		//Mostrar resultado.
		System.out.println("El factorial de " + number + " es " + factorial + ".");
		
		//Cerrar Scanner.
		sn.close();
	}
	
	public static long factorial (long num) {//Función factorial.
		
		long factorial = num;
		//Cálculo del factorial.
		for(long i = num -1; i > 1; i--) {
			factorial *= i;
		}
		return factorial;
	}

}

/*Pide un número por teclado y saca su factorial.

Este ejercicio se realizará de forma diferente al anterior, ya que tendrá al menos una FUNCIÓN.

(El factorial se obtiene al multiplicar todos los numeros desde X a 1.
Desde el número 1 hasta el número del que se quiera calcular el factorial).

Ejemplo de calcular el factorial de 4:  4*3*2*1 = 24 ).

(Ojo, si el número es negativo, no se puede calcular el factorial, y el factorial del número 0 es 1).



Este es un ejercicio realizado pensando en un entorno ideal, por lo que la idea es calcular el factorial 
de un número no mayor que 20, ya que produciría un desbordamiento y el resultado sería erróneo.
Además, este ejercicio se realizará sólo teniendo en cuenta números positivos, siendo el menor número pensado para introducir, el 1.
*/