package classicos;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		int num, proximo=1, anterior=1, soma;
		System.out.println("digite a posi��o que deseja saber a posi��o do fibonacci:");
		num = in.nextInt();
		for(int i=0; i<num; i++) {
			soma = anterior+proximo;
		    anterior = proximo;
		    proximo = soma;
		}
		System.out.println("fibonacci de " +num+ " " +anterior+".");

 }
}
