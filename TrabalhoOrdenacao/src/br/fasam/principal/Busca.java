package br.fasam.principal;

public class Busca {
	
	public static int buscaSequencial(String[] vetor, String x)
	{
		for (int i = 0; i < vetor.length; i++) {
			if (vetor[i].equalsIgnoreCase(x))
				return i;
		}
		return -1;
	}

}
