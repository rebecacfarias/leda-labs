import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Questao2 {

	public static void bubbleSort(int[] array, int n) {
		int aux;

		for (int i = 0; i < n; i++) {
			for (int j = 1; j < (array.length - i); j++) {
				if (array[j - 1] > array[j]) {
					aux = array[j - 1];
					array[j - 1] = array[j];
					array[j] = aux;
				}
			}	
			System.out.println(Arrays.toString(array));
		}
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		try {
			int m = sc.nextInt();
			int n = sc.nextInt();

			if (n > m) {
				throw new IOException();
			}

			int[] array = new int[m];

			for (int i = 0; i < m; i++) {
				array[i] = sc.nextInt();
			}

			bubbleSort(array, n);

		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			sc.close();
		}
	}
}
