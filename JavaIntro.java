package BasicoJava;
import java.util.Scanner;

public class JavaIntro {

	public static void main(String[] args) {
		
		//Iniciar Scanner
		Scanner sn = new Scanner(System.in);
		
		//Declaración de variables.
		int num = 0; //Declaración de variable número (necesaria para entrar en el bucle).
		int result =0; //Almacenará la suma de los números introducidos.
		System.out.println("Introduce un número. Cuidado, si introduces -1, el programa finalizará.");
		
		//Establecer condición con while.
		while (num != -1) {
			//Pedír número
			num = sn.nextInt();
			System.out.println("Has introducido " + num + ("."));
			if (num !=-1) { //Controlar que los números se sumen, excepto el -1.
				result+=num; //Similar a num + result
				System.out.println("La suma total de todos los números introducidos hasta ahora es " + result + ".");
				System.out.println();
				System.out.println("Vuelve a introducir un número: ");
			}
		}
		//Mostrar resultado de la suma de los números introducidos.
		System.out.println("La suma total de todos los número introducidos ha sido " + result + ".");
		System.out.println();
		System.out.println ("Ya que el número introducido ha sido -1, el programa finaliza.");
		
		//Cerrar Scanner.
		sn.close();
	}
}

	/* Muestra la suma de los números hasta que el usuario introduzca un -1.
	 * Se irán pidiendo números, los cuales se irán sumando.
	 * Cuando el usuario introduzca un -1, el programa saldrá del bucle while y finalizará.
	*/
