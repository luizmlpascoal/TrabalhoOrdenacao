package br.fasam.principal;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ArquivoHandler {

	public static String[] lerArquivo(String dic) {

		String path = "";

		if (dic.equalsIgnoreCase("ingles"))
			path = "C:\\Users\\Luiz Mario\\git\\TrabalhoOrdenacaoDev2\\TrabalhoOrdenacao\\files";
		else if (dic.equalsIgnoreCase("espanhol"))
			path = "C:\\Users\\Luiz Mario\\git\\TrabalhoOrdenacaoDev2\\TrabalhoOrdenacao\\files\\Spanish.txt";
		else
			path = "./files/Portuguese.txt";

		try {
			FileReader arq = new FileReader(path);
			BufferedReader lerArq = new BufferedReader(arq);

			String linha = lerArq.readLine(); // l� a primeira linha
			// a vari�vel "linha" recebe o valor "null" quando o processo
			// de repeti��o atingir o final do arquivo texto

			String[] vetor = new String[Integer.parseInt(linha)];
			int i = 0;
			while (linha != null) {

				if (i < vetor.length) {
					vetor[i] = linha;
					i++;
				}
				
				linha = lerArq.readLine();

				// l� da segunda at� a �ltima linha
			}

			arq.close();

			return vetor;
		} catch (IOException e) {
			System.err.printf("Erro na abertura do arquivo: %s.\n", e.getMessage());
		}

		return null;
	}
}
