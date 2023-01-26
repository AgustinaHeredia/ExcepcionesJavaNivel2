package ProbarExcepciones;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Entrada {
	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		
		byte b1=leerByte("Introduce un número entre -128 y 127");
		System.out.println("El número byte que has ingresado es: "+b1);
		
		int i1=leerInt("Introduce un número int. Entre -2.147.483.648 y 2.147.483.647");
		System.out.println("El número int que has ingresado es: "+i1);

		
		float f1=leerFloat("Introduce un valor float");
		System.out.println("El número float que has ingresado es: "+f1);

		
		double d1=leerDouble("Introduce un valor double");
		System.out.println("El número double que has ingresado es: "+d1);

		
		char c1=leerChar("Introduce un caracter.");
		System.out.println("El caracter que has ingresado es: "+c1);
		
		String s1=leerString("Introduce una cadena de caracteres");
		System.out.println("La cadena de caracteres que has ingresado es: "+s1);

		boolean respuesta =leerSiNo("Escribe S en caso de si y N en caso de no");
        System.out.println("La respuesta ingresada es: " + respuesta);

	}
	//Métodos capturando la excepción de la clase InputMismatchException:
	public static byte leerByte(String mensaje) {
		byte numB = 0;
	    boolean valido = false;
	    while (!valido) {
	        try {
	            System.out.print(mensaje);
	            numB = input.nextByte();
	            if(numB < -128 || numB > 127){
	                System.out.println("Error: ingrese un número entero dentro del rango de byte");
	                valido = false;
	            }else{
	                valido = true;
	            }
	        } catch (InputMismatchException e) {
	            System.out.println("Error de formato.");
	            input.next();
	        }
	    }
	    return numB;
	}
	

	public static int leerInt(String mensaje) {
		int numI = 0;
	    boolean valido = false;
	    while (!valido) {
	        try {
	            System.out.print(mensaje);
	            numI = input.nextInt();
	            if(numI < -2147483648 || numI > 2147483647){
	                System.out.println("Error: ingrese un número entero dentro del rango de int");
	                valido = false;
	            }else{
	                valido = true;
	            }
	        } catch (InputMismatchException e) {
	            System.out.println("Error de formato.");
	            input.next();
	        }
	    }
	    return numI;
	}

	public static float leerFloat(String mensaje) {
		 float numF = 0;
	        boolean valido = false;
	        while (!valido) {
	            try {
	                System.out.print(mensaje);
	                numF = input.nextFloat();
	                valido = true;
	            } catch (InputMismatchException e) {
	                System.out.println("Error de formato.");
	                input.next();
	            }
	        }
	        return numF;
	}

	public static double leerDouble(String mensaje) {
		double numD = 0;
        boolean valido = false;
        while (!valido) {
            try {
                System.out.print(mensaje);
                numD = input.nextDouble();
                valido = true;
            } catch (InputMismatchException e) {
                System.out.println("Error de formato.");
                input.next();
            }
        }
        return numD;
	}

	//métodos capturando la excepción de la clase Exception
	
	public static char leerChar(String mensaje) {
		char caracter = ' ';
        boolean valido = false;
        while (!valido) {
            try {
                System.out.print(mensaje);
                caracter = input.next().charAt(0);
                valido = true;
            } catch (Exception e) {
                System.out.println("Error de formato.");
                input.next();
            }
        }
        return caracter;
	}

	public static String leerString(String mensaje) {
		String cadena = "";
        boolean valido = false;
        while (!valido) {
            try {
                System.out.print(mensaje);
                cadena = input.nextLine();
                valido = true;
            } catch (Exception e) {
                System.out.println("Error de formato.");
                input.next();
            }
        }
        return cadena;
	}

	public static boolean leerSiNo(String mensaje) {
		boolean respuesta = false;
        boolean valido = false;
        while (!valido) {
            try {
                System.out.print(mensaje);
                char caracter = input.next().charAt(0);
                if (caracter == 's' || caracter == 'S') {
                    respuesta = true;
                    valido = true;
                } else if (caracter == 'n' || caracter == 'N') {
                    respuesta = false;
                    valido = true;
                }
            } catch (Exception e) {
                System.out.println("Error de formato. Ingrese 's' o 'n'.");
                input.next();
            }
        }
        return respuesta;
	}

}
