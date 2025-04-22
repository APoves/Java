package BasicoJava;
import java.util.Scanner;

public class JavaIntro {

	public static void main(String[] args) {
		//Iniciar Scanner.
		Scanner sn = new Scanner(System.in);
		
		//Pedir números.
		System.out.println("Se procederá al cálculo de la operación que quieras realizar.");
		
		System.out.print("Para ello, introduce el primer número: ");
		double num1 = sn.nextDouble();
		System.out.print("Introduce el segundo número: ");
		double num2 = sn.nextDouble();
		sn.nextLine();
		
		//Pedir operador.
		System.out.println ("Indica la operación que quieres realizar.");
		System.out.println("Sumar, restar, multiplicar o dividir: ");
		String operation = sn.nextLine();
		
		// Convertir a minúsculas.
		operation = operation.trim().toLowerCase();
		
		//Switch para realizar operación (Java 12).
		//Mostrar error si el 2º número es un 0 en una división.
		
		switch (operation) {
			case "sumar", "suma", "+":
				System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
				break;
			case "restar", "resta", "-":
				System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
				break;
			case "multiplicar", "multiplica", "*":
				System.out.println(+ num1 + " * " + num2 + " = " + (num1 * num2));
				break;
			case "dividir", "divide", "/":
				if (num2 != 0){
					System.out.println(num1 + " / " + num2 + " = " + (num1 / num2));
				}else {
					System.out.println("El segundo número introducido no es compatible con esta operación. Por favor, empieza de nuevo");
				}
				break;
			default:
				System.out.println("Operador incorrecto. Por favor, empieza de nuevo.");
		}
		//Cerrar Scanner
		sn.close();
	}
}

	/* Crea una calculadora básica y pide 2 operandos, un operador (+ - * /) 
	 * y realiza la operación que corresponda.
	 * Si el operador es inválido o el 2º operando es un 0 (en caso de división), 
	 * muestra un mensaje de error.
	 */
