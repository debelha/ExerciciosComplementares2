package complementares2;

import java.util.Scanner;

public class lanchonete {

	public static void main(String[] args) {
		
		/*Uma lanchonete possui v�rios produtos. Cada produto possui um c�digo
          e um pre�o. Voc� deve fazer um programa para ler o c�digo e a
          quantidade comprada de um produto (suponha um c�digo v�lido), e da�
          informar qual o valor a ser pago, com duas casas decimais, conforme
          tabela de produtos ao lado.
		 */
		
		Scanner sc = new Scanner (System.in);
		
		int codigo;
		double quantidade;
		double preco1 = 5.00;   
		double preco2 = 3.50;
		double preco3 = 4.80;
		double preco4 = 4.90;
		double preco5 = 7.32;
		double total;
		
		System.out.println("C�digo do produto: ");
		codigo = sc.nextInt();
		
		System.out.println("Quantidade: ");
		quantidade = sc.nextInt();
		
		if (codigo == 1) {
			total = preco1 * quantidade;
			System.out.printf("Valor a ser pago: R$%.2f",total);
		}
		
		else if (codigo == 2) {
			total = preco2 * quantidade;
			System.out.printf("Valor a ser pago: R$%.2f",total);
		}
		
		else if (codigo == 3) {
			total = preco3 * quantidade;
			System.out.printf("Valor a ser pago: R$%.2f",total);
		}
		
		else if (codigo == 4) {
			total = preco4 * quantidade;
			System.out.printf("Valor a ser pago: R$%.2f",total);
		}
		
		else if (codigo == 5) {
			total = preco5 * quantidade;
			System.out.printf("Valor a ser pago: R$%.2f",total);
		}
		
		else {
			System.out.printf("C�digo inv�lido, tente novamente.");
		}
	}
}
