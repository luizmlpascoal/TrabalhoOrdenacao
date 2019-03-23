package br.fasam.principal;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ArquivoHandler {

	public static String[] lerArquivo(String dic) {

		String path = "";

		if (dic.equalsIgnoreCase("ingles"))
			path = "./files/English.txt";
		else if (dic.equalsIgnoreCase("espanhol"))
			path = "./files/Spanish.txt";
		else
			path = "./files/Portuguese.txt";

		try {
			FileReader arq = new FileReader(path);
			BufferedReader lerArq = new BufferedReader(arq);

			String linha = lerArq.readLine(); // lê a primeira linha
			// a variável "linha" recebe o valor "null" quando o processo
			// de repetição atingir o final do arquivo texto

			String[] vetor = new String[Integer.parseInt(linha)];
			int i = 0;
			while (linha != null) {

				if (i < vetor.length) {
					vetor[i] = linha;
					i++;
				}
				
				linha = lerArq.readLine();

				// lê da segunda até a última linha
			}

			arq.close();

			return vetor;
		} catch (IOException e) {
			System.err.printf("Erro na abertura do arquivo: %s.\n", e.getMessage());
		}

		return null;
	}
}
