package introduccion;

import java.util.Scanner;

public class DMayorDeTres {
	public static void main(String[] arg) {
		int num1, num2, num3, mayor;
		try (Scanner teclado = new Scanner(System.in)) {
			System.out.println("Ingresa un valor" );
			num1 = teclado.nextInt();
			System.out.println("Ingrese un valor" );
			num2 = teclado.nextInt();
			System.out.println("Ingrese un valor" );
			num3 = teclado.nextInt();
		}
		
		if( num1 > num2 && num1 > num3){
			mayor = num1;
			
		/*dentro del else solo puede haber una instruccion*/
			
		}else
			if (num2 > num3) {
			mayor = num2;	
		}else
			mayor = num3;
				
		System.out.println("El mayor es " + mayor);
			
	}
		
}


