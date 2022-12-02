package futebol;
	import java.util.Scanner;
public class produto {

	public static void main(String[] args) {
		 Scanner  in  =  new Scanner (System.in);
		 int  p ;
         System.out.println ("informe o numero de seu produto");
         p = in.nextInt();
         switch (p) {
              case 1:
                  System.out.println("Descrição:Cachorro quente Valor:R$:8,00");
                  break;
              case 2:
                  System.out.println("Descrição:Cheeseburger   valor:R$12,00");
                  break;
              case 3:
                  System.out.println("Descrição:X-Salada    valor:R$15,00");
                  break;
              case 4:
                  System.out.println("Descrição:Misto quente    valor:R$11,00");
                  break;
              case 5:
                  System.out.println("Descrição:Pão na chapa  valor:R$6,00");
                  break;
              default:
                  System.out.println("Produto invalido");
	}

}
}

