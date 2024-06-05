package Eclipse;

import java.util.Scanner;

public class Juntavetores {

	public static void main(String[] args) {

		Scanner ler = new Scanner (System.in);

		int a[] = new int [2];
		int b[] = new int [2];
		int c[] = new int [4];

		for(int i=0; i<2;i++) {

			System.out.println("informe o " +i+" ° valor: ");
			a[i] = ler.nextInt();

			c[i]=a[i]; 
		}
		for (int i=0; i<2;i++) {

			System.out.println("Informe o "+i+" ° valor: ");
			b[i] = ler.nextInt();

			c[i+2]=b[i];

		}

		for (int i=0; i<4; i++) {
			System.out.println("Os valores são: "+c[i]);
		}

		ler.close();
	}

}