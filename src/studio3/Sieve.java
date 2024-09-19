package studio3;

import java.util.Scanner;

public class Sieve {
	public static void main(String[] args) {
	Scanner in = new Scanner (System.in);
	System.out.println("What number do you want to start with?");
	int input = in.nextInt();
	boolean [] sieve = new boolean[input];
	int i = 2;
	for (i = 2; i < input; i++) {
		sieve[i] = true;
	}
	int k =2;
	for (k=2; k < input/2; k++) {
		if(sieve[k]==true) {
			int x = 2;
			for (x=2; x< input/k; x++) {
				int y = x*k;
				sieve[y] = false;
			}
		}
		
	}
	for (int z=0; z<input; z++) {
		if(sieve[z]==true)
		System.out.println(z);
	}
		}
}