/**
 * Meu primeiro programa Java
 * 
 * Este programa mostra ao aluno que:
 * 1) Um programa Java � constru�do dentro de um projeto Java.
 * 2) Todo programa Java deve ter uma classe com um m�todo main.
 * 3) Como exibir informa��es no terminal (console) do Java.
 * 4) Como ler uma string do terminal (console) do Java.
 * 
 */
package firstJavaProject;

import java.util.Scanner;

/**
 * @author danyl
 *
 */
public class Main { // Classe que cont�m o m�todo principal.
	public static void main(String[] args) { // Este � o m�todo principal.
		
		System.out.println("Ol� amigo! \nQual � o seu nome?");
		
		// Ler uma string do console usando a biblioteca Scanner
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		String nome = in.nextLine();
		
		// Exibir uma string usando printf.
		System.out.printf("Ol� %s!", nome);
		
	}

}
