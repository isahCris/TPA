package la�os;
import java.util.Scanner;
public class ano {

	public static void main(String[] args) {
		Scanner  in  =  new Scanner (System.in);
		int i=1;
		int anoA, anoN, idade, idadeV=0, idadeN=0;
		
		do {
			System.out.println("digite o ano em que estamos");
			anoA = in.nextInt();
			System.out.println("digite o ano em que voc� nasceu");
			anoN = in.nextInt();
			idade = anoA-anoN;
			if (i==1) {
				
				idadeV = idade;
				idadeN = idade;
			}else if(idade>idadeV) {
				idadeV= idade;
			}else if (idade<idadeN) {
				idadeN=idade;
			}
			i++;
		} while (i<=10);
		System.out.println("a idade do  mais velho � "+idadeV+" anos");
		System.out.println("a idade do  mais velho � "+idadeN+" anos");
	}
}
