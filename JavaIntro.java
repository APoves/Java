package BasicoJava;
import java.util.Scanner;

public class JavaIntro {

	public static void main(String[] args) {
		
		Scanner sn = new Scanner (System.in);
		sn.useDelimiter("/n/r");
		
		System.out.println("Introduce tu nombre");
		String nombre = sn.nextLine();
		
		System.out.println("Hola " + nombre);
		
		sn.close();
	}

}
	//Introduce pide al usuario su nombrey haz que el programa salude
