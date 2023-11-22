package factorial;

import java.util.Scanner;

public class factor {

	public static void main(String[] args) {
	
		Scanner scanner = new Scanner(System.in);

	System.out.print("Ingrese el valor de n: ");
	int n = scanner.nextInt();

 // Calcular la suma de los primeros n números naturales
	int suma = (n * (n + 1)) / 2;

	System.out.println("La suma de los primeros " + n + " números naturales es: " + suma);
		    
		}
}
