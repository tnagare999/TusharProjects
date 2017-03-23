package ConsultAd;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		int fact=1;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter any no:");
		int input = s.nextInt();
		for(int i=1;i<=input;i++) {
			fact = fact*i;
		}
		System.out.println(fact);

	}

}
