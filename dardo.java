package complementares2;

import java.util.Scanner;

public class dardo {

	public static void main(String[] args) {
		
		/*No arremesso de dardo, o atleta tem três chances para lançar o dardo à maior
		 * distância que conseguir. Você deve criar um programa para, dadas as medidas
		 *  das três tentativas de lançamento, informar qual foi a maior.
		 */
		
		Scanner sc = new Scanner (System.in);
		
		double t1, t2, t3;
		
		System.out.println("Distância da tentativa 1: ");
		t1 = sc.nextDouble();
		
		System.out.println("Distância da tentativa 2: ");
		t2 = sc.nextDouble();
		
		System.out.println("Distância da tentativa 3: ");
		t3 = sc.nextDouble();
		
		if (t1 > t2 && t1 < t3) {
			System.out.println("A maior distância foi de: " + t1);
		}
		
		else if (t2 > t1 && t2 > t3) {
			System.out.println("A maior distância foi de: " + t2);
		}
		
		else {
			System.out.println("A maior distância foi de: " + t3);
		}
	}

}
