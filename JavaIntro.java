package BasicoJava;
import java.util.Scanner;

public class JavaIntro {

	public static void main(String[] args) {
		
		///Iniciar escáner.
		Scanner sn = new Scanner(System.in);
		
		//Pedir año.
		System.out.println("Introduce un año para comprobar si es un año bisiesto: ");
		int year = sn.nextInt();

		//Comprobar y mostrar si es o no año bisiesto.
		if (year % 4 == 0){
			if (year %100 != 0 || year % 400 == 0) {
				System.out.println(year + " es un año bisiesto.");
			}else{
				System.out.println(year + " no es un año bisiesto.");
			}
		}else {
			System.out.println(year + " no es un año bisiesto.");
		}

		
		//Cerrar escáner.
		sn.close();

	}
}

	/* Muestra la suma de los números hasta que el usuario introduzca un -1.
	 * Se irán pidiendo números, los cuales se irán sumando.
	 * Cuando el usuario introduzca un -1, el programa saldrá del bucle while y finalizará.
	*/