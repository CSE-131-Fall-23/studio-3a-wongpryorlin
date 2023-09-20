package studio3;

import java.util.Scanner;

public class Sieve {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);
		System.out.println("Find all the prime numbers up to: ");
		int n = in.nextInt();
		
		boolean[] array = new boolean[n];
		
		for (int j=0; j <= n-2; j++) {array[j]=true;}
		
		for (int i = 2; i <= n; i++ ) {
			
			if (array[i-2] == true) {
				
				for (int k = 2; k <= (n/i); k++) {
					array[k * i - 2] = false;
										
					
				}
				System.out.println(i);

			
			
			
			}
			
			
			
		}
	
	
	
	
	}

}
