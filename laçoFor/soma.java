package la�os;
import java.util.Scanner;
public class Soma {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int a=0, i;
		for (i=1;i<=500;i=i+2) {
			
			if (i %3 == 0) {
				
			a = a+i;
			System.out.println(+a);
			}
		}


	}

}
