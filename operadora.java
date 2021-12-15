package complementares2;

import java.util.Scanner;

public class operadora {

	public static void main(String[] args) {
		
		/*Uma operadora de telefonia cobra R$ 50.00 por um plano básico que dá direito 
		 * a 100 minutos de telefone. Cada minuto que exceder a franquia de 100 minutos
		 *  custa R$ 2.00. Fazer um programa para ler a quantidade de minutos que uma 
		 *  pessoa consumiu, daí mostrar o valor a ser pago.
		 */

		Scanner sc = new Scanner (System.in);
		
		int minutos;
		double valor;
		
		System.out.println("Digite a quantidade de minutos utilizados: ");
		minutos = sc.nextInt();
		
		valor = (minutos - 100) * 2 + 100;
		
		if (minutos > 100) {
			
			System.out.println("Valor da conta: "+ valor);
		}
		
		else {
			System.out.println("Valor da conta: R$100,00");
		}
		
	}

}
