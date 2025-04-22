package BasicoJava;
import java.util.Scanner;

public class JavaIntro {

	public static void main(String[] args) {
		//Iniciar escáner.
		Scanner sn = new Scanner(System.in);
		System.out.println("A continuación, se indicará si los números que introduzcas, sean divisibles entre sí.");
		
		//Pedir números
		System.out.println("Introduce el primer número: ");
		int num1 = sn.nextInt();

		System.out.println("Introduce el segundo número: ");
		int num2 = sn.nextInt();

		//Comprobar si los números son divisibles entre sí.
		if (num1 % num2 == 0) {
			System.out.println("El número " + num2 + " es divisor de " + num1 + ".");
		} else {
			System.out.println("El número " + num2 + " no es divisor de " + num1 + ".");
			}
			
		//Comprobar si el primer número es divisible por el segundo.
		if (num2 % num1 == 0) {
			System.out.println ("El número " + num1 + " es divisor de " + num2 + ".");
		} else {
			System.out.println("El número " + num1 + " no es divisor de " + num2 + ".");
		}

		//Cerrar escáner.
		sn.close();
	}
}

	/*Pide al usuario dos números (enteros) e indica si el primero es divisor del segundo.
	 * Luego indica si el segundo número es divisor del segundo.
	 * (Para que un número sea divisor de otro, el módulo/resto debe dar 0).
	*/
