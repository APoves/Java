package BasicoJava;
import java.util.Random; //Importación clase Random.
import java.util.Scanner; //Importación clase Scanner.

public class Ejercicio16 {

	public static void main(String[] args) {
		//Iniciar Scanner.
		Scanner sn = new Scanner(System.in);
		//Iniciar Random.
		Random rm = new Random();
		
		//Generar número aleario entre 1 y 100.
		int num = rm.nextInt(1 , 101);
		//Booleano que marcará si se acierta o no el número.
		boolean check = false;
		
		System.out.println("Adivina un número al azar, comprendido entre 1 y 100.");
		System.out.println("Ten en cuenta que sólo tienes 5 intentos para averiguar el número.");
		System.out.println();
		
		//Bucle for. Pide número si no se acierta y sale del bucle al pasar los 5 intentos.
		for (int i = 1; i<=5; i++) {
			//Pedir número.
			System.out.println("Introduce un número: ");
			int answer = sn.nextInt();
			
				if(answer == num) {//If por si el número es el acertado.
					System.out.println("Enhorabuena, " + answer + " es el número correcto");
					System.out.println("Sólo has necesitado " + i + " intentos. ¡Has ganado!");
					check = true; //Forzar salida del bucle en la siguiente iteración.
				}else if(answer != num){
					if (answer > num){
						System.out.println("El número introducido es mayor al mío.");
					}else {
						System.out.println("El número introducido es menor al mío.");
					}
				}
			}
		if (!check) { //Mostrar el mensaje sílo si check sigue siendo false, como al principio.
			System.out.println("Lo siento, al haber realizado más de 5 intentos, pierdes el juego.");
			System.out.println("El número correcto era " + num + ".");
			}
		//Cerrar Scanner.
		sn.close();
	}

}
/* EJERCICIO 15:
*Dado un número aleatorio entre 1 y 100 (incluidos), pide al usuario por teclado que lo adivine dándole pistas
*(diciéndole si es mayor o menor).
*El usuario tiene sólo 5 intentos.
*Si se acaban los intentos o se acierta el número, el juego se acaba.
*/