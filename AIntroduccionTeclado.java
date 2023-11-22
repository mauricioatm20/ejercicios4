package introduccion;
import java.util.Scanner;

public class AIntroduccionTeclado {
	
	@SuppressWarnings("resource")
	
	public static void main(String[] arg) {
		Scanner teclado;
		teclado = new Scanner(System.in);
		
		System.out.println("Ingresa tu nombre");
		String nombre = teclado.nextLine();
		
		if (nombre.equals("Iris")) {
		System.out.println("Hola Iris");
		
		} else {
			
			System.out.println("Hola" + nombre + "Iris");
		}
	}
}