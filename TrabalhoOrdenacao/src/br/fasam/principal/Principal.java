package br.fasam.principal;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String vetor[] = ArquivoHandler.lerArquivo("espanhol");
		
		System.out.println(vetor.length);
		
		long tempoInicial = System.currentTimeMillis(); 
		String vetorOrdenado[] = Ordenacao.mergeSort(vetor, 0, vetor.length-1);
		long tempoFinal = System.currentTimeMillis(); 
		
		long tempo = tempoFinal - tempoInicial;
		
		
		printArray(vetorOrdenado);
		System.out.println("Tempo para ordenar: " + tempo + " ms");
		
		
		String palavra = "decorrerse";
		
		int pos = Busca.buscaSequencial(vetor, palavra);
		int posOrd = Busca.buscaSequencial(vetorOrdenado, palavra);
		if(pos == -1)
		{
			System.out.println(palavra + " N�o Encontrada");
		}
		else
		{
			System.out.println(palavra + " est� na posi��o : " + pos + " no Vetor Original");
			System.out.println(palavra + " est� na posi��o : " + posOrd + " no Vetor Ordenado.");
		}
	}
	
	static void printArray(String arr[]) 
    { 
        int n = arr.length; 
        for (int i=0; i<n; ++i) 
            System.out.println(arr[i] + " tamanho: " + arr[i].length()); 
        System.out.println(); 
    } 

}
