/**
 * Meu primeiro programa Java
 * 
 * Este programa mostra ao aluno que:
 * 1) Um programa Java é construído dentro de um projeto Java.
 * 2) Todo programa Java deve ter uma classe com um método main.
 * 3) Como exibir informações no terminal (console) do Java.
 * 4) Como ler uma string do terminal (console) do Java.
 * 
 */
package firstJavaProject;

import java.util.Scanner;

/**
 * @author danyl
 *
 */
public class Main { 
	public static void main(String[] args) { 
		
		// Saldação e pergunta o nome
		System.out.println("Olá amigo! \nQual é o seu nome?");
		
		// Ler uma string do console usando a biblioteca Scanner
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		String nome = in.nextLine();
		
		// Saldação com o nome.
		System.out.printf("Olá %s!\n", nome);
		
	}

}
