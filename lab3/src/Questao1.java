import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Questao1 {

	public static void selectionSort(int[] array, int n) {
		
		  for (int i = 0; i < n; i++) {
		    int menor = i;

		    for (int j = menor + 1; j < array.length; j++) {
		       if (array[j] < array[menor]) {
		          menor = j;
		       }
		    }
		    if (menor != i) {
		      int aux = array[i];
		      array[i] = array[menor];
		      array[menor] = aux;
		    }
		    
		    System.out.println(Arrays.toString(array));
		  }
	}

	public static void main (String[] args) {
		
		Scanner sc = new Scanner(System.in);
		try {
			int m = sc.nextInt();
			int n = sc.nextInt();
			
			if(n>m) {
				throw new IOException(); 
			}
			
			int[] array = new int[m];
			
			for(int i = 0; i < m; i++) {
				array[i] = sc.nextInt();
			}
			
			selectionSort(array, n);

		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			sc.close();
		}
	}
}
