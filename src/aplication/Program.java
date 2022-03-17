package aplication;

import java.util.Locale;
import java.util.Scanner;

import entities.Conta;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		Conta conta;
		
		System.out.println("Entre com o Número da conta: ");
		int numeroDaConta = sc.nextInt();
		
		System.out.println("Entre com o TITULAR: ");
		sc.nextLine();
		String titularDaConta = sc.nextLine();
		
		System.out.println("Tem depósito inicial? (S/N) ");
		char resposta = sc.next().charAt(0);
		
		if (resposta == 's' ) {
			System.out.println("Entre com o valor do depósito: ");
			double valorInicialDeposito = sc.nextDouble();
			conta = new Conta(numeroDaConta, titularDaConta, valorInicialDeposito);
		}
		else {
			conta = new Conta(numeroDaConta, titularDaConta);
		}
		
		System.out.println("");
		System.out.println("Dados da conta: ");
		System.out.println(conta);
		
		
		sc.close();
		
	}

}
