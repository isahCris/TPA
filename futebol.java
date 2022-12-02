package futebol;
	import java.util.Scanner;
public class futebol {

	public static void main(String[] args) {
		 Scanner  in  =  new Scanner (System.in);
         int  i;
         System.out.println ("informe sua idade");
          i = in.nextInt();
          switch (i) {
              case 6:
                  System.out.println("dente de leite");
                  break;
              case 7:
                  System.out.println("Junior");
                  break;
              case 8:
                  System.out.println("Junior max");
                  break;
              case 9:
                  System.out.println("Junior master");
                  break;
              case 10:
                  System.out.println("master");
                  break;
              default:
                  System.out.println("escola não admite alunos na sua idade");
   }

	}
		}
