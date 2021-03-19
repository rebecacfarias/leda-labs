package lab2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
/*
 * Problema 3n+1
 * 
 * */
public class Questao1 {
	public static int sequenceSize(int num) {
		int aux = num, count = 1;
		while(aux>1){
			//System.out.print(aux+" ");
			if(aux%2 == 0) {
				aux = aux/2;
			}else{
				aux = aux*3 +1;
			}

			count++;
		}
		
		return count;
	}
	
	public static int findBigger(int i, int j) {	
		int maior = sequenceSize(i);
		for(int c = i; c<=j; c++) {
			if(sequenceSize(c)>maior) {
				maior = sequenceSize(c);
			}
		}
		
		return maior;
	}
	
	public static void main(String[] args) throws NumberFormatException, IOException {

		List<Integer> output = new ArrayList<>();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Integer i,j;
		String integers;	
		while((integers = br.readLine()) != null && !integers.trim().equals("\r") && !integers.trim().equals("")) {

			String[] valores = integers.split("\\s+");
						
			i = Integer.parseInt(valores[0]);
			j = Integer.parseInt(valores[1]);

			
			if(i<1 || i>=1000000 || j<1 || j>=1000000) break;
			
			output.add(i);
			output.add(j);
			
			if(i<j) {
				output.add(findBigger(i, j));
			}else {
				output.add(findBigger(j, i));
			}
		}
		
		int count = 1;
		
		for(Integer num : output) {
			if(count==3) {
				System.out.println(num);
				count = 0;
			}else {
				System.out.print(num+" ");
			}
			count++;

		}
		
		br.close();

	}
}
