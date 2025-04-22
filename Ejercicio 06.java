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
/* Pide al usuario un año por teclado e indica si es bisiesto o no. 

(Un año es bisiesto cuando es divisible entre 4 y no es divisible por 100 o es divisible por 400.Los años 2000, 2008 y 2020 son años bisiestos).
Con ser divisible, aquí nos referimos a que su división da un resultado distinto a 0.
*/
