package complementares2;

import java.util.Scanner;

public class notas {

	public static void main(String[] args) {
		
		/*Fazer um programa para ler as duas notas que um aluno obteve no primeiro e segundo
		 * semestres de uma disciplina anual. Em seguida, mostrar a nota final que o aluno
		 *  obteve (com uma casa decimal) no ano juntamente com um texto explicativo.
		 *   Caso a nota final do aluno seja inferior a 60.00, mostrar a mensagem "REPROVADO",
		 */

		Scanner sc = new Scanner (System.in);
		
		double nota1, nota2, media;
		
		System.out.printf("Nota primeiro semestre: ");
		nota1 = sc.nextDouble();
		
		System.out.printf("Nota segundo semestre: ");
		nota2 = sc.nextDouble();
		
		media = (nota1 + nota2) / 2;
		
		if (media < 60) {
			System.out.printf("REPROVADO, nota: %.2f", media);
		}
		
		else {
			System.out.printf("APROVADO, nota: %.2f", media);
		}
		
	}
}
