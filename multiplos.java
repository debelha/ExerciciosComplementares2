package complementares2;

import java.util.Scanner;

public class multiplos {

	public static void main(String[] args) {
		
		/*Fazer um programa para ler dois n�meros inteiros, e dizer se um n�mero
		 * � m�ltiplo do outro. Os n�meros podem ser digitados em qualquer ordem.
		 */
		
		Scanner sc = new Scanner (System.in);
		
		int a, b;
		
		System.out.println("Primeiro n�mero: ");
		a = sc.nextInt();
		
		System.out.println("Segundo n�mero: ");
		b = sc.nextInt();
		
		if ( a % b == 0) {
			System.out.println("S�o m�ltiplos");
		}
		
		else if (b % a == 0) {
			System.out.println("S�o m�ltiplos");
		}
		
		else {
			System.out.println("N�o s�o m�ltiplos");
		}
	}
}
