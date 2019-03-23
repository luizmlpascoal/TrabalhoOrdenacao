package br.fasam.principal;

public class Ordenacao {

	public static String[] selectionSort(String vetor[])
	{
		for (int i = 0; i <= vetor.length - 2 ; i++) {
			int min = i;
			for(int j = i + 1 ; j <= vetor.length - 1 ; j++)
			{
				if(vetor[j].length() < vetor[min].length())
				{
					min = j;
				}
			}
			
			String t = vetor[min];
			vetor[min] = vetor[i];
			vetor[i] = t;
		}
		
		return vetor;
	}
	
	
	private static void merge(String arr[], int l, int m, int r) 
    { 
        // Find sizes of two subarrays to be merged 
        int n1 = m - l + 1; 
        int n2 = r - m; 
  
        /* Create temp arrays */
        String L[] = new String [n1]; 
        String R[] = new String [n2]; 
  
        /*Copy data to temp arrays*/
        for (int i=0; i<n1; ++i) 
            L[i] = arr[l + i]; 
        for (int j=0; j<n2; ++j) 
            R[j] = arr[m + 1+ j]; 
  
  
        /* Merge the temp arrays */
  
        // Initial indexes of first and second subarrays 
        int i = 0, j = 0; 
  
        // Initial index of merged subarry array 
        int k = l; 
        while (i < n1 && j < n2) 
        { 
            if (L[i].length() <= R[j].length()) 
            { 
                arr[k] = L[i]; 
                i++; 
            } 
            else
            { 
                arr[k] = R[j]; 
                j++; 
            } 
            k++; 
        } 
  
        /* Copy remaining elements of L[] if any */
        while (i < n1) 
        { 
            arr[k] = L[i]; 
            i++; 
            k++; 
        } 
  
        /* Copy remaining elements of R[] if any */
        while (j < n2) 
        { 
            arr[k] = R[j]; 
            j++; 
            k++; 
        } 
    } 
  
    // Main function that sorts arr[l..r] using 
    // merge() 
    public static String[] mergeSort(String arr[], int l, int r) 
    { 
        if (l < r) 
        { 
            // Find the middle point 
            int m = (l+r)/2; 
  
            // Sort first and second halves 
            mergeSort(arr, l, m); 
            mergeSort(arr , m+1, r); 
  
            // Merge the sorted halves 
            merge(arr, l, m, r); 
        } 
        
        return arr;
    } 
  
    /* A utility function to print array of size n */
    
	
	
	
	
	
	
}
