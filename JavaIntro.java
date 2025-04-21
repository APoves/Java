package BasicoJava;
import java.util.Scanner;

public class JavaIntro {
	public static void main(String[] args) {
		//Iniciar Scanner.
		Scanner sn = new Scanner (System.in);
		
		//Pedir números.
		System.out.println("Introduce 3 números para determinar cúal es el mayor.");
		System.out.println("Introduce el primer número: ");
		int a = sn.nextInt();
		
		System.out.println("Introduce el segundo número: ");
		int b = sn.nextInt();
		
		System.out.println("Introduce el tercer número: ");
		int c = sn.nextInt();
		
		System.out.println("Has introducido los números " + a + ", " + b + " y " + c + ".");
		
		//Determinar qué número es mayor.
		if (a > b) {
			if (a > c) {
				System.out.print(a + " es el mayor de los tres números.");
			}else {
				System.out.print(c + " es el mayor de los tres números.");
			}
		}else if (c > b) {
			System.out.print(c + " es el mayor de los tres números.");
		}else {
			System.out.print(b + " es el mayor de los tres números.");
		}
		
		//Cerrar Scanner.
		sn.close();
	}
}

	/* Pide 3 números por teclado e indica cuál es el mayor (sólo indica cúal de los tres es el mayor).
	 * Si los tres números son iguales, habría que decir que el número X es el mayor. 
	 * (No es necesario indicar que los tres son iguales).
  	*/


