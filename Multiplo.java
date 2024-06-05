package Eclipse;

import java.util.Scanner;

public class Multiplo {

	public static void main (String[] args) {

		Scanner ler = new Scanner (System.in);

		double valor;

		System.out.println("Informe um valor: ");
		valor =ler.nextDouble();

		String multiplo = (valor%5==0) ? "O valor é um múltiplo de 5" : "O valor não é um múltiplo de 5";
		System.out.println(multiplo);


		ler.close();	
	}

}
