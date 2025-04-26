package BasicoJava;
import java.util.Scanner;

public class JavaIntro {

	public static void main(String[] args) {
		//Iniciar Scanner.
		Scanner sn = new Scanner(System.in);
		
		//Pedir frase.
		System.out.println("Introduce una frase: ");
		String sentence = sn.nextLine();
		
		//Variable que contendrá la frase sin espacios.
		String noSpace = "";
		
		//Bucle for para recorrer todos los caracteres de la frase.
		for (int i = 0; i< sentence.length();i++){
			//Añadir el carácter actual de la iteración (actualChar) a noSpace.
			char actualChar = sentence.charAt(i); // Guarda el carácter actual.
			if (sentence.charAt(i) !=' '){ //If que concatenará todo caracter que no sea espacio (' ').
				noSpace += actualChar; //(noSpace es igual a noSpace + actualChar).
			}
		}
		//Mostrar frases sin espacios.
		System.out.println("La frase introducida sin espacios es: " + noSpace);
		
		//Cerrar Scanner.
		sn.close();
	}
}
//Pide una frase por teclado, elimina los espacio, guárdalos en otra variable y muéstrala.
