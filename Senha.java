package Eclipse;

import java.util.Scanner;

public class Senha {

	public static void main(String[] args) {

		int senhaMestre, senhaTentativa;
		double num1,num2,soma;

		Scanner ler = new Scanner (System.in);

		System.out.println("Cadastre uma senha mestre (Apenas números): ");
		senhaMestre=ler.nextInt();
		
		System.out.println("Insira 2 números (pressione enter para o próximo): ");
		num1=ler.nextDouble();
		num2=ler.nextDouble();
		
		soma = num1+num2;
	
		System.out.println("Digite a sua senha para desbloquear");
		senhaTentativa=ler.nextInt();

		String mensagem = (senhaMestre==senhaTentativa)? "O resultado da soma é: "+soma : "Erro! Senha errada.";
		System.out.println(mensagem);

		ler.close();

	}

}
