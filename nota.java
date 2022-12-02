pacote futebol;

java de importação. util. Scanner;

nota de classe pública {

	public static void main(String[] args) {
		 Scanner ler = novo Scanner (Sistema. em);
		
		int a, mb, b, r, i, media, n;
		
		Sistema. fora. println("Digite o numero de alunos na sala");
		a = ler. nextInt();
		Sistema. fora. println("Digite o numero de alunos que tiraram MB");
		mb = ler. nextInt();
		Sistema. fora. println("Digite o numero de alunos que tiraram B");
		b = ler. nextInt();
		Sistema. fora. println("Digite o numero de alunos que tiraram R");
		r = ler. nextInt();
		Sistema. fora. println("Digite o numero de alunos que tiraram I");
		i = ler. nextInt();
		Sistema. fora. println("1= MB 2= B 3= R = I");
		Sistema. fora. println("Escolha um numero");
		n = ler. nextInt();
		switch (n) {
			Caso 1:
				mídia = (mb*100)/a;
				Sistema. fora. println(media+"% dos seus alunos tiraram MB");
				quebrar;
			Caso 2:
				mídia = (b*100)/a;
				Sistema. fora. println(media+"% dos seus alunos tiraram B");
				quebrar;
			Caso 3:
				mídia = (r*100)/a;
				Sistema. fora. println(media+"% dos seus alunos tiraram R");
				quebrar;
			Caso 4:
				mídia = (i*100)/a;
				Sistema. fora. println(media+"% dos seus alunos tiraram I");
				quebrar;
			padrão:
				Sistema. fora. println("Nota Invalida");
			}
		ler. fechar();
	

	}

}
