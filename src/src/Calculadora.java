package src;

import java.util.Scanner;

public class Calculadora {
	public static void main(String[] args) {
		Integer a;
		Integer b;
		Integer opcion;
		Integer resultado = 0;

		Scanner teclado = new Scanner(System.in);
		do {
			System.out.println(
					"Ingrese su operación: \n #1 para sumar \n #2 para restar \n #3 para multiplicar \n #4 para dividir");
			System.err.println("\n____________________________________");

			opcion = teclado.nextInt();
		} while (opcion < 1 && opcion > 4);

		System.out.println("Ingrese el primer numero");

		a = teclado.nextInt();

		System.out.println("Ingrese el segundo numero");

		b = teclado.nextInt();

		switch (opcion) {
		case 1:
			System.out.println(Sumar(a, b));
			break;
			
		case 2:
			System.out.println(Restar(a, b));
			break;
			
		case 3:
			System.out.println(Multiplicarr(a, b));
			break;
			
		default:
			System.out.println(Dividir(a, b));
			break;
		}
	}

	public static Integer Sumar(Integer a, Integer b) {
		Integer resul = a + b;
		return resul;
	}

	public static Integer Restar(Integer a, Integer b) {
		Integer resul = a - b;
		return resul;
	}

	public static Integer Multiplicarr(Integer a, Integer b) {
		Integer resul = a * b;
		return resul;
	}

	public static Integer Dividir(Integer a, Integer b) {
		Integer resul = a / b;
		return resul;
	}

}
