package BasicoJava;
import java.util.Scanner;

public class JavaIntro {

	public static void main(String[] args) {
		
		//Pedir precio del producto sin IVA
		System.out.print("Introduce el precio del producto: ");
		Scanner sn = new Scanner(System.in);
		int preciosiniva = sn.nextInt();
		
		System.out.println("El precio del producto es " + preciosiniva + " sin IVA.");
		
		//Declarar constante IVA
		final double IVA;
		IVA = 0.21;
		
		//Calcular precio con IVA
		double precioconiva;
		precioconiva = (preciosiniva * (1. + IVA));
		
		//Formatear/redondear y mostrar el precio con IVA
		System.out.print("El precio del producto es ");
		System.out.printf("%.2f", precioconiva);
		System.out.print(" (IVA incluido)");
		
		//Cerrar Scanner
		sn.close();
	}

}

/* Pide el precio de un producto sin IVA y calcula su precio con IVA.
El IVA es del 21%.
"Formatea" el resultado para que el precio final tenga solo 2 decimales.
 */
