package Exe1;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class PrincipalArquivo {

	public static void main(String[] args) throws IOException {
		
		Scanner entrada = new Scanner (System.in);
		int opcao = 0, menu;
		
		String nomeArquivo = "";
		
		String caminhoArquivo;
		
		do {
		System.out.println("---- Seleciona uma das op��es abaixo ----");
		System.out.println("(1) Definir caminho e nome de Arquivo TXT para grava��o ");
		System.out.println("(2) Cadastrar Projeto ");
		System.out.println("(3) Abrir Arquivo do Projeto ");
		System.out.println("(4)Sair ");
		
		
		menu = entrada.nextInt();
		
		switch(menu)	{
		case 1:
			System.out.println("Insira o nome do arquivo:");
			nomeArquivo = entrada.next();
			System.out.println("Defina o caminho onde deseja salvar o projeto:");
			caminhoArquivo = entrada.next();
			
		break;
		
		case 2:	
			ManipuladorArquivo.escritor(nomeArquivo);
			
		break;
		case 3:
			ManipuladorArquivo.leitor(nomeArquivo);
		break;
		
		case 4:
			
		break;
		
		default:
		      System.out.println("Op��o Inv�lida. Tente novamente!");
		}
		    
		} while (opcao != 4);
		}
}

