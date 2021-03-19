package lab2;
/*
 * Problema Ordenação de Matrizes
 * 
 * */

import java.util.Scanner;

public class Questao2 {
	public static void order(int[] array) {
		int aux, j;
		for(int i = 1; i<array.length; i++) {
			aux = array[i];
			j = i-1;
			while(j>-1 && array[j]>aux) {
				array[j+1] = array[j];
				j--;
			}
			array[j+1] = aux;
		}
	}
	
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[] array = new int[n*m];
		int[][] matriz = new int[n][m];
		
		for(int i = 0; i<n*m; i++) {
			array[i] = sc.nextInt();
		}
		
		order(array);

		int count = 0;
		for(int i = 0; i< n; i++) {
			for(int j = 0; j<m; j++) {
				matriz[i][j] = array[count];
				count++;
			}
		}
		
		int j;
		for(int i = 0; i< n; i++) {
			System.out.println("");

			for(j = 0; j<m-1; j++) {
				System.out.print(matriz[i][j]+" ");
			}
			System.out.print(matriz[i][j]);
		}
		
		sc.close();
	}
}
