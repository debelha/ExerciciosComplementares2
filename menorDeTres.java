package complementares2;

import java.util.Scanner;

public class menorDeTres {

	public static void main(String[] args) {
		
		/*Fazer um programa para ler três números inteiros. Em seguida, mostrar qual o 
		 * menor dentre os três números lidos. Em caso de empate, mostrar apenas uma vez.
		 */
		
		Scanner sc = new Scanner (System.in);
		
		int um, dois, tres;
		
		System.out.println("Isira o primeiro número: ");
		um = sc.nextInt();
		
		System.out.println("Isira o segundo número: ");
		dois = sc.nextInt();
		
		System.out.println("Isira o terceiro número: ");
		tres = sc.nextInt();
		
		if (um < dois && um < tres) {
			System.out.println("O menor número é o: "+ um);
		}
		
		else if (dois < um && dois < tres) {
			System.out.println("O menor número é o: "+ dois);
		}
		
		else {
			System.out.println("O menor número é o: "+ tres);
		}
	}
}
