package complementares2;

import java.util.Scanner;

public class glicose {

	public static void main(String[] args) {
		
		/*Fazer um programa para ler a quantidade de glicose no sangue de uma pessoa e
		 * depois mostrar na tela a classificação desta glicose de acordo com a tabela de
           referência ao lado.
		 */

		Scanner sc = new Scanner (System.in);
		
		int mgDL;
		
		System.out.println("Informe seu mg/dl: ");
		mgDL = sc.nextInt();
		
		if (mgDL > 140) {
			System.out.println("Resultado: DIABETES");
		}
		
		else if (mgDL > 100 && mgDL < 140) {
			System.out.println("Resultado: ELEVADO");
		}
		
		else {
			System.out.println("Resultado: NORMAL");
		}

	}

}
