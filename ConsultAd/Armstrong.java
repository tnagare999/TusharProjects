package ConsultAd;

import java.util.Scanner;

public class Armstrong {

	public static void main(String[] args) {
		int no;
		System.out.println("Enter any no:");
		Scanner s = new Scanner(System.in);
		no = s.nextInt();		
		int temp = no;
		int rev = 0;
		int rem = 0;	
		int total = 0;
		while(temp>0) {
			rem = temp%10;
			rev= rem * rem *rem;
			total+=rev;
			temp = temp/10;
			
			
		}
			if(no == total) {
				System.out.println("It is Armstrong");
			}
			else {
				System.out.println("Not Armstrong");
			}
	}

	}


