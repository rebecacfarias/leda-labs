package lab2;

/*
 * Problema Ordenação da Rita
 * */

import java.util.Arrays;
import java.util.Scanner;

public class Questao3 {

	public static void main(String[] args) {
		int[] numbers = new int[3];
		boolean cresc = false;
		boolean hasNegative = false;
		Scanner sc = new Scanner(System.in);
		for(int i = 0; i<3; i++) {
			numbers[i] = sc.nextInt();
			if(i==0) {
				if(numbers[i]%2!=0) {
					cresc = true;
				}
			}
			if(numbers[i]<0) {
				hasNegative = true;
			}
		}
		
		Arrays.sort(numbers);
		
		if(hasNegative) {
			System.out.println("Ordenacao cancelada.");
		}else {
			if(cresc) {
				for(int i = 0; i<3; i++) {
					System.out.println(numbers[i]);
				}
			}else {
				for(int i=2; i>=0; i--) {
					System.out.println(numbers[i]);
				}
			}	
		}
		
		
		sc.close();
	}

}
