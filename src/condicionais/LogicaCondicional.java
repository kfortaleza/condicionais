package condicionais;

import java.util.Scanner;

public class LogicaCondicional {

	public static void main(String[] args) {
		
		// Variáveis
		int idade;
		String email;
		String nomeDoUsuario;
		
		// Scanner que será usado para capturar o que o usuário digitou
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Qual a sua idade?");
		
		idade = sc.nextInt();
		
		// Verificar se o usuário é maior ou menor de idade
		if (idade >= 18) {
			System.out.println("Você é maior de idade!");
		} else {
			System.out.println("Você é menor de idade!");
		}
		
		// Verificar e-mail
		System.out.println("");
		System.out.println("-------------------------------");
		System.out.println("");
		System.out.println("Qual o seu e-mail?");
		email = sc.next();
		
		if (email.contains("@")) {
			System.out.println("Seu e-mail é válido.");
		} else {
			System.out.println("Seu e-mail é inválido.");
		}
	}

}
