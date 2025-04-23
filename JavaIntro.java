package BasicoJava;

import java.util.Scanner;

public class JavaIntro {

	public static void main(String[] args) {
		
		//Iniciar Scanner.
		Scanner sn = new Scanner(System.in);
		
		//Declarar variable num.
		int num;
		
		//Bucle do while (óptimo porque se requiere pedir un número al menos una vez).
		do {
			System.out.println("Introduce un número positivo: ");
			num = sn.nextInt();
			if (num < 0){ //Muestra el mensaje sólo si el número es negativo (inferior a 0).
				System.out.println("El número " + num + " es un número negativo. Vuelve a introducir otro número");
			}
		} while (num < 0); //Valida si continúa o no entrando en el bucle.
		System.out.println("Has introducido un número positivo. Fin del bucle.");
		
		//Cerrar Scanner.
		sn.close();
	}
}

/* EJERCICIO 10: 
 * Pide un número por teclado y valida que sea un número positivo.
 * (DO WHILE).
 */