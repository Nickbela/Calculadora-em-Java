package com.java.operadores;

import java.util.Scanner; //pode declarar tbm só import Scanner;

public class Operador {
	
	public static void main(String[] args) {
		
		
		/*para auxiliar no system.in para pegar informações é chamada a classe scanner 
		 * e no construtor do objeto(entre parenteses) coloca o comando, neste caso system.in*/ 
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Qual seu nome?");
		
		//solicita um string
		//nextLine -> lê a linha toda // next() -> lê somente a primeira palavra
		String nome = sc.nextLine();
		
		System.out.println("Bem vindo a calculadora em Java " + nome);
		
		System.out.println("Q operação deseja realizar?");
		
		System.out.println("1 - adição \n2 - subtração\n3 - multiplicação\n4 - divisão");
		
		int respMenu = sc.nextInt();
		
		System.out.println("Digite o primeiro número");
		
		//solicita ao user um numero
		
		int x = sc.nextInt();
		
		System.out.println("Agr o segundo");
		
		int y = sc.nextInt();
		
		int respostaFinal = 0;
		
		switch(respMenu) {
		case 1:
			respostaFinal = x + y;
			break;
		case 2:
			respostaFinal = x - y;
			break;
		case 3:
			respostaFinal = x * y;
			break;
		case 4:
			if(x == 0 || y == 0) {
				System.out.println("Não pode realizar divisão por 0");
			}else {
				respostaFinal = x / y;
			}
			break;
		default:
			System.out.println("Resposta inválida");
		}

		System.out.println("O resultado da conta é " + respostaFinal);
		
	}

}
