package BasicoJava;
import java.util.Scanner;

public class JavaIntro {

	public static void main(String[] args) {
		//Iniciar Scanner
		Scanner sn = new Scanner (System.in);

		//Pedir datos
		System.out.println("Introduce tu nombre");
		String nombre = sn.nextLine();

		//Mostrar datos
		System.out.println("Hola " + nombre);

		//Cerrar Scanner
		sn.close();
	}

}
// Pide al usuario su nombre y haz que el programa salude
