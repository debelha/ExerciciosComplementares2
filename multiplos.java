package complementares2;

import java.util.Scanner;

public class multiplos {

	public static void main(String[] args) {
		
		/*Fazer um programa para ler dois números inteiros, e dizer se um número
		 * é múltiplo do outro. Os números podem ser digitados em qualquer ordem.
		 */
		
		Scanner sc = new Scanner (System.in);
		
		int a, b;
		
		System.out.println("Primeiro número: ");
		a = sc.nextInt();
		
		System.out.println("Segundo número: ");
		b = sc.nextInt();
		
		if ( a % b == 0) {
			System.out.println("São múltiplos");
		}
		
		else if (b % a == 0) {
			System.out.println("São múltiplos");
		}
		
		else {
			System.out.println("Não são múltiplos");
		}
	}
}
