package ConsultAd;

public class Pyramid {

	public static void main(String[] args) {
		int i,j,k;
		int cnt=1;
		for(i=5;i>0;i--) {
			for(j=1;j<=i;j++) {
				System.out.print(" ");
			}	
			for(k=1;k<=cnt;k++) {
	            System.out.print(k+" ");
	        }
	       System.out.println();
	        cnt++;
		}

	}

}
