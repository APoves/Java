package BasicoJava;
import java.util.Locale; //sólo si se utiliza sn.useLocale
import java.util.Scanner;

public class JavaIntro {

	public static void main(String[] args) {
		
		//Inicializar Scanner
		Scanner sn = new Scanner(System.in);
		/*Opcional: añadir sn.useLocale(Locale.US) para que se 
		puedan introducir números decimales con . (ej: 10.5 en vez de 1,5)*/
		sn.useLocale(Locale.US);
		
		//Solicitar números
		System.out.println("Introduce el primer número: ");
		double num1 = sn.nextDouble();
		
		System.out.println("Introduce el segundo número: ");
		double num2 = sn.nextDouble();
		
		//Realizar operaciones con los operadores + - * / y %
		double suma = num1 + num2;
		double resta = num1 - num2;
		double multiplicacion = num1 * num2;
		double division = num1 / num2;
		double modulo = num1 % num2;
		
		//Mostrar resultados
		System.out.println("Suma: " + suma);
		System.out.println("Resta: " + resta);
		System.out.println("Multiplicación: " + multiplicacion);
		System.out.println("División: " + division);
		System.out.println("Módulo (resto): " + modulo);
		
		//Cerrar Scanner
		sn.close();
	}
}

/* Crea una calculadora básica donde aparezcan los operadores aritméticos + - / * y %.
 * Haz que el usuario introduzca dos valores y que realice operaciones con estos operadores.
 */
