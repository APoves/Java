package BasicoJava;
import java.util.Scanner;

public class Ejercicio16 {

	public static void main(String[] args) {
		//Iniciar Scanner.
		Scanner sn = new Scanner (System.in);
		
		//Pedir frase.
		System.out.println("Introduce una frase para comprobar si es un palíndromo.");
		System.out.println("No serán válidas las palabras con tílde.");
		// Variable que almacenará la frase (o número) y la convertirá toda a minúsculas.
		String sentence = sn.nextLine().toLowerCase();
		//Variable que contendrá la frase o número sin espacios.
		String noSpace = "";
		//Variable que contendrá la frase o número al revés.
		String rotateSentence = "";
		
		//Bucle for para recorrer todos los caracteres de la frase o número
		for (int i = 0; i < sentence.length(); i++) {
			//Añadir el carácter actual de la iteración (actualChar) a noSpace.
			char actualChar = sentence.charAt(i); // Guarda el carácter actual.
			if (sentence.charAt(i) !=' '){ //If que concatenará todo caracter que no sea espacio (' ').
				noSpace += actualChar;
			}
		}
		//Bucle for para invertir frase o número. En vez de comenzar en 0, comienza en el final.
		for (int j = noSpace.length() -1; j >= 0 ; j--){
			rotateSentence += (noSpace.charAt(j)); //Concatenación de letras para formar la frase o número al revés.
		}
		
		//If-else que comparará las cadenas e indicará si es o no palíndromo.
		if (noSpace.equals(rotateSentence)){
			System.out.println("Es un palíndromo.");
		}else {
			System.out.println("No es un palíndromo.");
		}
			
		//Cerrar Scanner.
		sn.close();
	}

}
/* EJERCICIO 14:
* Pide una frase e indica si es un palíndromo.

* (Ejemplos: "oso", "radar", "La ruta nos aportó otro paso natural".) 
*
*
*En vez de "String sentence = sn.nextLine().toLowerCase();" se podría usar " String sentence = sn.nextLine();"
*pero sería necesaio utilizar "if (noSpace.equalsIgnoreCase(rotateSentence)){" en vez de "if (noSpace.equals(rotateSentence)){".
*/



// antes llamado ej14 //