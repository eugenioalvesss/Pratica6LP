package Exe1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class ManipuladorArquivo {
		
	public static void leitor(String path) throws IOException {
		BufferedReader buffRead = new BufferedReader(new FileReader(path));
		String linha = "";
		while (true) {
			if (linha != null) {
				System.out.println(linha);

			} else
				break;
			linha = buffRead.readLine();
		}
		buffRead.close();
	}

	public static void escritor(String path) throws IOException {
		BufferedWriter escrever = new BufferedWriter(new FileWriter(path));

		Scanner entrada = new Scanner (System.in);
		
		String  tituloProjeto, objetivoProjeto, enderecoProjeto,
		datainicioProjeto, statusProjeto;
		
		ArrayList<String> ProjetoSocial = new ArrayList<>();
		
		System.out.println("Insira o t�tulo:");
		tituloProjeto = entrada.next();
		System.out.println("Insira o objetivo:");
		objetivoProjeto = entrada.next();
		System.out.println("Insira o endereco:");
		enderecoProjeto = entrada.next();
		System.out.println("Insira a data de in�cio:");
		datainicioProjeto = entrada.next();
		System.out.println("Insira o status:");
		statusProjeto = entrada.next();
		
		ProjetoSocial.add("T�tulo: "+tituloProjeto+ " Objetivo: "+objetivoProjeto+ " Endere�o: "
		+enderecoProjeto+ " Data in�cio: "+datainicioProjeto+ " Status" +statusProjeto );
		System.out.println(ProjetoSocial.toString());
		
		escrever.append(ProjetoSocial + "\n");
		escrever.close();
		System.out.println("Criado com sucesso");
		
	}
}