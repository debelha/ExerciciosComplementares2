package complementares2;

import java.util.Scanner;

public class aumento {

	public static void main(String[] args) {
		
		/*Uma empresa vai conceder um aumento percentual de sal�rio aos seus funcion�rios
		 * dependendo de quanto cada pessoa ganha, conforme tabela ao lado. Fazer um programa
		 * para ler o sal�rio de uma pessoa, da� mostrar qual o novo sal�rio desta pessoa
		 * depois do aumento, quanto foi o aumento e qual foi a porcentagem de aumento.
		 */

		Scanner sc = new Scanner (System.in);
		
		double salarioAtual, novoSalario, quantidadeAumento;
		
		System.out.printf("Digite seu sal�rio atual: ");
		salarioAtual = sc.nextDouble();
		
		if (salarioAtual > 8000) {
			novoSalario = (salarioAtual * 5) / 100;
			quantidadeAumento = novoSalario - salarioAtual;
			System.out.printf("Seu novo sal�rio � de: R$", novoSalario);
			System.out.printf("Aumento de 5% equivalente a: R$", quantidadeAumento);
		}
				
		else if (salarioAtual > 3000 && salarioAtual <= 8000) {
			novoSalario = (salarioAtual * 10) / 100;
			quantidadeAumento = novoSalario - salarioAtual;
			System.out.printf("Seu novo sal�rio � de: R$", novoSalario);
			System.out.printf("Aumento de 10% equivalente a: R$", quantidadeAumento);
		}
		
		else if (salarioAtual > 1000 && salarioAtual <= 3000) {
			novoSalario = (salarioAtual * 15) / 100;
			quantidadeAumento = novoSalario - salarioAtual;
			System.out.printf("Seu novo sal�rio � de: R$", novoSalario);
			System.out.printf("Aumento de 15% equivalente a: R$", quantidadeAumento);
		}
		
		else if (salarioAtual >= 1000) {
			novoSalario = (salarioAtual * 20) / 100;
			quantidadeAumento = novoSalario - salarioAtual;
			System.out.printf("Seu novo sal�rio � de: R$", novoSalario);
			System.out.printf("Aumento de 20% equivalente a: R$", quantidadeAumento);
		}

		else {
			System.out.printf("N�o ter� aumento");
		}
  }
}
