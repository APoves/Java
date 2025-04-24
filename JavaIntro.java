package BasicoJava;

import java.util.Scanner;

public class JavaIntro {

	public static void main(String[] args) {
		//Iniciar Scanner.
		Scanner sn = new Scanner(System.in);
		
		//Pedir frase.
		System.out.println("Introduce una frase para contar su número de vocales:");
		System.out.println("Ten en cuenta que no se contarán las vocales con tílde.");
		System.out.println();
		//Variable que almacenará la frase (pasará todo a minúscula para evitar errores).
		String sentence = sn.nextLine().toLowerCase();
		System.out.println();
		
		//Contador de vocales.
		int totalVocals = 0;
		
		for (int i = 0; i <= sentence.length() -1; i++) {
			char vocal = sentence.charAt(i);
			if (vocal == 'a' || vocal == 'e' || vocal == 'i' || vocal == 'o'|| vocal == 'u'){
			totalVocals++;
			}
		}
		//Mostrar resultado.
		System.out.println("La frase '" + sentence + "' tiene " + totalVocals + " vocales.");
		
		//Cerrar Scanner.
		sn.close();
	}
}
// Pide una frase por teclado y cuenta cúantas vocales tiene.


/* Podría hacerse con
switch(vocal){
case 'a', 'e', 'i', 'o', 'u' -> totalVocals++;}
 */