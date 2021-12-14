/*
 * CALCULADORA ARITMETICOLÓGICA
 * Fecha: 24/11/2021
 * Autora: Esmeralda Parra Cano, Cristofer, Daniel y José Antonio
 */


package codigo;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CalculadoraAritmeticoLogica {
	
	static Scanner teclado = new Scanner(System.in);
	static int menu1;
	static boolean salir = false;
	private static int numero1;
	private static int numero2;
	private static int resultado;
	
	public static void main(String[] args) {

	do
	{
	System.out.println("Menú de Calculadora");
	
	System.out.println("Ingrese la accion a realizar: ");
    System.out.println("1.- Calculos Aritméticos");
    System.out.println("2.- Cálculos Lógicos");
    System.out.println("3.- Salir");
    
     
    try {
		menu1 = teclado.nextInt();
	
        switch(menu1) 
        	{
        	case 1: 
        			System.out.println("Calculadora Aritmética");
        			menuAritmetica(); //Entra en el menú
        			
        			// Aquí hay que llamar al menú de la calculadora aritmética
        			break;
        			
        	case 2:		
        			System.out.println("Calculadora Lógica");
        			logica();
        			
        			// Aquí llamamos a la calculadora lógica
        			break;
        	
        	case 3:
        			System.out.println("Salir");
        			salir = true;
        			break;
        	}}
        	catch (Exception e)
        			{
        	    		// TODO Auto-generated catch block
        	    		e.printStackTrace();
        	    	}
        	
	}while (!salir);
	teclado.close();
    	
	}
	
public static void menuAritmetica() { //Menú de selección
		
		boolean salir = false; //centinela para salir del programa
		int seleccion;
		
		do {
			System.out.println("Selecciona una opción");
			System.out.println("1. Sumar");
			System.out.println("2. Restar");
			System.out.println("3. Multiplicar");
			System.out.println("4. Dividir");
			System.out.println("5. Apagar la calculadora aritmética");
			
			try {
				seleccion= teclado.nextInt();
				
				switch (seleccion)
					{
					case 1: 
						pedirDatos(); //Llamada al método que nos solicita los datos
						suma(numero1, numero2); //Llamada al método suma
						break;
					case 2: 
						pedirDatos();
						resta(numero1, numero2);
						break;
					case 3: 
						pedirDatos();
						multiplicacion(numero1, numero2);
						break;
					case 4: 
						pedirDatos();
						division(numero1, numero2);
						break;
					case 5: 
						salir=true;
						System.out.println("Salir de la calculadora aritmética");
						break;
					}
			
				}
			catch (InputMismatchException e) //salta cuando lo introducido es una letra y no se puede convertir a numero
         		{
				System.out.println("Debes insertar un número, no una letra");
				teclado.next();
         		}
		}while (!salir);
	}

public static void pedirDatos() { //Pide los números que deseamos operar
	
	System.out.println("Introduzca un número por teclado");
	numero1 = teclado.nextInt();
	System.out.println("Introduzca otro número por teclado");
	numero2 = teclado.nextInt();
}

public static void suma(int numero1, int numero2) {
	resultado = numero1 + numero2;
	System.out.println(numero1 + " + " + numero2 + " = " + resultado);
	}

public static void resta(int numero1, int numero2) {
	resultado = numero1 - numero2;
	System.out.println(numero1 + " - " + numero2 + " = " + resultado);
}

public static void multiplicacion(int numero1, int numero2) {
	resultado = numero1 * numero2;
	System.out.println(numero1 + " x " + numero2 + " = " + resultado);
}

public static void division(int numero1, int numero2) {
	double resultado;
	if (numero2 == 0)
		{
		System.out.println("Error. No se puede dividir por 0");
		} 
	else 
		{
		resultado = (double) numero1 / numero2;
		System.out.println(numero1 + " : " + numero2 + " = " + resultado);
		}
}

public static void logica() {
	int menu3;
	boolean salir3=false;
	do {
		System.out.println("Selecciona una opción");
		System.out.println("1. AND");
		System.out.println("2. OR");
		System.out.println("3. NOT");
		System.out.println("4. XOR");
		System.out.println("5. Apagar la calculadora lógica");
		
		try {
			menu3= teclado.nextInt();
			
			switch (menu3)
				{
				case 1: 
					metodoAnd();
					
					break;
				case 2: 
					metodoOr();
					
					break;
				case 3: 
					metodoNot();
					
					break;
				case 4: 
					metodoXor();
					
					break;
				case 5: 
					salir3=true;
					System.out.println("Salir de la calculadora lógica");
					break;
				}
		
			}
		catch (InputMismatchException e) //salta cuando lo introducido es una letra y no se puede convertir a numero
     		{
			System.out.println("Debes insertar un número, no una letra");
			teclado.next();
     		}
	}while (!salir3);
	//teclado.close();
}
public static void metodoAnd() {
	boolean x = true;
    boolean y = false;
    boolean a1 = x && x;
    boolean a2 = x && y;
    boolean a3 = y && x;
    boolean a4 = y && y;

    System.out.println("Tabla de verdad de la conjunción");
    System.out.println( x + " AND " + x + " = " + a1 );
    System.out.println( x + " AND " + y + " = " + a2 );
    System.out.println( y + " AND " + x + " = " + a3 );
    System.out.println( y + " AND " + y + " = " + a4 );
}
public static void metodoOr() {
	boolean x = true;
    boolean y = false;
    boolean a1 = x || x;
    boolean a2 = x || y;
    boolean a3 = y || x;
    boolean a4 = y || y;

    System.out.println("Tabla de verdad de la conjunción");
    System.out.println( x + " OR " + x + " = " + a1 );
    System.out.println( x + " OR " + y + " = " + a2 );
    System.out.println( y + " OR " + x + " = " + a3 );
    System.out.println( y + " OR " + y + " = " + a4 );
}
public static void metodoNot() {
	boolean x = true;
    boolean y = false;
    boolean a1 = !x;
    boolean a2 = !y;

    System.out.println("Tabla de verdad de la conjunción");
    System.out.println(" NOT " + x + " = " + a1 );
    System.out.println(" NOT " + y + " = " + a2 );

}
public static void metodoXor() {
	boolean x = true;
    boolean y = false;
    boolean a1 = x ^ x;
    boolean a2 = x ^ y;
    boolean a3 = y ^ x;
    boolean a4 = y ^ y;

    System.out.println("Tabla de verdad de la conjunción");
    System.out.println( x + " XOR " + x + " = " + a1 );
    System.out.println( x + " XOR " + y + " = " + a2 );
    System.out.println( y + " XOR " + x + " = " + a3 );
    System.out.println( y + " XOR " + y + " = " + a4 );
}
}

