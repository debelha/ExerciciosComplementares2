package complementares2;

import java.util.Scanner;

public class troco {

	public static void main(String[] args) {
		
		/*Fazer um programa para calcular o troco no processo de pagamento de um produto de
		 * uma mercearia.O programa deve ler o preço unitário do produto, a quantidade de
		 * unidades compradas deste produto, e o valor em dinheiro dado pelo cliente.
		 *  Seu programa deve mostrar o valor do troco a ser devolvido ao cliente. 
		 *  Se o dinheiro dado pelo cliente não for suficiente, mostrar uma mensagem 
		 *  informando o valor restante conforme exemplo.
		 */

		Scanner sc = new Scanner (System.in);
		
		double preco, pagamento, precoTotal, troco;
		int quantidade;
		
		System.out.println("Preço: ");
		preco = sc.nextDouble();
		
		System.out.println("Unidades: ");
		quantidade = sc.nextInt();
		
		System.out.println("Pagamento: ");
		pagamento = sc.nextDouble();
		
		precoTotal = preco * quantidade;
		troco =  pagamento - precoTotal ; 
		
		System.out.println("Troco: "+ troco);
	}
}
