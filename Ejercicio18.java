package BasicoJava;
import java.util.Random;
import java.util.Scanner;

public class JavaIntro {

	public static void main(String[] args) {
        // Iniciar Scanner y Random.
        Scanner sn = new Scanner(System.in);
        Random rm = new Random();
        
        //Variable.
        String yes = "si";

        do {
            // Generar número aleatorio entre 1 y 1000.
            int num = rm.nextInt(1, 1001);
            // Declaración de variables (número introducido por el usuario y contador).
            int answer;
            int count = 1;

            //Presentar programa.
            System.out.println("Adivina un número entre 1 y 1000 en un máximo de  9 intentos.");

            // Bucle do while. Ejecuta todo una vez, mientras la respuesta sea distinta al número a adivinar y queden intentos.
            do {
                // Pedir número.
                System.out.print("Intento número " + count + ": ");
                answer = sn.nextInt();

                if (answer == num) { // If por si el número es el acertado.
                    System.out.println("Enhorabuena, has acertado. El número correcto era " + answer + ".");
                } else if (answer > num) { //Indicaciones
                    System.out.println("El número introducido es mayor al mío.");
                } else {
                    System.out.println("El número introducido es menor al mío.");
                }
                count++;
            } while (answer != num && count <= 9);

            if (answer != num) { //Mensaje + 9 intentos
                System.out.println("Se han agotado los 9 intentos. El número era: " + num);
            }

            // Preguntar si usuario vuelve a jugar
            sn.nextLine();
            System.out.print("¿Quieres jugar otra vez? (si/no): ");
            yes = sn.nextLine();

        } while (yes.equalsIgnoreCase("si")); //Repetir todo el bucle si se quiere volver a jugar
        
        System.out.println("Gracias por jugar :)");
        // Cerrar Scanner.
        sn.close();
        
	}

}
/*Dado un número aleatorio entre 1 y 1000, pide al usuario que lo adivine, con un máximo de 9 intentos.
*Para ello, dale pistas indicándole si es mayor o menor al núemero que ha introducido.
*
*Si se acaban los intentos o se acierta el número, el juego se acaba.
*
*Al final, se debe preguntar al usuario si quiere volver a jugar o no.
*Si indica que sí, el juego empezará de nuevo.
*/
