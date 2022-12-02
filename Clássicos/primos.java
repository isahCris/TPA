package classicos;

import java.util.Scanner;

public class Primos {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		int num;
		System.out.println("digite um numero inteiro, para saber se � primo ou n�o:");
		num = in.nextInt();
		if(num % num == 1  && num % 1 == num ){
			System.out.println("n�mero � primo");
		}else {
			System.out.println("n�mero n�o � primo");
		}
		}

 }
