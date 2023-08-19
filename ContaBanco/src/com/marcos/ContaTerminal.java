package com.marcos;

import java.util.Scanner;

public class ContaTerminal {

	public static void main(String[] args) {
		final String MENSAGEM = "Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo %.2f já está disponível para saque";
		final Scanner entrada = new Scanner(System.in);
		
		int numero = 0;
		String agencia = "";
		String nome = "";
		double saldo = 0D;
		
		try {
			System.out.print("Por favor, insira o seu nome completo: ");
			nome = entrada.nextLine();
			
			System.out.print("Por favor, digite o número da agencia: ");
			numero = entrada.nextInt();
			
			System.out.print("Por favor, digite a agencia: ");
			agencia = entrada.next();
			
			System.out.print("Por favor, digite a saldo: ");
			saldo = entrada.nextDouble();
			
			System.out.format(MENSAGEM, nome, agencia, numero, saldo);
		} catch (Exception ex) {
			System.out.println("Ocorreu um erro! \n" + ex.getMessage());
		} finally {
			System.out.println("Fechando sistema...");
			entrada.close();
		}
	}
}