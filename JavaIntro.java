package BasicoJava;

public class JavaIntro {

	public static void main(String[] args) {
		
		System.out.print("Los números del 1 al 100 divisibles entre 2 y 3, son: ");
		//Bucle for (con declaración de variable y condición hasta salir del bucle).
		for (int i = 1; i <= 100; i++){ //Al ser un rando definido (de 1 a 100) se utiliza for.
			if (i % 2 == 0 && i % 3 == 0){
				//Mostrar números.
				System.out.print(i + " ");
			}
		}		

	}
}
	 // Muestra los números del 1 y al 100 que sean divisibles entre 2 y 3.
	 
