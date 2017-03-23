package ConsultAd;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		int no;
		System.out.println("Enter any no:");
		Scanner s = new Scanner(System.in);
		no = s.nextInt();		
		int temp = no;
		int rev = 0;
		int rem = 0;		
		while(temp>0) {
			rev = temp%10;
			temp = temp/10;
			rem = rem * 10 + rev;
		}
			if(no == rem) {
				System.out.println("No is palindrome");
			}
			else {
				System.out.println("Not palindrome");
			}
	}

}
