package BasicoJava;
import java.util.Scanner;

public class JavaIntro {

	public static void main(String[] args) {
		
		
		//Iniciar Scanner.
		Scanner sn = new Scanner (System.in);
		
		//Pedir frase.
		System.out.println("Introduce una frase: ");
		String sentence = sn.nextLine();
		System.out.println();

		//Iniciar variable contador.
		int lowercount = 0;
		int uppercount = 0;
		//Calcular cúantas mayúsculas y minúsculas tiene la frase.
		for (int i = 0; i < sentence.length(); i++) {
			sentence.charAt(i);
			char letter = sentence.charAt(i);
			//Calcular mayúsculas.
			if (letter >= 'A' && letter <='Z') {
				uppercount++;
			}
			//Calcular minúsculas.
			if (letter >= 'a' && letter <= 'z') {
				lowercount++;
			}
			
		}
		//Mostrar número de letras mayúsculas y minúsculas de la frase.
		System.out.println("En la frase '" + sentence + "' hay "
				+ uppercount + " letras mayúsculas y " + lowercount + " letras minúsculas.");
		
		//Cerrar Scanner.
		sn.close();
	}
}
//Pide una frase por teclado y cuenta cuántas mayúsculas y minúsculas tiene.

