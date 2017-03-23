package ConsultAd;

public class Fibonacci {

	public static void main(String[] args) {
		int total = 15;
		int no1=0;
		int no2=1,no3;
		System.out.print(no1+" "+no2);
		for(int i=2;i<=total;i++){
				
				no3 = no1+no2;
				System.out.print(" "+no3);
				no1=no2;
				no2=no3;
		}
	}
}
