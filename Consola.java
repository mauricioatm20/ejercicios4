package com.CursoJava.Util.Consola;

import java.util.Scanner;

public class Consola {
	
	static Scanner tec = new Scanner(System.in);

	public static String leerCadena() { //lee por teclado una linea completa.
		
			return tec.nextLine();
		}
	
	public static String leerCadena(String mensaje) { //lee por teclado una linea completa, mostrando previamente como mensaje de lectura 'mensaje'
		
		System.out.println(mensaje);
		return tec.nextLine();
		
	}
	public static int leerInt() { //lee por teclado una linea completa que contiene un valor entero y lo devuelve.
		int num = tec.nextInt();
		tec.nextLine();
		return num;
		}
		
	public static int leerInt(String mensaje) { //lee por teclado una linea completa que contiene un valor entero y lo devuelve, mostrando previamente como mensaje de lectura 'mensaje'
		System.out.print(mensaje);
		return leerInt();
		}
	
	
	public static double mostrarRedondeado(double numero, int decimales) {//muestra por consola num pero redondeandolo a la cantidad de decimales indicada.
		
	        double potencia = Math.pow(10, decimales);
	        double numMultiplicado = numero* potencia;
	        double numeroRedondeado = Math.round(numMultiplicado);
	        double resultadoFinal = numeroRedondeado / potencia;
	        return resultadoFinal;
	    }

	
	public static void main(String[] args) {
		
		 Consola texto = new Consola(); //La variable texto es ahora una referencia a esta nueva instancia de la clase Consola.
		 
		 	String cadena = texto.leerCadena("Introducir una cadena: "); // Llama al método leerCadena de la instancia de Consola almacenada en la variable texto
		 	System.out.println("Cadena introducida: " + cadena);
	     
		 	int entero = texto.leerInt("Introduce un numero entero: ");
	        System.out.println("Entero introducido: " + entero);
	        
	        System.out.print("Ingrese un número: ");
	        double numero = tec.nextDouble();

	        System.out.print("Ingrese la cantidad de decimales: ");
	        int decimales = tec.nextInt();
	        
	        
	        double numeroRedondeado = texto.mostrarRedondeado(numero, decimales);
	        System.out.println("Número redondeado: " + numeroRedondeado);
	        
	}
}
