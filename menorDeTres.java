package complementares2;

import java.util.Scanner;

public class menorDeTres {

	public static void main(String[] args) {
		
		/*Fazer um programa para ler tr�s n�meros inteiros. Em seguida, mostrar qual o 
		 * menor dentre os tr�s n�meros lidos. Em caso de empate, mostrar apenas uma vez.
		 */
		
		Scanner sc = new Scanner (System.in);
		
		int um, dois, tres;
		
		System.out.println("Isira o primeiro n�mero: ");
		um = sc.nextInt();
		
		System.out.println("Isira o segundo n�mero: ");
		dois = sc.nextInt();
		
		System.out.println("Isira o terceiro n�mero: ");
		tres = sc.nextInt();
		
		if (um < dois && um < tres) {
			System.out.println("O menor n�mero � o: "+ um);
		}
		
		else if (dois < um && dois < tres) {
			System.out.println("O menor n�mero � o: "+ dois);
		}
		
		else {
			System.out.println("O menor n�mero � o: "+ tres);
		}
	}
}
