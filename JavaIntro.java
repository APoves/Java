package BasicoJava;

import java.util.Scanner;

public class JavaIntro {

	public static void main(String[] args) {
		
		//Iniciar Scanner.
		Scanner sn = new Scanner (System.in);
				
		int result;

		//Pedir número;
		System.out.println("Introduce un número para mostrar su tabla de multiplicar: ");
		int num = sn.nextInt();
		
		System.out.println("La tabla de multiplicar de " + num + " es: ");
		
		//Bucle for (controla los números del 1 al 10 y muestra la tabla de multiplicar del
		//número introducido).
		for (int i = 1; i <= 10; i++) {
			result = (num * i);
			System.out.println (num + " * " + i + " = " + result + ".");
			
		}

		//Cerrar Scanner.
			sn.close();

	}
}

	/*EJERCICIO 9:
	 * Pide un número por teclado y muestra su tabla de multiplicar hasta 10.
	 * (Pedir número y recorrer del 1 al 10).
	 */ 